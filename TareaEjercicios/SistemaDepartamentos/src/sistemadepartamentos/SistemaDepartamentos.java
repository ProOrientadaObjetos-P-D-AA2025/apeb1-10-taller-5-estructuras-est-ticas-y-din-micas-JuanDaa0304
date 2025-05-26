package sistemadepartamentos;

import java.util.Scanner;

public class SistemaDepartamentos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese nombre de la empresa: ");
        String nombreEmpresa = tcl.nextLine();
        System.out.print("Ingrese RUC de la empresa: ");
        String ruc = tcl.nextLine();
        System.out.print("Ingrese direccion de la empresa: ");
        String direccion = tcl.nextLine();
        System.out.print("¿Cuantos departamentos tiene la empresa?: ");
        int cantidad = tcl.nextInt();

        Empresa empresa = new Empresa(nombreEmpresa, ruc, direccion, cantidad);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("... Departamento " + (i + 1) + " ...");
            tcl.nextLine();

            System.out.print("Nombre del departamento: ");
            String nombre = tcl.nextLine();
            System.out.print("Numero de empleados: ");
            int empleados = tcl.nextInt();
            System.out.print("Produccion anual: ");
            double produccion = tcl.nextDouble();
            Departamento dep = new Departamento(nombre, empleados, produccion);
            empresa.agregarDepartamento(dep, i);
        }
        System.out.println("-- RESULTADOS --");
        empresa.mostrarDepartamentos();
    }
}
