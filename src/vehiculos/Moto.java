package vehiculos;

/**
 *
 * @author Maximiliano Orellana
 * mi perfil en GitHub: https://github.com/orellana-max
 */
public class Moto extends Vehiculo {
    
    private int anchoDeManubrio;
    
    public void hacerWheliee(){
        // codigo para ver si se tiene visibilidad del atributo marca heredado
        //System.out.println(marca);
        
        // se ve que podemos acceder y setear a null el campo marca en protected 
        //marca = null;
        // por eso debemos tener un setMarca() y marca en private
        System.out.println("Haciendo la Wheliee . . .");
    }
}
