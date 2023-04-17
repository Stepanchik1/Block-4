package pro.sky.block4;

import java.util.FormatterClosedException;

public class User {
    String login;
    String password;

    public User(String login, String password) {
        checkLogin(login);
        checkPasswordAndLogin(login, password);
        this.login = login;
        this.password = password;
    }

    public void checkLogin(String login) {
        if (!login.contains("@") || !login.contains(".")) {
            System.out.println("Некорректный формат логина");
            throw new FormatterClosedException();
        }
    }

    public void checkPasswordAndLogin(String login, String password) {
        if (login.equals(password)) {
            System.out.println("Логин и пароль не должны быть равны");
            throw new FormatterClosedException();
        }
    }


    public User() {
    }
}
