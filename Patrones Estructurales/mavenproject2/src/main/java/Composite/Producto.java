package Composite;

public class Producto implements Componente {

    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    

    @Override
    public void mostrarPrecio() {
        
        System.out.println(nombre + ": $"+ precio);
    }

}
