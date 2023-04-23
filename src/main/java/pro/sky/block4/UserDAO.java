package pro.sky.block4;

import java.util.HashSet;
import java.util.TreeSet;

public class UserDAO {
    private static final HashSet<User> userSet = new HashSet<>();

    public static void addUser (User user) {
        userSet.add(user);
    }

    public static User findUser(String name) {
        for (User user : userSet) {
            if (user.getName().equalsIgnoreCase(name.trim()))
                return user;
        }
return null;
    }

    public static HashSet <User> userList () {
        if (userSet.size()>0) {return userSet;}
        return null;
    }
}
