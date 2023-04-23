package pro.sky.block4;

public class UserService {

    public boolean checkUser (User user) {
        if (UserDAO.userList()==null) {return false;}
        return UserDAO.userList().contains(user);
    }
}
