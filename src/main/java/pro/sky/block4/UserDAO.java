package pro.sky.block4;



import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.TreeSet;

@Service
public class UserDAO {

    User user = new User("User");
    private final HashSet<User> userSet = new HashSet<>();

    public UserDAO() {
        userSet.add(user);
    }

    public User findUser(String name) {
        for (User user : userSet) {
            if (user.getName().equalsIgnoreCase(name.trim()))
                return user;
        }
return null;
    }

    public HashSet <User> userList() {
        if (userSet.size()>0) {return this.userSet;}
        return null;
    }
}
