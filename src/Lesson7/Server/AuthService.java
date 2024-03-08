package Lesson7.Server;

import java.util.Optional;

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
    Optional<String> getNickByLoginAndPass(String login, String pass);

}
