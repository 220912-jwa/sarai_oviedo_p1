package dev.oviedo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    private static ConnectionUtil connutil;
    private static String url;
    private static String userName;
    private static String userPassword;

    private ConnectionUtil(){
        url = System.getenv("P1_DB_URL");
        userName = System.getenv("P1_DB_USER");
        userPassword = System.getenv("P1_DB_PASS");
    }

    public static synchronized ConnectionUtil getConnectionUtil(){
        return (connutil == null) ? new ConnectionUtil() : connutil;
    }

    public Connection getConnection(){

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, userName, userPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
