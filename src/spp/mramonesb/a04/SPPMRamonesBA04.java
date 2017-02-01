// MARIELA RAMONES BALVOA- A01411449- IMT
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mramonesb.a04;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SPPMRamonesBA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Funciones trigonometricas");
    Scanner kb= new Scanner (System.in);
    //Paso 1. variables 
    int opEntrada;
    double resultado;
    double angulo;
    //paso 2. Menú

    System.out.println("1. Calcular Tangente");
    System.out.println("2. Calcular Seno");
    System.out.println("3. Calcular Coseno");
    System.out.println("4. Salir");
    
    //paso3. operaciones 
    opEntrada= kb.nextInt();
    
    switch(opEntrada){
        case 1:
            System.out.println("Introduce el angulo");
            angulo= kb.nextDouble();
            resultado= Math.tan(Math.toRadians(angulo));
            System.out.println("Tangente de " + angulo + "º = " + resultado);
            break;
        
        case 2:
            System.out.println("Introduce el angulo");
            angulo= kb.nextDouble();
            resultado= Math.sin(Math.toRadians(angulo));
            System.out.println("Seno de " + angulo + "º =" + resultado);
            break;
        
        case 3:
           System.out.println("Introduce el angulo");
           angulo= kb.nextDouble();
           resultado= Math.cos(Math.toRadians(angulo));
           System.out.println("Coseno de " + angulo + "º =" + resultado); 
           break;
            
    }
    
    
    
    }
    
}
