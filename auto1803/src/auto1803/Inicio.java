/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package auto1803;

import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Automovil;

/**
 *
 * @author Usuario-1
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
           
            Automovil car = new Automovil();
            System.out.println(car);
            car.setGasolina(50);
            car.setMarca(" ");
            
            System.out.println(car.getGasolina());
            System.out.println(car.getMarca());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
       
        
    }

}
