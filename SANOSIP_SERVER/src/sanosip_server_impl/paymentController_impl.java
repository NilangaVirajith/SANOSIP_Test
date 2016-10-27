/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanosip_server_impl;

import controller.DBController;
import controller.RemoteFactory;
import controller.paymentController;
import dataAccess.payment;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nilanga
 */
public class paymentController_impl extends UnicastRemoteObject implements paymentController {

    private payment DA_payment = null;

    public paymentController_impl() throws RemoteException {
        super();
        DA_payment = new payment();
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int makePayment(model.payment monthlypayment) throws ClassNotFoundException, SQLException, RemoteException {
        return DA_payment.makePayment(monthlypayment);
    }

    @Override
    public int addPayment(model.payment Payment) throws ClassNotFoundException, SQLException, RemoteException {
        return DA_payment.makePayment(Payment);
    }

    @Override
    public int deletePayment(int payment_id) throws ClassNotFoundException, SQLException, RemoteException {
        return DA_payment.deletePayment(payment_id);
    }

    @Override
    public ResultSet searchClassByID(int classID) throws ClassNotFoundException, SQLException, RemoteException {
        RemoteFactoryImpl remoteFactory = new RemoteFactoryImpl();
        DBController db = remoteFactory.getDBController();
        Connection con = db.getConnection();
        String query = "select * from class where class_id='" + classID + "'";
        ResultSet rs = db.getData(con, query);
        return rs;
    }

    @Override
    public ResultSet searchClassByName(String classname) throws ClassNotFoundException, SQLException, RemoteException {
        RemoteFactoryImpl remoteFactory = new RemoteFactoryImpl();
        DBController db = remoteFactory.getDBController();
        Connection con = db.getConnection();
        String query = "select * from class where class_name='" + classname + "'";
        ResultSet rs = db.getData(con, query);
        return rs;
    }

    @Override
    public ResultSet searchStudentByID(int studentID) throws ClassNotFoundException, SQLException, RemoteException {
        RemoteFactoryImpl remoteFactory = new RemoteFactoryImpl();
        DBController db = remoteFactory.getDBController();
        Connection con = db.getConnection();
        String query = "select student_name from student where student_id='" + studentID + "'";
        ResultSet rs = db.getData(con, query);
        return rs;
    }

    @Override
    public ResultSet searchStudentByName(String studentname) throws ClassNotFoundException, SQLException, RemoteException {
        RemoteFactoryImpl remoteFactory = new RemoteFactoryImpl();
        DBController db = remoteFactory.getDBController();
        Connection con = db.getConnection();
        String query = "select student_id from student where student_name='" + studentname + "'";
        ResultSet rs = db.getData(con, query);
        return rs;
    }

}
