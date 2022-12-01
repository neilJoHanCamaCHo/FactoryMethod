/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.app;

public class Aplicacion {

    public static void main(String[] args) {
        Transporte t1 = Fabrica.construir("Automovil");
        
        t1.arrancar();
        
        t1.detener();
        
        System.out.println(t1.tipo());

    }
}
 