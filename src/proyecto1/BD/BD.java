
package proyecto1.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import proyecto1.logica.Registro;

public class BD {

    String driver, url, login, password;
    Connection conexion = null;

    public BD() {

        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/registros";
        login = "root";
        password = "";
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(url, login, password);
            System.out.println("Conexion con Base de datos Ok....");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException exc) {
            System.out.println("Error al tratar de abrir la base de datos");
            System.out.println(exc.getMessage());
        }

    }

    
    // guardar registros en BD
    public void AgregarInfo(String nombre, String cedula, float temp) {
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy hh:mm:");
         String fecha = sdf.format(new Date());
         System.out.println(fecha);
        String ComandoSQL = "INSERT INTO clientes  VALUES ('" + nombre + "' , '" + cedula + "' ," + temp + " ,'"+fecha+"')";
        try {

            Statement stmt = conexion.createStatement();
            stmt.executeUpdate(ComandoSQL);
            System.out.println("Registro agregado!");

            stmt.close();

        } catch (java.sql.SQLException er) {
            System.out.println("No se pudo realizar la operación.");
        }
    }

    // traer lista de registros desde BD
    public ArrayList<Registro> ListarRegistros() {
        String nombre, cedula,fecha;
        float temp;
        String ComandoSQL = "SELECT * FROM clientes";
        ArrayList<Registro> cts = new ArrayList<>();

        try {
            Statement stmt = conexion.createStatement();
            ResultSet resultado = stmt.executeQuery(ComandoSQL);

            while (resultado.next()) {
                nombre = resultado.getString(1);
                cedula = resultado.getString(2);
                temp = resultado.getFloat(3);
                fecha = resultado.getString(4);
                cts.add(new Registro(nombre, cedula, temp,fecha));
            }
            stmt.close();
        } catch (java.sql.SQLException er) {
            System.out.println("No se pudo realizar la operación.");
        }
        return cts;
    }
}
