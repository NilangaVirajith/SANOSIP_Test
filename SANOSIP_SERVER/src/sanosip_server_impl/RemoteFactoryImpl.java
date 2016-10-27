/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sanosip_server_impl;

import controller.DBController;
import controller.RemoteFactory;
import controller.paymentController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;



/**
 *
 * @author cmjd
 */
public class RemoteFactoryImpl extends UnicastRemoteObject implements RemoteFactory {

    public RemoteFactoryImpl() throws RemoteException{
        super();
    }
    
    
    @Override
    public paymentController getPaymentController() throws RemoteException{
        return new paymentController_impl();
    }

    @Override
    public DBController getDBController() throws RemoteException, SQLException, ClassNotFoundException {
        return new DBController_impl();
    }

    
}
