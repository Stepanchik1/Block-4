package pro.sky.block4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDAO userDAO;

    @InjectMocks
    private UserService userService;

    @Test
    public void ShouldReturnSuccessMessageIfUserDAOContainsUser() {
        User user = new User("User");
        HashSet<User> hashSet = new HashSet();
        hashSet.add(user);
        when(userDAO.userList()).thenReturn(hashSet);
        System.out.println(userService.checkUser(user));
        Assertions.assertTrue(userService.checkUser(user));
    }

    @Test
    public void ShouldReturnSuccessMessageIfUserDAODoNotContainsInvalidUser() {
        User user = new User("User");
        User user2 = new User("Not valid User");
        HashSet<User> hashSet = new HashSet();
        hashSet.add(user);
        when(userDAO.userList()).thenReturn(hashSet);
        System.out.println(userService.checkUser(user2));
        Assertions.assertFalse(userService.checkUser(user2));
    }
}
