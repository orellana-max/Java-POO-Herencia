package herencia;

import vehiculos.Auto;
import vehiculos.Moto;
import vehiculos.Vehiculo;

/**
 * @author Maximiliano Orellana mi perfil en GitHub:
 * https://github.com/orellana-max
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Vehiculo v = new Vehiculo();
        // vemos que no se puede acceder al atributo marca xq estan en otro paquete
        // aunque este este protected
        //System.out.println(v.marca);
        
        
        Auto a = new Auto(true, "Ford", "Mustang", "MD 007 XD");
        a.acelerar();
        
        Moto m = new Moto(50, "Bajaj", "Rouser 135", "789 MDO");
        m.hacerWheliee();
        
        
       // m.chequearMotor();
        m.encender();
        
    }
    
}
