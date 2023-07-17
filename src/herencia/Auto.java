/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author maxi
 */
public class Auto extends Vehiculo{
    boolean tieneAire;
    
    void prenderAire(){
        if (tieneAire) {
            System.out.println("Prendiendo el aire . . .");
        }
    }
}
