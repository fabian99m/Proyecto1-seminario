package proyecto1.logica.TCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto1.logica.Registro;

public class Cliente {

    private Socket s;
    private final int puerto = 5056;
    private ObjectOutputStream objout;
    private ObjectInputStream objin;

    public void conectar() throws UnknownHostException, IOException {
        InetAddress ip = InetAddress.getLocalHost();
        s = new Socket(ip, puerto);
        System.out.println("Conectado cliente");
    }

    public void desconectar() throws UnknownHostException, IOException {
        s.close();
        System.out.println("Desconectado TCP");
    }

    // enviar registros y recibir lista para mostrar en tabla
    public ArrayList<Registro> iniciar(Registro reg) throws IOException {

        InetAddress ip = InetAddress.getLocalHost();
        s = new Socket(ip, puerto);
        ArrayList<Registro> cts = null;

        try {
            objout = new ObjectOutputStream(s.getOutputStream());
            objout.writeObject(reg);

            objin = new ObjectInputStream(s.getInputStream());
            cts = (ArrayList<Registro>) objin.readObject();

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cts;

    }
}
