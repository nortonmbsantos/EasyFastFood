package easyfastfood.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author norto
 */
public class DatabaseConnector {

    private static String status = "Not connected...";

    private static final String username = "root";
    private static final String password = "";

    public DatabaseConnector() {

    }

    public static java.sql.Connection getDatabaseConnector() {
        Connection connection = null;
        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            String serverName = "localhost:3306";
            String mydatabase = "easyfastfood";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                status = ("STATUS--->Successfully connected!");
                System.out.println(status);
            } else {
                status = ("STATUS--->Unable to connect.");
                System.out.println(status);
            }
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found.");
            return null;
        } catch (SQLException e) {
            System.out.println("Unable to connect to database.");
            return null;
        }
    }

    public static String statusConnection() {
        return status;
    }

    public static boolean close() {
        try {
            DatabaseConnector.getDatabaseConnector().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static java.sql.Connection restart() {
        close();
        return DatabaseConnector.getDatabaseConnector();
    }

}
