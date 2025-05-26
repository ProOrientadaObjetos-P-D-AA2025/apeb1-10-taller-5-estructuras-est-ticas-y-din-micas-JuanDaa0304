package sistemadeventas;

public class Producto {
    String nomProducto;
    double precio;
    int cantidad;

    public Producto(String nomProducto, double precio, int cantidad) {
        this.nomProducto = nomProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
