import java.util.Calendar;
import java.util.Scanner;

public class Aplicacion {
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        Clinica clinica= new Clinica();
        Calendar fecha_prox = Calendar.getInstance();
        A

        String opcion, nombre;
        int dia, mes, año;

        limpiapantalla();
        menu();
        do {
            opcion = tc.nextLine();
            switch (opcion){

                case "1":
                    System.out.print("Introduce el nombre de la clinica Veterinaria: ");
                    String nClinica = tc.nextLine();
                    clinica = new Clinica(nClinica);
                    limpiapantalla();
                    menu();
                    break;
                case "2":
                    System.out.print("Introduce el id de la vacuna: ");
                    int id = tc.nextInt();
                    tc.nextLine();
                    System.out.print("Introduce el nombre de la vacuna: ");
                    nombre = tc.nextLine();
                    System.out.print("Introduce el precio de la vacuna: ");
                    double precio = tc.nextDouble();
                    tc.nextLine();
                    clinica.getVacunas().add(altaVacuna(id, nombre, precio));
                    limpiapantalla();
                    menu();
                    break;
                case "3":
                    System.out.print("Introduce el nombre del perro: ");
                    nombre = tc.nextLine();
                    System.out.print("Introduce la raza del perro: ");
                    String raza = tc.nextLine();

                    System.out.print("Introduce la dia de la fecha de la proxima vacuna: ");
                    dia = tc.nextInt();
                    tc.nextLine();

                    System.out.print("Introduce la mes de la fecha de la proxima vacuna: ");
                    mes = tc.nextInt();
                    tc.nextLine();
                    System.out.print("Introduce la año de la fecha de la proxima vacuna: ");
                    año = tc.nextInt();
                    tc.nextLine();
                    fecha_prox.set(año, mes -1, dia);
                    System.out.println(fecha_prox.getTime());

                    clinica.getPerros().add(altaPerro(nombre, raza, fecha_prox));
                    limpiapantalla();
                    menu();
                    break;
                case "4":



                    break;
                case "5":


                    break;
                case "6":



                    break;
                case "7":


                    break;
                case "8":



                    break;
                case "0":
                    System.out.println("SALIENDO");
                    break;
            }
        }while(!opcion.equals("0"));


    }

    public static void menu(){
        System.out.println("1. Alta de la clinica veterinaria.");
        System.out.println("2. Alta de las vacunas.");
        System.out.println("3. Alta de perro.");
        System.out.println("4. Vacunar a un perro.");
        System.out.println("5. Listado de vacunas a un perro.");
        System.out.println("6. Cambiar fecha de proxima vacunacion.");
        System.out.println("7. Listado de todos los perros que estan vacunados de una determinada vacuna.");
        System.out.println("8. Listado de todos los perros que se tienen que vacunar en un mes.");
        System.out.println("0. Salir");
    }

    public static void limpiapantalla(){
        for (int i = 0; i <50 ; i++) {
            System.out.println("");
        }
    }

    public static Clinica altaClinica(String nombre){
        return new Clinica(nombre);
    }

    public static Vacuna altaVacuna(int id, String nombre, double precio){
        return new Vacuna(id, nombre, precio);
    }

    public static Perro altaPerro(String nombre, String raza, Calendar fecha_proxima){
        return new Perro(nombre, raza, fecha_proxima);
    }

    public static void vacunaPerro(){

    }


}
