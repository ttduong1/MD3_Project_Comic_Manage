package user;

import config.Config;
import model.User;
import service.role.RoleServiceIMPL;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserServiceIMPL implements IUserService{
    static String PATH_USER = "D:\\Java10f\\module3\\MD3_Comic_Manager\\src\\database\\user.txt";
    static String PATH_USER_LOGIN = "D:\\Java10f\\module3\\MD3_Comic_Manager\\src\\database\\user_login.txt";
    static Config<List<User>> config = new Config<>();

    static {
        if (userList == null || userList.size() == 0){
            userList = new ArrayList<>();
            Set<RoleServiceIMPL> roles = new HashSet<>();
            roles.add(new RoleServiceIMPL());
        }
    }
    static List<User> userList = config.read(PATH_USER);
    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public void updateData() {

    }

    @Override
    public int getLastId() {
        return 0;
    }

    @Override
    public boolean existsByUsername(String username) {
        return false;
    }

    @Override
    public boolean existByEmail(String email) {
        return false;
    }

    @Override
    public boolean checkLogin(String username, String password) {
        return false;
    }

    @Override
    public User getCurrentUser() {
        return null;
    }

    @Override
    public void saveCurrentUser() {

    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public void changeRole(int id, Role role) {

    }

    @Override
    public void changeStatus(int id) {

    }
}
