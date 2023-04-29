package pro.sky.block4;


import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.TreeSet;

@Service
public class UserDAO {
    private final HashSet<User> userSet = new HashSet<>();

    public UserDAO() {
    }

    public User findUser(String name) {
        for (User user : userSet) {
            if (user.getName().equalsIgnoreCase(name.trim()))
                return user;
        }
        return null;
    }

    public HashSet<User> userList() {
        return this.userSet;
    }
}
