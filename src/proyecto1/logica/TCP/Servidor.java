package proyecto1.logica.TCP;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {

    int port = 5056;
    String ip;
    String ipa;
    //ServerSocket ss;
//    Socket s;

    public Servidor() {
        try {
            this.ip = InetAddress.getLocalHost().getHostAddress();
            // ss = new ServerSocket(5056);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void recibir() throws IOException {

        // ServerSocket ss = new ServerSocket(5056);
        ServerSocket ss = new ServerSocket(5056);
        while (true) {
            Socket s = null;
            try {

                System.out.println("------paso");
                s = ss.accept();
                ipa = s.getRemoteSocketAddress().toString();
                System.out.println(s.getRemoteSocketAddress().toString());
                System.out.println("Un nuevo cliente está conectado! : " + s);

                ObjectInputStream dis = new ObjectInputStream(s.getInputStream());
                ObjectOutputStream dos = new ObjectOutputStream(s.getOutputStream());

//                // invocar clase "handler" para manejar cada hilo
                new Hiloservidor(s, dis, dos).start();

            } catch (IOException e) {
                s.close();
            }
        }
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public String getIp2() {
        return ipa;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

}
