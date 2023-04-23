package pro.sky.block4;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    User user = new User("User");

    @Mock
    private final UserService out = new UserService();

    @Test
    public void ShouldReturnSuccessMessageIfUserDAOContainsUser() {
        UserDAO.addUser(user);
        when(out.checkUser(user)).thenReturn(true);
        System.out.println(out.checkUser(user));
    }

    @Test
    public void ShouldReturnSuccessMessageIfUserDAODoNotContainsInvalidUser() {
        UserDAO.addUser(user);
        User user2 = new User("Not valid User");
        when(out.checkUser(user2)).thenReturn(false);
        System.out.println(out.checkUser(user2));
    }
}
