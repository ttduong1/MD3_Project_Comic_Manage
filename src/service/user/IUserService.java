package user;

import model.User;
import service.IGenericService;


public interface IUserService extends IGenericService {
    boolean existsByUsername(String username);
    boolean existByEmail(String email);
    boolean checkLogin(String username, String password);
    User getCurrentUser();
    void saveCurrentUser();
    User findByUsername(String username);
    void changeRole(int id, Role role);
    void changeStatus(int id);
}
