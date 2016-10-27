/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nilanga
 */
public interface DBController extends Remote {

    public int setData(Connection con, String query) throws ClassNotFoundException, SQLException, RemoteException;

    public ResultSet getData(Connection con, String query) throws SQLException, SQLException, RemoteException;

    public Connection getConnection();
}
