/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccess;

import controller.DBController;
import controller.RemoteFactory;
import java.rmi.RemoteException;
import utilities.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import sanosip_server_impl.RemoteFactoryImpl;


/**
 *
 * @author Nilanga
 */
public class payment {

    //edit table names of both methods
    public ResultSet getPaymentDetails(int student_id) throws ClassNotFoundException, SQLException, RemoteException {
        RemoteFactoryImpl remote = new RemoteFactoryImpl();
        DBController db = remote.getDBController();
        Connection con = DB.getConnection();
        String query = "select * from monthlyPayment where stud_id='" + student_id + "'";
        ResultSet rs = db.getData(con, query);
        return rs;
    }

    public int makePayment(model.payment monthlypayment) throws ClassNotFoundException, SQLException, RemoteException {
        RemoteFactoryImpl remote = new RemoteFactoryImpl();
        DBController db = remote.getDBController();
        Connection con = DB.getConnection();
        String query = "insert into payment values(" + monthlypayment.getPaymentID() + "," + monthlypayment.getStudentID() + ","+34+"," + monthlypayment.getAmount()+ ",'" +  monthlypayment.getMonth() + "','" + monthlypayment.getDate() + "')";
        int spd = db.setData(con, query);
        return spd;
    }

    public int deletePayment(int payment_id) throws ClassNotFoundException, SQLException, RemoteException {
        RemoteFactoryImpl remote = new RemoteFactoryImpl();
        DBController db =  remote.getDBController();
        Connection con = DB.getConnection();
        String query = "delete * from monthlyPayment where stud_id='" + payment_id + "'";
        int spd = db.setData(con, query);
        return spd;
    }
}
