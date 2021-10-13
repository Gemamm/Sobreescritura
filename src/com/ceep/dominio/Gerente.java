
package com.ceep.dominio;


public class Gerente  extends Empleado{
    
   private String dpto;

    public Gerente(String dpto, double sueldo, String nombre) {
        super(sueldo, nombre);
        this.dpto = dpto;
    }

    public Gerente(String dpto) {
        this.dpto = dpto;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }
   
    public String mostrarDetallesGerente(){
       return super.mostrarDetalles() + "\tGerente: " +this.dpto;
       // System.out.println("Gerente: " +this.nombre + " , " +this.sueldo
       // +this.dpto);
    }
   
    
}
