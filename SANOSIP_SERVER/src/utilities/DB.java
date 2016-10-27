/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nilanga
 */
public class DB {

    private final Connection con;
    private static DB db;

    private DB() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sanosip 2.0", "root", "");    //Create DB Connection 
    }

    private static DB createConnection() throws SQLException, ClassNotFoundException {
        if (db == null) {
            db = new DB();
        }
        return db;
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        return createConnection().con;
    }
}
