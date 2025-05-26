
package sistemadepartamentos;

public class Departamento {
    String nombre;
    int numEmpleados;
    double produccionAnual;
    String categoria;

    public Departamento(String nombre, int numeroEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numEmpleados = numEmpleados;
        this.produccionAnual = produccionAnual;
        this.categoria = "D";

        
    }
    public void Categoria(){
        if (numEmpleados > 20 && produccionAnual > 1000000) {
            categoria = "A";
        } else if (numEmpleados >= 20 && produccionAnual >= 1000000) {
            categoria = "B";
        } else if (numEmpleados >= 10 && produccionAnual >= 500000) {
            categoria = "C";
        }
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Empleados: " + numEmpleados);
        System.out.println("Producción Anual: " + produccionAnual);
        System.out.println("Categoría: " + categoria);
    }
}
