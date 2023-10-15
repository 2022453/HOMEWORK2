/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author paulooliveira
 */
public class SoSStreet extends Vehicle {

    //MADE THEM FINAL TO GET THEM IN THE MAIN 
    private final  String make;
    private  final String type;
    
    
    //MADE THIS METHOD TO CREATE THE VEHICLE.
    public SoSStreet(String make, String type, int numWheels, float speed) {
       
        this.numWheels = numWheels;
        this.speed = speed;
        this.make = make;
        this.type = type;
   
    }
  
    
    // TO STRING TO GET ITS INFORMATION. 
    public String toString() {
        return "This vehicle is a " + make + " of type " +  type + " it has " +  numWheels + " wheels and it in a speed of " + speed + " KM/H!"; 
    }
    

    
}
