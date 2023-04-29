package pro.sky.block4;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public boolean checkUser(User user) {
        if (userDAO.userList() == null) {
            return false;
        }
        return userDAO.userList().contains(user);
    }
}
