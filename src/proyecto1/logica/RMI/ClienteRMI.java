package proyecto1.logica.RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import proyecto1.logica.Registro;

public class ClienteRMI {

    private RegistroInterface access;
    private final String NombreServer = "rmi://localhost:1900" + "/seminario";

    public ArrayList<Registro> peticion(Registro reg) {
        ArrayList<Registro> lista = null;

        try {
            access = (RegistroInterface) Naming.lookup(NombreServer);

            // enviar objecto a server y recibir lista de registros
            lista = access.query(reg);

        } catch (MalformedURLException | NotBoundException | RemoteException ae) {
            System.out.println(ae);
            StackTraceElement[] stackTrace = ae.getStackTrace();
        }
        return lista;
    }
}
