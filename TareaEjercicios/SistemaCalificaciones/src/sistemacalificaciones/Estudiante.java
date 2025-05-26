package sistemacalificaciones;
import java.util.Scanner;

public class Estudiante {

    public String nombre;
    public int edad;
    public Materia materia;
    public String nombreMateria;

    Scanner tcl = new Scanner(System.in);

    
    
    public Estudiante(String nombre, int edad,String nombreMateria,Materia materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreMateria = nombreMateria;
        this.materia = materia;
    }
    public String getNombreMateria() {
        return nombreMateria;
    }
    
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void Aprobacion(){
        double notaFinal = materia.calcularNota();
        if (notaFinal >= 7) {
            System.out.println("Aprobado con nota de: "+notaFinal);
        } else {
            System.out.println("Reprobado con nota de: "+notaFinal);
            System.out.println("Debera rendir un examen de recuperacion sobre 3.5/10 PTOS"); 
            System.out.print("Ingrese nota de recuperacion sobre 3.5 ptos: ");
            double notaRecuperacion = tcl.nextDouble();
            double nuevaNota = materia.Porcentaje()+notaRecuperacion;
            if (nuevaNota >= 7) {
                System.out.println("Aprobada recuperacion con nota de: "+nuevaNota);
            } else {
                System.out.println("Reprobada recuperacion con nota de: "+nuevaNota);

            }
            
           
        }
    }
}
