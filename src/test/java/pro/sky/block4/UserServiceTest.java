package pro.sky.block4;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDAO userDAO;

    @InjectMocks
    private UserService userService;

    @Test
    public void ShouldReturnSuccessMessageIfUserDAOContainsUser() {
        when(userService.checkUser(userDAO, userDAO.user)).thenReturn(true);
        System.out.println(userService.checkUser(userDAO, userDAO.user));
    }

    @Test
    public void ShouldReturnSuccessMessageIfUserDAODoNotContainsInvalidUser() {
        User user2 = new User("Not valid User");
        when(userService.checkUser(userDAO, user2)).thenReturn(false);
        System.out.println(userService.checkUser(userDAO, user2));
    }
}
