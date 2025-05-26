package sistemacalificaciones;

public class Materia {
    
    private double ACD;
    private double APE;
    private double AA;

    public Materia(double ACD, double APE, double AA) {
        this.ACD = ACD;
        this.APE = APE;
        this.AA = AA;
    }
    public double getACD() {
        return ACD;
    }

    public void setACD(double ACD) {
        this.ACD = ACD;
    }

    public double getAPE() {
        return APE;
    }

    public void setAPE(double APE) {
        this.APE = APE;
    }

    public double getAA() {
        return AA;
    }

    public void setAA(double AA) {
        this.AA = AA;
    }

    
    public double calcularNota(){
        double nota;
        return nota = ACD + APE + AA ;
        
    }
    public double Porcentaje(){
        double porcentaje = calcularNota()*0.60;
        return porcentaje;     
    }
      
   
}
