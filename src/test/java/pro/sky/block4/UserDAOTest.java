package pro.sky.block4;

import jakarta.annotation.PostConstruct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDAOTest {

    User user = new User("User");

    @Test
    public void ShouldReturnSuccessMessageIfUserIsFindByName () {
        UserDAO.addUser(user);
        Assertions.assertEquals(UserDAO.findUser("   user    "), user);
    }

    @Test
    public void ShouldReturnSuccessMessageIfNullIsFindByInvalidName () {
        Assertions.assertNull(UserDAO.findUser("   non-user    "));
    }
}
