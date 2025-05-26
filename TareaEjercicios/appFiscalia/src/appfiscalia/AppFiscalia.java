package appfiscalia;
import java.util.Scanner;

public class AppFiscalia {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.print("Nombre del caso: ");
        String nombreCaso = tcl.nextLine();

        System.out.println("Fecha inicio:");
        System.out.print("Dia: ");
        int dia = tcl.nextInt();
        System.out.print("Mes: ");
        int mes = tcl.nextInt();
        System.out.print("Anio: ");
        int anio = tcl.nextInt();
        tcl.nextLine();

        System.out.print("Numero de personas implicadas: ");
        int num = tcl.nextInt();
        tcl.nextLine();

        casoCorrupcion caso = new casoCorrupcion(nombreCaso, dia, mes, anio, num);

        for (int i = 0; i < num; i++) {
            System.out.println("Persona " + (i+1));
            System.out.print("Nombre: ");
            String nombre = tcl.nextLine();
            System.out.print("Edad: ");
            int edad = tcl.nextInt();
            tcl.nextLine();
            System.out.print("Ocupacion: ");
            String ocupacion = tcl.nextLine();
            System.out.print("Nivel implicacion (acusado/testigo/victima): ");
            String nivel = tcl.nextLine();

            double sentencia = 0;
            double dano = 0;

            if (nivel == "acusado") {
                System.out.print("Sentencia (años): ");
                sentencia = tcl.nextDouble();
                System.out.print("Daño economico: ");
                dano = tcl.nextDouble();
                tcl.nextLine();
            }

            Personas p = new Personas(nombre, edad, ocupacion, nivel, sentencia, dano);
            caso.agregarPersona(p);
        }

        System.out.println("Fecha actual:");
        System.out.print("Dia: ");
        int dActual = tcl.nextInt();
        System.out.print("Mes: ");
        int mActual = tcl.nextInt();
        System.out.print("Anio: ");
        int aActual = tcl.nextInt();

        caso.actualizarEstado(dActual, mActual, aActual);

        System.out.println("... INFORMACION DEL CASO: ...");
        caso.mostrarCaso();
    }
    
}
