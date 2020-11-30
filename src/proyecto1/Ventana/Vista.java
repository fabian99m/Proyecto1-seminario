package proyecto1.Ventana;

import proyecto1.logica.TCP.Cliente;
import proyecto1.logica.TCP.Servidor;

import proyecto1.logica.UDP.UDPcliente;
import proyecto1.logica.UDP.UDPservidor;

import proyecto1.logica.RMI.ClienteRMI;
import proyecto1.logica.RMI.ServidorRMI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

import proyecto1.logica.Registro;

public class Vista extends JFrame {

    boolean sudp = false, stcp = false, rmi = false;

    // TCP
    Servidor servidorTCP = new Servidor();
    Cliente clienteTCP = new Cliente();

    // UDP
    UDPservidor ServidorUDP = new UDPservidor();
    UDPcliente ClienteUDP = new UDPcliente();

    // RMI
    ClienteRMI crmi = new ClienteRMI();
    ServidorRMI srmi = new ServidorRMI();

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClienteUI = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        tnombre = new javax.swing.JTextField();
        tcedula = new javax.swing.JTextField();
        ttemp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Benviar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        ServidorUI = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        lactual = new javax.swing.JLabel();
        lactual2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        diractual = new javax.swing.JLabel();
        ServerUDP = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        eschudp = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        udpport = new javax.swing.JLabel();
        ServerRMI = new javax.swing.JFrame();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dirmi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        ClienteUI.setTitle("Cliente");
        ClienteUI.setMinimumSize(new java.awt.Dimension(598, 499));
        ClienteUI.setResizable(false);
        ClienteUI.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ClienteUIWindowClosing(evt);
            }
        });

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        tnombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        tcedula.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcedulaKeyTyped(evt);
            }
        });

        ttemp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ttemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ttempKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel2.setText("Ingreso de clientes");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Nombres");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Cédula");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Temperatura");

        Benviar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Benviar.setText("Enviar");
        Benviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BenviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttemp, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Benviar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(41, 41, 41)
                .addComponent(Benviar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar clientes", jPanel2);

        tabla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cédula", "Temperatura", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(2).setMinWidth(3);
        }

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("Registro de clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(125, 125, 125))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro de entrada", jPanel1);

        javax.swing.GroupLayout ClienteUILayout = new javax.swing.GroupLayout(ClienteUI.getContentPane());
        ClienteUI.getContentPane().setLayout(ClienteUILayout);
        ClienteUILayout.setHorizontalGroup(
            ClienteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteUILayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        ClienteUILayout.setVerticalGroup(
            ClienteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteUILayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        ServidorUI.setTitle("Servidor TCP");
        ServidorUI.setMinimumSize(new java.awt.Dimension(336, 383));
        ServidorUI.setResizable(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Servidor TCP");

        lactual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lactual.setText("Escuchando en: ");

        lactual2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lactual2.setForeground(new java.awt.Color(0, 153, 51));
        lactual2.setText("jLabel7");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Escuchando a");

        diractual.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        diractual.setForeground(new java.awt.Color(0, 153, 0));
        diractual.setText("jLabel8");

        javax.swing.GroupLayout ServidorUILayout = new javax.swing.GroupLayout(ServidorUI.getContentPane());
        ServidorUI.getContentPane().setLayout(ServidorUILayout);
        ServidorUILayout.setHorizontalGroup(
            ServidorUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServidorUILayout.createSequentialGroup()
                .addGroup(ServidorUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServidorUILayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(ServidorUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lactual2)
                            .addComponent(lactual)
                            .addComponent(jLabel7)
                            .addComponent(diractual)))
                    .addGroup(ServidorUILayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        ServidorUILayout.setVerticalGroup(
            ServidorUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServidorUILayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(lactual)
                .addGap(18, 18, 18)
                .addComponent(lactual2)
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(diractual)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        ServerUDP.setTitle("Servidor TCP");
        ServerUDP.setMinimumSize(new java.awt.Dimension(319, 395));
        ServerUDP.setResizable(false);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Servidor UDP");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Escuchando en");

        eschudp.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        eschudp.setForeground(new java.awt.Color(0, 153, 0));
        eschudp.setText("jLabel11");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Petición desde");

        udpport.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        udpport.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout ServerUDPLayout = new javax.swing.GroupLayout(ServerUDP.getContentPane());
        ServerUDP.getContentPane().setLayout(ServerUDPLayout);
        ServerUDPLayout.setHorizontalGroup(
            ServerUDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServerUDPLayout.createSequentialGroup()
                .addGroup(ServerUDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServerUDPLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel9))
                    .addGroup(ServerUDPLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(ServerUDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eschudp)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(udpport))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        ServerUDPLayout.setVerticalGroup(
            ServerUDPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServerUDPLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel9)
                .addGap(37, 37, 37)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(eschudp)
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(29, 29, 29)
                .addComponent(udpport)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        ServerRMI.setTitle("Servidor RMI");
        ServerRMI.setMinimumSize(new java.awt.Dimension(344, 287));
        ServerRMI.setResizable(false);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Servidor RMI");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Escuchando desde");

        dirmi.setFont(new java.awt.Font("Dialog", 1, 17)); // NOI18N
        dirmi.setForeground(new java.awt.Color(0, 204, 0));
        dirmi.setText("jLabel14");

        javax.swing.GroupLayout ServerRMILayout = new javax.swing.GroupLayout(ServerRMI.getContentPane());
        ServerRMI.getContentPane().setLayout(ServerRMILayout);
        ServerRMILayout.setHorizontalGroup(
            ServerRMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServerRMILayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(ServerRMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dirmi)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        ServerRMILayout.setVerticalGroup(
            ServerRMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServerRMILayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel12)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dirmi)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto ");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("TECNOLOGÍAS");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Socket TCP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Socket UDP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("RMI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addGap(44, 44, 44)
                .addComponent(jButton3)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sudp = true;
        this.dispose();
        ClienteUI.setVisible(true);
        ClienteUI.setLocationRelativeTo(ServidorUI);
        ServerUDP.setVisible(true);
        // inicar server UDP
        new Thread(() -> {
            try {
                ServidorUDP.iniciarServidor();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();

        eschudp.setText(ServidorUDP.getIp() + ":" + ServidorUDP.getPuerto());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        stcp = true;
        this.dispose();
        ClienteUI.setVisible(true);
        ClienteUI.setLocationRelativeTo(ServidorUI);
        ServidorUI.setVisible(true);

        // inicar server TCP
        new Thread(() -> {
            try {
                servidorTCP.recibir();
            } catch (IOException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();

        try {
            clienteTCP.conectar();
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }

        lactual2.setText(servidorTCP.getIp() + ":" + servidorTCP.getPort());
        diractual.setText(servidorTCP.getIp2());
        try {
            clienteTCP.desconectar();
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BenviarActionPerformed
        if (!tnombre.getText().isEmpty() && !tcedula.getText().isEmpty() && !ttemp.getText().isEmpty()) {
            if (stcp) {

                new Thread(() -> {
                    try {
                        ArrayList<Registro> cts;
                        cts = clienteTCP.iniciar(new Registro(tnombre.getText(), tcedula.getText(), Float.parseFloat(ttemp.getText())));
                        refrescartabla(cts, tabla);
                        limpiartexto();
                        diractual.setText(servidorTCP.getIp2());
                        JOptionPane.showMessageDialog(this, "Registro guardado con éxito!");
                    } catch (IOException ex) {
                        Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }).start();
            }

            if (sudp) {
                if (!tnombre.getText().isEmpty() && !tcedula.getText().isEmpty() && !ttemp.getText().isEmpty()) {

                    try {
                        ArrayList<Registro> cts;
                        cts = ClienteUDP.GuardarRegistros(new Registro(tnombre.getText(), tcedula.getText(), Float.parseFloat(ttemp.getText())));

                        udpport.setText(String.valueOf(ClienteUDP.getIp() + ":" + ClienteUDP.getPuertocliente()));
                        Timer SimpleTimer = new Timer(4500, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                               // udpport.setText("");
                            }
                        });
                        SimpleTimer.start();
                        JOptionPane.showMessageDialog(this, "Registro guardado con éxito!");
                        refrescartabla(cts, tabla);
                        limpiartexto();
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            if (rmi) {
                if (!tnombre.getText().isEmpty() && !tcedula.getText().isEmpty() && !ttemp.getText().isEmpty()) {
                    ArrayList<Registro> cts;
                    cts = crmi.peticion(new Registro(tnombre.getText(), tcedula.getText(), Float.parseFloat(ttemp.getText())));
                    refrescartabla(cts, tabla);
                    limpiartexto();
                    JOptionPane.showMessageDialog(this, "Registro guardado con éxito!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "INGRESE TODOS LOS DATOS!");
        }
    }//GEN-LAST:event_BenviarActionPerformed

    public void limpiartexto() {
        tnombre.setText("");
        tcedula.setText("");
        ttemp.setText("");
    }

    public void limpiarTabla(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

    public void refrescartabla(ArrayList<Registro> cts, JTable table) {

        limpiarTabla(table);
        if (cts.size() > 0) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            String nombre = null, cedula = null, fecha = null;
            float temp = 0;
            for (Registro reg : cts) {
                nombre = reg.getNomnbre();
                cedula = reg.getID();
                temp = reg.getTemp();
                fecha = reg.getFecha();
                model.addRow(new Object[]{nombre, cedula, temp, fecha});
            }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        rmi = true;
        this.dispose();
        ClienteUI.setVisible(true);
        ClienteUI.setLocationRelativeTo(ServidorUI);
        ServerRMI.setVisible(true);
        dirmi.setText(srmi.getNombreServer());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcedulaKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_tcedulaKeyTyped

    private void ttempKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ttempKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && car > '.') {
            evt.consume();
        }
    }//GEN-LAST:event_ttempKeyTyped

    private void ClienteUIWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ClienteUIWindowClosing

        if (stcp) {
          
            diractual.setText("");
            ServidorUI.dispose();
            this.setVisible(true);
        } else if (sudp) {
            ServerUDP.dispose();
            this.setVisible(true);
        } else {
            ServerRMI.dispose();
            ServerRMI.dispose();
            this.setVisible(true);
        }
    }//GEN-LAST:event_ClienteUIWindowClosing

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        SwingUtilities.invokeLater(() -> {
            new Vista().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Benviar;
    private javax.swing.JFrame ClienteUI;
    private javax.swing.JFrame ServerRMI;
    private javax.swing.JFrame ServerUDP;
    private javax.swing.JFrame ServidorUI;
    private javax.swing.JLabel diractual;
    private javax.swing.JLabel dirmi;
    private javax.swing.JLabel eschudp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lactual;
    private javax.swing.JLabel lactual2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tcedula;
    private javax.swing.JTextField tnombre;
    private javax.swing.JTextField ttemp;
    private javax.swing.JLabel udpport;
    // End of variables declaration//GEN-END:variables
}
