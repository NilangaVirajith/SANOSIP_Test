/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.payment;

/**
 *
 * @author Nilanga
 */
public interface paymentController extends Remote {

    public int addPayment(payment Payment) throws ClassNotFoundException, SQLException, RemoteException;

    public int deletePayment(int payment_id) throws ClassNotFoundException, SQLException, RemoteException;

    public ResultSet searchClassByID(int classID) throws ClassNotFoundException, SQLException, RemoteException;

    public ResultSet searchClassByName(String classname) throws ClassNotFoundException, SQLException, RemoteException;

    public ResultSet searchStudentByID(int studentID) throws ClassNotFoundException, SQLException, RemoteException;

    public ResultSet searchStudentByName(String studentname) throws ClassNotFoundException, SQLException, RemoteException;
}
