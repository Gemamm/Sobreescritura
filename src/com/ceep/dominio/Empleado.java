
package com.ceep.dominio;


public class Empleado {
    protected double sueldo;
    protected String nombre;

    public Empleado(double sueldo, String nombre) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }
    public Empleado(){
        
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String mostrarDetalles(){
        return "Empleado: "+this.nombre+ ", " +this.sueldo;
        
        
        
    }
    
}
