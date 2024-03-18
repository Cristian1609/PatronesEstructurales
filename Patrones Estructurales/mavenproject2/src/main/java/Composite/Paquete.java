
package Composite;

import java.util.ArrayList;
import java.util.List;


public class Paquete implements Componente{
    
    private String nombre;
    private List<Componente> componentes = new ArrayList<>();

    public Paquete() {
    }

    public Paquete(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregar(Componente c){
        componentes.add(c);
    }
     public void eliminar(Componente c){
        componentes.remove(c);
    }

    @Override
    public void mostrarPrecio() {
        System.out.println(nombre);
        for (Componente componente : componentes) {
            componente.mostrarPrecio();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }
     
      
}
