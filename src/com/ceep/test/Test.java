
package com.ceep.test;

import com.ceep.dominio.Empleado;
import com.ceep.dominio.Gerente;


public class Test {
    
    
    public static void main(String[] args) {
        Empleado E1 = new Empleado(1500.00,"Gema");
       // System.out.println(E1.mostrarDetalles());
       imprimir(E1);
        Gerente G1  = new Gerente ("159", 1863.20,  "Luisa");
       // System.out.println(G1.mostrarDetallesGerente());
        imprimir(G1);
        determinarTipo(E1);
        determinarTipo(G1);
    }
    
    public static void imprimir(Empleado emp){
        System.out.println(emp.mostrarDetalles());
        
    }
    
    public static void determinarTipo(Empleado empleado){
        if( empleado instanceof Gerente){
            System.out.println("Empleado es de tipo gerente");
            System.out.println(((Gerente) empleado).getDpto());
        }
        else if(empleado instanceof Empleado){
             System.out.println("Empleado es de tipo empleado");
         }   
          else if (empleado instanceof Object){
               System.out.println("Empleado es de tipo object");
           }
        }
    }

