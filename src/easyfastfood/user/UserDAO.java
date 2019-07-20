package easyfastfood.user;

import easyfastfood.framework.DatabaseConnector;
import easyfastfood.framework.StandardizedDataResult;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author norto
 */
public class UserDAO {

    public StandardizedDataResult login(User user) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = DatabaseConnector.getDatabaseConnector();
            if (null != connection) {

            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        } finally {
            if (null != ps) {
                ps.close();
            }

            if (null != connection) {
                connection.close();
            }

        }
        return new StandardizedDataResult("You logged in", -1, true);

    }

    public StandardizedDataResult save(User user) throws SQLException {

        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = DatabaseConnector.getDatabaseConnector();
            if (null != connection) {
                String sql = "insert into users(name, password) values(?,?)";
                ps = connection.prepareStatement(sql);
                ps.setString(1, user.getName());
                ps.setString(2, user.getPassword());
                ps.execute();
                return new StandardizedDataResult("User successfully saved", -1, true);
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        } finally {
            if (null != ps) {
                ps.close();
            }
            if (null != connection) {
                connection.close();
            }
        }
        return new StandardizedDataResult("Fail to save user", -1, false);
    }

}
