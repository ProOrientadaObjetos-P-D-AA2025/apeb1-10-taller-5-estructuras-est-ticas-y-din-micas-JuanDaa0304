package sistemadeventas;

import java.util.Scanner;

public class SistemaDeVentas {
    
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto: ");
        String nombreProducto = tcl.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        double precio = tcl.nextDouble();
        System.out.println("Ingrese la cantidad disponible del producto: ");
        int cantidadDisponible = tcl.nextInt();
        Producto producto1 = new Producto(nombreProducto, precio, cantidadDisponible);
        
        CarritoDeCompras carrito = new CarritoDeCompras();
        
        System.out.println("Ingrese la cantidad que desea comprar: ");
        int cantidadComprar = tcl.nextInt();
        carrito.agregarProducto(nombreProducto, cantidadComprar, producto1);
        
        carrito.mostrarDetalleCompra();
        
        System.out.println("Ingrese el monto pagado: ");
        double montoPagado = tcl.nextDouble();
        double descuento = 100.00; 
        carrito.realizarPago(montoPagado, descuento);
        
    }
}
