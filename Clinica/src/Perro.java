import java.util.Calendar;

public class Perro {
    private String nombre;
    private String raza;
    private Calendar fechaProxima;

    public Perro(String nombre, String raza, Calendar fechaProxima) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaProxima = fechaProxima;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }
}
