/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanosip_server_impl;

import controller.DBController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.DB;

/**
 *
 * @author Nilanga
 */
public class DBController_impl  implements DBController{

    @Override
    public int setData(Connection con, String query) throws SQLException {
        PreparedStatement p = con.prepareStatement(query);
        int pstm = p.executeUpdate();
        p.close();
        return pstm;
    }

    @Override
    public ResultSet getData(Connection con, String query) throws SQLException {
        ResultSet r = con.createStatement().executeQuery(query);
        return r;
    }

    @Override
    public Connection getConnection() {
        try {
            return DB.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBController_impl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBController_impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
    
}}
