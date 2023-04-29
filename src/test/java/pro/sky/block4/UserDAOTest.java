package pro.sky.block4;

import jakarta.annotation.PostConstruct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class UserDAOTest {

    @Mock
    UserDAO userDAO = new UserDAO();

    @Test
    public void ShouldReturnSuccessMessageIfUserIsFindByName() {
        User user = new User("User");
        userDAO.userList().add(user);
        Assertions.assertEquals(userDAO.findUser("   user    "), user);
    }

    @Test
    public void ShouldReturnSuccessMessageIfNullIsFindByInvalidName() {
        User user = new User("User");
        userDAO.userList().add(user);
        Assertions.assertNull(userDAO.findUser("   non-user    "));
    }
}
