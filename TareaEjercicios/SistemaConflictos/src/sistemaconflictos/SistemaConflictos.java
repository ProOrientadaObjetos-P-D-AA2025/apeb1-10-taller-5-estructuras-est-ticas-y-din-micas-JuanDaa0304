package sistemaconflictos;
import java.util.Scanner;

public class SistemaConflictos {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.print("Nombre del conflicto: ");
        String nombreConflicto = tcl.nextLine();

        System.out.print("Cantidad de paises involucrados: ");
        int nPaises = tcl.nextInt();
        tcl.nextLine();

        String[] paises = new String[nPaises];
        for (int i = 0; i < nPaises; i++) {
            System.out.print("Nombre pais " + (i + 1) + ": ");
            paises[i] = tcl.nextLine();
        }

        System.out.println("Fecha inicio del conflicto:");
        System.out.print("Dia: ");
        int dia = tcl.nextInt();
        System.out.print("Mes: ");
        int mes = tcl.nextInt();
        System.out.print("Anio: ");
        int anio = tcl.nextInt();
        tcl.nextLine();

        System.out.print("Maximo eventos a registrar: ");
        int maxEventos = tcl.nextInt();
        tcl.nextLine();

        Conflicto conflicto = new Conflicto(nombreConflicto, paises, dia, mes, anio, maxEventos);

        System.out.println("Ingrese eventos (max " + maxEventos + "):");
        for (int i = 0; i < maxEventos; i++) {
            System.out.println("Evento " + (i + 1));
            System.out.print("Nombre evento: ");
            String nomEvento = tcl.nextLine();
            System.out.print("Dia evento: ");
            int d = tcl.nextInt();
            System.out.print("Mes evento: ");
            int m = tcl.nextInt();
            System.out.print("Anio evento: ");
            int a = tcl.nextInt();
            tcl.nextLine();
            System.out.print("Ubicacion (pais): ");
            String ubic = tcl.nextLine();
            System.out.print("Descripcion: ");
            String desc = tcl.nextLine();
            System.out.print("Tipo evento (batalla/tratado/reunion): ");
            String tipo = tcl.nextLine();

            boolean usaNucleares = false;
            if (tipo.equals("batalla")) {
                System.out.print("¿Usó armas nucleares? (true/false): ");
                usaNucleares = tcl.nextBoolean();
                System.out.print("Porcentaje de bajas (0-100): ");
                int bajas = tcl.nextInt();
                tcl.nextLine();

                Eventos evento = new Eventos(nomEvento, d, m, a, ubic, desc, tipo, usaNucleares, bajas);
                conflicto.agregarEvento(evento);
            } else {
                Eventos evento = new Eventos(nomEvento, d, m, a, ubic, desc, tipo, false, 0);
                conflicto.agregarEvento(evento);
            }
        }

        System.out.println("--- INFO DEL CONFLICTO ---");
        conflicto.mostrarConflicto();
    }
    
}
