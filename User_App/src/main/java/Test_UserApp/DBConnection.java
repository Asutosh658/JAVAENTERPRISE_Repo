package Test_UserApp;

import java.sql.*;

public class DBConnection {
    private static Connection con = null;

    // Private constructor to prevent instantiation
    private DBConnection() {}

    // Static block to initialize the connection
    static {
        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Establish the connection using credentials from DBInfo
            con = DriverManager.getConnection(DBInfo.dbUrl, DBInfo.uName, DBInfo.pWord);
        } catch (Exception e) {
            e.printStackTrace(); // Print any exceptions that occur
        }
    }

    // Method to return the database connection
    public static Connection getCon() {
        return con;
    }
}

