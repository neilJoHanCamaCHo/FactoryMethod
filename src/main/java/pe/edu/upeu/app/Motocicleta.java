/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app;

/**
 *
 * @author neilc
 */
public class Motocicleta implements Transporte {

    @Override
    public void arrancar() {
        System.out.println("Estoy arrancando la Motocicleta");
    }

    @Override
    public void detener() {
        System.out.println("Estoy deteniendo al Motocicleta");
    }

    @Override
    public String tipo() {
        return "Motocicleta";
    }
    
}
