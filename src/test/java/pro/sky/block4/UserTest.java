package pro.sky.block4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    private final User out = new User("login", "password");

    @Test
    public void ShouldReturnDefaultMessageIfDataDoNotSetAfterObjectCreating () {
        boolean result = out.login.equals("login")&&out.password.equals("password");
        Assertions.assertTrue(result);
    }

    @Test
    public void ShouldReturnSuccessMessageIfObjectIsCreated () {
        Assertions.assertNotNull(out);
    }

    @Test
    public void ShouldReturnSuccessMessageIfLoginContainsPointandAt () {
        boolean result = out.login.contains("@")&&out.login.contains(".");
        Assertions.assertTrue(result);
    }

    @Test
    public void ShouldReturnSuccessMessageIfLoginAndPasswordAreNotEquals () {
        Assertions.assertNotEquals(out.login, out.password);
    }
}
