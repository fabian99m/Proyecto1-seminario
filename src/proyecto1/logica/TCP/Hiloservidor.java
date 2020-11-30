package proyecto1.logica.TCP;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto1.BD.BD;
import proyecto1.logica.Registro;

class Hiloservidor extends Thread {

    final ObjectInputStream dis;
    final ObjectOutputStream dos;
    final Socket socket;
    private final BD datos;

    public Hiloservidor(Socket soc, ObjectInputStream dis, ObjectOutputStream dos) {
        this.socket = soc;
        this.dis = dis;
        this.dos = dos;
        this.datos = new BD();
    }

    @Override
    public void run() {
        try {
            // recibir registros para guardarlos en BD
            Registro reg = (Registro) dis.readObject();
            datos.AgregarInfo(reg.getNomnbre(), reg.getID(), reg.getTemp()); // guardar en BD
                    
            // enviar lista de registros al cliente para mostrar en tabla
            dos.writeObject(datos.ListarRegistros());
            dos.flush();
            
            socket.close(); 
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Hiloservidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
