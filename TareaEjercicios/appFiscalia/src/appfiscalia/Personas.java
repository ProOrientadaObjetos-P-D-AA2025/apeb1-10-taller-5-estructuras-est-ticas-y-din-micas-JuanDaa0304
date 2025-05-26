package appfiscalia;

public class Personas {
    String nombre;
    int edad;
    String ocupacion;
    String nivelImplicacion; 
    double sentencia; 
    double danoEconomico;

    public Personas(String nombre, int edad, String ocupacion, String nivelImplicacion, double sentencia, double danoEconomico) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
        this.sentencia = sentencia;
        this.danoEconomico = danoEconomico;
    }

    public boolean esAcusado() {
        if (nivelImplicacion == "acusado") {
            return true;
        } else {
            return false;
        }
    }

    public boolean puedeReducirPena() {
        if (esAcusado() == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean puedePagarFianza() {
        if (esAcusado() == true && sentencia < 1) {
            return true;
        } else {
            return false;
        }
    }

    double maxFianza() {
        return danoEconomico * 0.5;
    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ocupacion: " + ocupacion);
        System.out.println("Nivel implicacion: " + nivelImplicacion);
        if (esAcusado() == true) {
            System.out.println("Sentencia (anios): " + sentencia);
            System.out.println("Daño económico: $" + danoEconomico);
            System.out.println("Puede reducir pena: Si");
            if (puedePagarFianza() == true) {
                System.out.println("Puede pagar fianza: Si");
                System.out.println("Fianza maxima: " + maxFianza());
            } else {
                System.out.println("Puede pagar fianza: No");
            }
        }
    }

}
