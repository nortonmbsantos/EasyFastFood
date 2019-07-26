package easyfastfood.user;

import easyfastfood.framework.StandardizedDataResult;
import java.sql.SQLException;

/**
 *
 * @author norto
 */
public class UserBR {

    UserDAO dao;

    public UserBR() {
        dao = new UserDAO();
    }

    public StandardizedDataResult save(User user) throws SQLException {
        if (user.getName() == null && user.getName().equals("")) {
            return new StandardizedDataResult("Fail to create user", -1, false);
        }
        if (user.getPassword() == null && user.getPassword().equals("")) {
            return new StandardizedDataResult("Fail to create user", -1, false);
        }
        return dao.save(user);
    }

    public StandardizedDataResult login(User user) throws SQLException {
        if (user.getId() > 0) {
            return new StandardizedDataResult("Username must be valid", -1, false);
        }
        if (user.getPassword() == null && user.getPassword().equals("")) {
            return new StandardizedDataResult("Password must be valid", -1, false);
        }
        return dao.login(user);
    }

}
