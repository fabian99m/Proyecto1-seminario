package proyecto1.logica;

import java.io.Serializable;

public class Registro implements Serializable {

    private String nomnbre;
    private String cedula;
    private float temp; //temperatura
    private String fecha;
    
    public Registro() {
    }

    public Registro(String nomnbre, String cedula, float temp, String fecha) {
        this.nomnbre = nomnbre;
        this.cedula = cedula;
        this.temp = temp;
        this.fecha = fecha;
    }

    public Registro(String nomnbre, String cedula, float temp) {
        this.nomnbre = nomnbre;
        this.cedula = cedula;
        this.temp = temp;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }


    public String getID() {
        return cedula;
    }

    public void setID(String ID) {
        this.cedula = ID;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

}
