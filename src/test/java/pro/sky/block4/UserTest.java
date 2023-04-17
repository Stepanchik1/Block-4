package pro.sky.block4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.FormatterClosedException;

public class UserTest {
    private final User out = new User("@login.ru", "password");

    private final User out2 = new User();

    @Test
    public void ShouldReturnDefaultMessageIfLoginDoNotSetAfterObjectCreating() {
        Assertions.assertEquals("@login.ru", out.login);
    }

    @Test
    public void ShouldReturnDefaultMessageIfPasswordDoNotSetAfterObjectCreating() {
        Assertions.assertEquals("password", out.password);
    }

    @Test
    public void ShouldReturnSuccessMessageIfEmptyObjectIsCreated() {
        Assertions.assertNotNull(out2);
    }

    @Test
    public void ShouldReturnSuccessMessageIfPasswordInEmptyObjectIsNull() {
        Assertions.assertNull(out2.password);
    }

    @Test
    public void ShouldReturnSuccessMessageIfLoginInEmptyObjectIsNull() {
        Assertions.assertNull(out2.login);
    }

    @Test
    public void ShouldReturnDefaultMessageIfObjectWithNonValidPasswordIsCreated() {
        Assertions.assertThrows(FormatterClosedException.class, (() -> new User("notValid", "password")));
    }

    @Test
    public void ShouldReturnDefaultMessageIfObjectWithNonValidLoginIsCreated() {
        Assertions.assertThrows(FormatterClosedException.class, (() -> new User("@password.ru", "@password.ru")));
    }

    @Test
    public void ShouldReturnSuccessMessageIfLoginContainsPointandAt() {
        String notValidLogin = "login";
        Assertions.assertThrows(FormatterClosedException.class, (() -> out.checkLogin(notValidLogin)));
    }

    @Test
    public void ShouldReturnSuccessMessageIfLoginAndPasswordAreNotEquals() {
        String login = "1@1.1";
        String password = "1@1.1";
        Assertions.assertThrows(FormatterClosedException.class, (() -> out.checkPasswordAndLogin(login, password)));
    }
}
