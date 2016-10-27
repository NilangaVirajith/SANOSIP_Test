/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

/**
 *
 * @author cmjd
 */
public interface RemoteFactory extends Remote{
    
    public paymentController getPaymentController() throws RemoteException,SQLException , ClassNotFoundException;
    public DBController getDBController() throws RemoteException,SQLException , ClassNotFoundException;
        
}
