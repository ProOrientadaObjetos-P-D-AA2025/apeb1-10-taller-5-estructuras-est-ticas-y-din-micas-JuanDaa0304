package sistemacalificaciones;
import java.util.Scanner;

public class SistemaCalificaciones {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = tcl.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = tcl.nextInt();
        System.out.print("Ingrese el nombre de la materia: ");
        String NombreMateria = tcl.next();
        
        System.out.print("Ingrese la nota ACD(3.5 ptos)");
        double notaACD = tcl.nextDouble();
        System.out.print("Ingrese la nota APE(3.5 ptos)");
        double notaAPE = tcl.nextDouble();
        System.out.print("Ingrese la nota AA(3 ptos)");
        double notaAA = tcl.nextDouble();

        Materia materia = new Materia(notaACD,notaAPE,notaAA);
        Estudiante estudiante = new Estudiante(nombreEstudiante,edad,NombreMateria,materia);
        estudiante.Aprobacion();

    }
    
}
