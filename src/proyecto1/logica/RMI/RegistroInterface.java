
package proyecto1.logica.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import proyecto1.logica.Registro;

// interface
public interface RegistroInterface extends Remote{
    
    public ArrayList<Registro> query(Registro reg) throws RemoteException;
    
}
