import java.util.ArrayList;
import java.util.Calendar;

public class Clinica {
    private String nombre;
    private ArrayList<Perro> perros;
    private ArrayList<Vacuna> vacunas;
    private Perro perroActual;

    public Clinica(String nombre) {
        this.nombre = nombre;
        this.vacunas = new ArrayList<Vacuna>();
        this.perros = new ArrayList<Perro>();
    }

    public Clinica() {
    }

    public ArrayList<Vacuna> getVacunas() {
        return vacunas;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void seleccionaPerro(int indice){
        this.perroActual = perros.get(indice);
    }

    public Perro getPerroActual() {
        return perroActual;
    }

    public String toString(){
        String aDevolver = "--------"+this.nombre+"--------\n";
        for (int i = 0; i <this.perros.size() ; i++) {
            aDevolver+="Nº "+i+" Perro: "+this.perros.get(i).getNombre()+" Raza: "+this.perros.get(i).getRaza()+"\n";

        }
        return aDevolver;
    }

    public VacunaPerro vacunar(Perro p, Vacuna v, Calendar f){
        return new VacunaPerro(p, v, f);
    }
}
