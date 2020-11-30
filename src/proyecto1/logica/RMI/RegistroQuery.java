package proyecto1.logica.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import proyecto1.BD.BD;
import proyecto1.logica.Registro;

public class RegistroQuery extends UnicastRemoteObject implements RegistroInterface {

    private final BD datos;

    RegistroQuery() throws RemoteException {
        super();
        this.datos = new BD();
    }

    @Override
    public ArrayList<Registro> query(Registro reg) throws RemoteException {

        // guaradar en base de datos
        datos.AgregarInfo(reg.getNomnbre(), reg.getID(), reg.getTemp());
        
        return datos.ListarRegistros();
    }

}
