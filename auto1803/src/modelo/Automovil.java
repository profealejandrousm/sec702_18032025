/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario-1
 */
public class Automovil {
    private String marca;
    private String modelo;
    private int año;
    private double gasolina;
    
    //CONSTRUCTOR DEFAULT
    public Automovil(){
        
    }

    //MUTADORES GETTERS y SETTERS
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca) throws Exception{
        if (!marca.isBlank() && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            throw new Exception("Debe agregar marca");
        }
    }
    
    public void setGasolina(double gasolina) throws Exception{
      
        if (gasolina>=0 && gasolina<=110) {
            this.gasolina = gasolina;
        }else{
            throw new Exception("Gasolina debe estar entre 0-110");
        }
    }
    
    public double getGasolina(){
        return this.gasolina;
    }
}
