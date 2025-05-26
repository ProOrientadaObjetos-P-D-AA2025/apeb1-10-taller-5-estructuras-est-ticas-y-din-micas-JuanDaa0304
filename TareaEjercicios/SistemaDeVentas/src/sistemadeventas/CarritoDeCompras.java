package sistemadeventas;

public class CarritoDeCompras {
    Producto producto;
    int cantidadComprada;

    public void agregarProducto(String nombre, int cantidad, Producto producto) {
        if (producto.cantidad >= cantidad) {
            this.producto = new Producto(nombre, producto.precio, cantidad);
            this.cantidadComprada = cantidad;
            System.out.println("Producto agregado: " + nombre + " con cantidad de: " + cantidad);
        } else {
            System.out.println("No hay suficiente cantidad disponible para " + nombre);
        }
    }

    public double calcularTotal() {
        return producto.precio * cantidadComprada;
    }

    public void realizarPago(double montoPagado, double descuento) {
        double total = calcularTotal();
        if (montoPagado >= total) {
            double totalConDescuento = total;
            if (total > 1000) {
                totalConDescuento -= descuento;
                System.out.println("Se aplico un descuento de: " + descuento);
            }
            System.out.println("Total a pagar: " + totalConDescuento);
            producto.cantidad -= cantidadComprada; 
        } else {
            System.out.println("Monto insuficiente. Faltan: " + (total - montoPagado));
        }
    }

    public void mostrarDetalleCompra() {
        System.out.println("Producto: " + producto.nomProducto + " cantidad: " + cantidadComprada);
    }
}
