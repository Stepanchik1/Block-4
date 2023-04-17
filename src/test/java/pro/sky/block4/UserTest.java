package pro.sky.block4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.FormatterClosedException;

public class UserTest {
    private final User out = new User("login", "password");

    private final User out2 = new User();

    @Test
    public void ShouldReturnDefaultMessageIfLoginDoNotSetAfterObjectCreating () {
        Assertions.assertEquals("login", out.login);
    }

    @Test
    public void ShouldReturnDefaultMessageIfPasswordDoNotSetAfterObjectCreating () {
        Assertions.assertEquals("password", out.password);
    }

    @Test
    public void ShouldReturnSuccessMessageIfLoginIsNotNull () {
        Assertions.assertNotNull(out2.login);
    }

    @Test
    public void ShouldReturnSuccessMessageIfPasswordIsNotNull () {
        Assertions.assertNotNull(out2.password);
    }

  //   Assertions.assertThrows (FormatterClosedException.class, (User user = new User("NotValidLogin", "password"));} // не знаю как консруктор перевести в лямбду
    @Test
    public void ShouldReturnSuccessMessageIfLoginContainsPointandAt () {
        String notValidLogin = "login";
        Assertions.assertThrows (FormatterClosedException.class, (() -> out.checkLogin(notValidLogin)));
    }

    @Test
    public void ShouldReturnSuccessMessageIfLoginAndPasswordAreNotEquals () {
        String login = "1@1.1";
        String password = "1@1.1";
        Assertions.assertThrows (FormatterClosedException.class, (() -> out.checkPasswordAndLogin(login, password)));
    }
}
