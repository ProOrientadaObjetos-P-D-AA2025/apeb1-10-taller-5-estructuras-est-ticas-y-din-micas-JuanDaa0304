package appfiscalia;

public class casoCorrupcion {
    String nombreCaso;
    int diaInicio;
    int mesInicio;
    int anioInicio;
    String estado; 
    Personas[] personas;
    int cantidadPersonas;

    public casoCorrupcion(String nombreCaso, int dia, int mes, int anio, int maxPersonas) {
        this.nombreCaso = nombreCaso;
        this.diaInicio = dia;
        this.mesInicio = mes;
        this.anioInicio = anio;
        this.estado = "Iniciado";
        personas = new Personas[maxPersonas];
        cantidadPersonas = 0;
    }

    public void agregarPersona(Personas p) {
        if (cantidadPersonas < personas.length) {
            personas[cantidadPersonas] = p;
            cantidadPersonas = cantidadPersonas + 1;
        } else {
            System.out.println("No se pueden agregar mas personas.");
        }
    }

    public int calcularDias(int dActual, int mActual, int aActual) {
        int diasInicio = anioInicio * 360 + mesInicio * 30 + diaInicio;
        int diasActual = aActual * 360 + mActual * 30 + dActual;
        int resultado = diasActual - diasInicio;
        return resultado;
    }

    public void actualizarEstado(int dActual, int mActual, int aActual) {
        int dias = calcularDias(dActual, mActual, aActual);

        if (dias > 14) {
            estado = "Urgente";
        } else if (dias > 7) {
            estado = "Alerta";
        } else {
            estado = "Iniciado";
        }
    }

    public void mostrarCaso() {
        System.out.println("Caso: " + nombreCaso);
        System.out.println("Fecha inicio: " + diaInicio + "/" + mesInicio + "/" + anioInicio);
        System.out.println("Estado: " + estado);
        System.out.println("Personas implicadas:");

        for (int i = 0; i < cantidadPersonas; i++) {
            personas[i].mostrarPersona();
        }
    }
}