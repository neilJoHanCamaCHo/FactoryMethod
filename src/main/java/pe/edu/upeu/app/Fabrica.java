/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app;

/**
 *
 * @author neilc
 */
public class Fabrica {

    public static Transporte construir(String tipo) {
        switch (tipo){
            case "Motocicleta":
                return new Motocicleta();
            case "Automovil":
                return new Automovil();
            default:
                System.out.println("No se encuentra dicho objeto en la fabrica");
                return null;
            }
        }
    }

    