package Utils;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    private final String dbPath = "jdbc:mysql://localhost:3306/market?useUnicode=yes&characterEncoding=UTF-8";
    private final String dbUsername = "root";
    private final String dbPassword = "";
    private java.sql.Connection connection;

    public boolean open() {
        try {
            connection = DriverManager.getConnection(dbPath, dbUsername, dbPassword);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Could not connect to the database. " + ex.getMessage());
            return false;
        } 
    }

    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public java.sql.Connection getConnection() {
        if (connection == null) {
            if (!open()) {
                return null;
            }
        }
        return connection;
    }
}
