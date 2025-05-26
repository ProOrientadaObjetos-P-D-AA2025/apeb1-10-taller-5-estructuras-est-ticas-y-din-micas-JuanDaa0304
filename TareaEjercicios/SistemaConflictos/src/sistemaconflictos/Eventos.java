package sistemaconflictos;


class Eventos {
    String nombreEvento;
    int dia, mes, anio;
    String ubicacion;
    String descripcion;
    String tipoEvento; 
    boolean usaArmasNucleares;
    int porcentajeBajas;

    public Eventos(String nombreEvento, int dia, int mes, int anio, String ubicacion, String descripcion,
                  String tipoEvento, boolean usaArmasNucleares, int porcentajeBajas) {
        this.nombreEvento = nombreEvento;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.tipoEvento = tipoEvento;
        this.usaArmasNucleares = usaArmasNucleares;
        this.porcentajeBajas = porcentajeBajas;
    }

    public void mostrarEvento() {
        System.out.println("Evento: " + nombreEvento);
        System.out.println("Fecha: " + dia + "/" + mes + "/" + anio);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Tipo: " + tipoEvento);
        if (tipoEvento.equals("batalla")) {
            System.out.println("Uso armas nucleares: " + (usaArmasNucleares ? "Sí" : "No"));
        }
        System.out.println("Porcentaje bajas: " + porcentajeBajas);
    }
}