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
        Assertions.assertEquals(userDAO.findUser("   user    "), userDAO.user);
    }

    @Test
    public void ShouldReturnSuccessMessageIfNullIsFindByInvalidName() {
        Assertions.assertNull(userDAO.findUser("   non-user    "));
    }
}
