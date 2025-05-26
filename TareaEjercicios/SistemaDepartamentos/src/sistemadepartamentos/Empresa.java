
package sistemadepartamentos;

public class Empresa {
    String nombre;
    String ruc;
    String direccion;
    Departamento[] departamentos;

    public Empresa(String nombre, String ruc, String direccion, int cantidad) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        departamentos = new Departamento[cantidad];
    }

    public void agregarDepartamento(Departamento depa, int posicion) {
        departamentos[posicion] = depa;
    }

    public void mostrarDepartamentos() {
        System.out.println("EMPRESA: " + nombre);
        System.out.println("RUC: " + ruc);
        System.out.println("DIRECCIÓN: " + direccion);

        for (int i = 0; i < departamentos.length; i++) {
            if (departamentos[i] != null) {
                departamentos[i].mostrarDatos();
            }
        }
    }
}
