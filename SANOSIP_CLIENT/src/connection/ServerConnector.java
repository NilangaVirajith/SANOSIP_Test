/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;


import controller.RemoteFactory;
import controller.paymentController;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLException;



/**
 *
 * @author cmjd
 */
public class ServerConnector {
    
    private static ServerConnector serverConnector = null;
    private RemoteFactory remoteFactory = null;
    private paymentController PaymentController = null;

    
     private ServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
         Registry reg=LocateRegistry.getRegistry("localhost",1211);
         String lookupString = "sanosip";
        remoteFactory = (RemoteFactory) reg.lookup(lookupString);
     }
    
    public static ServerConnector getServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        if (serverConnector == null) {
            serverConnector = new ServerConnector();
        }
        return serverConnector;
    }
     
    public RemoteFactory getRemoteFactory() throws NotBoundException, MalformedURLException, RemoteException, SQLException, ClassNotFoundException {
        return remoteFactory;
    }
       
    public paymentController getPaymentController() throws NotBoundException, MalformedURLException, RemoteException, SQLException, ClassNotFoundException {
        if (PaymentController == null) {
            PaymentController = remoteFactory.getPaymentController();
        }
        return PaymentController;
    }
    
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        ServerConnector a=new ServerConnector();
    }
}

