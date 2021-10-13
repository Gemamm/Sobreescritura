
package com.ceep.dominio;


public class Escritor extends Empleado{
    
    final TipoEscritura TipoEscritura;

    public Escritor(TipoEscritura TipoEscritura, double sueldo, String nombre) {
        super(sueldo, nombre);
        this.TipoEscritura = TipoEscritura;
    }

    public Escritor(TipoEscritura TipoEscritura) {
        this.TipoEscritura = TipoEscritura;
    }

    public TipoEscritura getTipoEscritura() {
        return TipoEscritura;
    }
    
    @Override
    public String mostrarDetalles(){
        return super.mostrarDetalles() + " Escritor: " + this.TipoEscritura;
        
    }
    
    
    
}
