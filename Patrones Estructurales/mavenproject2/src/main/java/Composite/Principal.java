
package Composite;


public class Principal {

    
    public static void main(String[] args) {
        
        Producto P1 = new Producto("Producto1", 100);
        Producto P2 = new Producto("Producto2", 200);
        
        Paquete Paq1 = new Paquete("General");
        Paq1.agregar(P1);
        Paq1.agregar(P2);
        
        System.out.print("Producto 1: ");
        P1.mostrarPrecio();
        
        System.out.print("Producto 2: ");
        P2.mostrarPrecio();
        
        
        
        System.out.print("Paquete");
        Paq1.mostrarPrecio();
        
    }
    
}
