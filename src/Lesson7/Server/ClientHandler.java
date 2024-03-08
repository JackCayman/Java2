package Lesson7.Server;

import Lesson7.Constants.Constants;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Optional;

/**
 * Обработчик для  конкретного клиента
 */
public class ClientHandler {

    private final Myserver server;
    private final Socket socket;
    private final DataInputStream in;
    private final DataOutputStream out;
    private String name;

    public String getName() {
        return name;
    }

    public ClientHandler(Myserver server, Socket socket) {
        try {
            this.server = server;
            this.socket = socket;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());

            new Thread(() -> {
                try {
                    authentication();
                    readMessage();

                } catch (IOException ex) {
                    ex.printStackTrace();
                } finally {
                    closeConnection();
                }
            }).start();
        } catch (IOException ex) {
            throw new RuntimeException("Проблемы при создании обработчика");
        }
    }

    //auth login pass
    private void authentication() throws IOException {
        while (true) {
            String str = in.readUTF();
            // if (str.startsWith(Constants.AUTH_COMMAND)) ;
            String[] tokens = str.split("\\s+");
            Optional<String> nick = server.getAuthService().getNickByLoginAndPass(tokens[1], tokens[2]);

            if (nick.isPresent()) {
                // дописать проверку что такого ника нет вв чате(пользователь уже авторизован)
                //авторизовались
                name = nick.get();
                sendMessage(Constants.AUTH_OK_KOMAND + " " + nick);
                server.broadcastMessage(nick + " " + "вошёл в чат");
                server.broadcastMessage(server.getActivClients());
                server.subscribe(this);
                return;
            } else {
                sendMessage("Не верные логин/пароль");
            }
        }
    }

    public void sendMessage(String message) {
        try {
            out.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readMessage() throws IOException {
        while (true) {
            String messageFromClient = in.readUTF();
            //hint: можем получать команды
            //
            if (messageFromClient.startsWith(Constants.CLIENTS_LIST_COMMAND)) {
                sendMessage(server.getActivClients());
            } else {

                System.out.println("Сообщениеот " + name + " " + messageFromClient);
                if (messageFromClient.equals(Constants.END_COMMAND)) {
                    break;
                }
                server.broadcastMessage(name + ": " + messageFromClient);
            }
        }
    }

    private void closeConnection() {
        server.unSubscribe(this);
        server.broadcastMessage(name + " вышел из чата");
        try {
            in.close();
        } catch (IOException ex) {
            //ignore
        }
        try {
            out.close();
        } catch (IOException ex) {
            //ignore
        }
        try {
            socket.close();
        } catch (IOException ex) {
            //  ignore
        }
    }

}
