package proyecto1.logica.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UDPservidor {

    private final int puerto = 5000;
    private DatagramSocket servidorSocket;
    private DatagramPacket clientePacket;
    String ip;
   
    
    public UDPservidor() {
        try {
            this.servidorSocket = new DatagramSocket(puerto);
           
            this.ip = InetAddress.getLocalHost().getHostAddress();
            System.out.println(" [OK] inicializado el DatagramSocket y escuchando...");
        } catch (SocketException ex) {
            Logger.getLogger(UDPservidor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(UDPservidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void iniciarServidor() throws ClassNotFoundException {

        // esperando petición del cliente
        while (true) {
            try {

                byte[] recBytes = new byte[65535];

                // crear DatgramPacket para recibir datos
                clientePacket = new DatagramPacket(recBytes, recBytes.length);

                // recivir los datos en byte buffer. 
                servidorSocket.receive(clientePacket);
           
                // crear hilo para atender cliente nuevo
                Thread t = new Hiloservidor(recBytes, servidorSocket, clientePacket);
                t.start();

            } catch (IOException ex) {
                System.out.println(" No se pudo inicializar el DatagramSocket");
                Logger.getLogger(UDPservidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void detenerServidor() {
        try {
            servidorSocket.close();
            System.out.println(" DatagramSocket detenido");

        } catch (Exception ex) {
            System.out.println("No se pudo detener el servidor");
            Logger.getLogger(UDPservidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     

    public int getPuerto() {
        return puerto;
    }

    public String getIp() {
        return ip;
    }
    
}
