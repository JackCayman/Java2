package Lesson7.Server;

/**
 * Сервис аутентификации
 */
public interface AuthService {
    /**
     * Запустить сервис
     */
    void start();

    /**
     * Отключить сервис
     */
    void stop();

    /**
     * Получить ник по логину\ паролю
     *
     * @return ник еслинайденили nuul, еслитакого нет
     */
    String getNickByLoginAndPass(String login, String pass);

}
