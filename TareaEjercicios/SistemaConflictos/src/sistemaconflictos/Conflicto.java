package sistemaconflictos;

class Conflicto {
    String nombre;
    String[] paisesInvolucrados;
    int cantidadPaises;
    int diaInicio, mesInicio, anioInicio;
    String estadoActual;  
    Eventos[] eventos;
    int cantidadEventos;

    static int TOTAL_PAISES_MUNDO = 195; 
    String[] paisesDesarrollados = {"USA", "Canada", "Reino Unido", "Alemania", "Francia", "Japon", "Australia"};

    public Conflicto(String nombre, String[] paisesInvolucrados, int diaInicio, int mesInicio, int anioInicio, int maxEventos) {
        this.nombre = nombre;
        this.paisesInvolucrados = paisesInvolucrados;
        this.cantidadPaises = paisesInvolucrados.length;
        this.diaInicio = diaInicio;
        this.mesInicio = mesInicio;
        this.anioInicio = anioInicio;
        this.estadoActual = "Normal";
        this.eventos = new Eventos[maxEventos];
        this.cantidadEventos = 0;
    }

    public void agregarEvento(Eventos e) {
        if (cantidadEventos < eventos.length) {
            eventos[cantidadEventos] = e;
            cantidadEventos++;
            actualizarEstado();
        } else {
            System.out.println("No se pueden agregar mas eventos.");
        }
    }

    public boolean esPaisDesarrollado(String pais) {
        for (int i = 0; i < paisesDesarrollados.length; i++) {
            if (pais.equals(paisesDesarrollados[i])) {
                return true;
            }
        }
        return false;
    }

    public void actualizarEstado() {
        int batallas = 0;
        int batallasEnPaisesDesarrolladosConNucleares = 0;
        boolean convocarONU = false;

        for (int i = 0; i < cantidadEventos; i++) {
            Eventos evento = eventos[i];
            if (evento.tipoEvento.equals("batalla")) {
                batallas++;

                if (evento.usaArmasNucleares && esPaisDesarrollado(evento.ubicacion)) {
                    batallasEnPaisesDesarrolladosConNucleares++;
                }

                if (evento.porcentajeBajas >= 50) {
                    convocarONU = true;
                }
            }
        }

        double porcentajeBatallas = ((double) batallas / TOTAL_PAISES_MUNDO) * 100;
        if (porcentajeBatallas >= 50 || batallasEnPaisesDesarrolladosConNucleares > 0) {
            estadoActual = "Guerra mundial";
        } else if (porcentajeBatallas >= 30 && porcentajeBatallas < 50) {
            estadoActual = "Reunión urgente ONU";
        } else if (convocarONU) {
            estadoActual = "Reunión urgente ONU";
        } else {
            estadoActual = "Normal";
        }
    }

    public void mostrarConflicto() {
        System.out.println("Conflicto: " + nombre);
        System.out.print("Paises involucrados: ");
        for (int i = 0; i < cantidadPaises; i++) {
            System.out.print(paisesInvolucrados[i]);
            if (i < cantidadPaises - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Fecha inicio: " + diaInicio + "/" + mesInicio + "/" + anioInicio);
        System.out.println("Estado actual: " + estadoActual);
        System.out.println("Eventos registrados:");

        for (int i = 0; i < cantidadEventos; i++) {
            eventos[i].mostrarEvento();
        }
    }
}