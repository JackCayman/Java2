package Lesson7.Server;

import Lesson7.Constants.Constants;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Логика сервера.
 */

public class Myserver {

    /**
     * Сервис аутентификации
     */
    private AuthService authService;
    /**
     * Активные клиенты
     */
    private List<ClientHandler> clients;

    public AuthService getAuthService() {
        return authService;
    }

    public Myserver() {
        try (ServerSocket server = new ServerSocket(Constants.SERVER_PORT)) {
            authService = new BaseAutService();
            authService.start();

            clients = new ArrayList<>();

            while (true) {
                System.out.println("Серве ожидает подклучение");
                Socket socket = server.accept();
                System.out.println("Клиент подключился");
                new ClientHandler(this, socket);
            }

        } catch (IOException ex) {
            System.out.println("Ошибка  в работесервера");
            ex.printStackTrace();
        } finally {
            if (authService != null) {
                authService.stop();
            }
        }
    }

    public synchronized void broadcastMessage(String message) {
        clients.forEach(client -> client.sendMessage(message));
        /*for (ClientHandler client : clients) {
            client.sendMessage(message);
        }*/
    }

    public synchronized void subscribe(ClientHandler client) {
        clients.add(client);
    }

    public synchronized void unSubscribe(ClientHandler client) {
        clients.remove(client);
    }

    public synchronized String getActivClients() {
        StringBuilder sb = new StringBuilder(Constants.CLIENTS_LIST_COMMAND).append(" ");
        sb.append(clients.stream()
                .map(c -> c.getName())
                .collect(Collectors.joining(" "))
        );
        /*for (ClientHandler client : clients) {
            sb.append(client.getName()).append(" ");
        }*/
        return sb.toString();
    }
}
