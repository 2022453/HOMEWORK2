/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Made the vehicle whereas i just had extended class vehicle 
       SoSStreet Ambulance = new SoSStreet ("Mercedez" , "Ambulance" , 4, 100);
       
        System.out.println(Ambulance);
        
        
        //creating the vehicle 
        MultipleVehicles car = new MultipleVehicles();
            car.make = "Toyota";
            car.type = "Private";
           car.speed = 90;
       
           // to string to see the information about it 
        System.out.println(car.toString());
        
        // getting the speed of the car
        System.out.println(car.getSpeed());
        
        
        
        // tried to initiate a boat 
        SoSSEA boat = new SoSSEA();
        
        boat.isSailHoisted();
        
        System.out.println("  SAil HOISTED CAPTAIN?? " + boat.isSailHoisted() + " We can continue");
        
      
        
        // initialising a plane.
        AirCraft plane1 = new AirCraft();
                  
        plane1.make = "Norway airways";
     
        
        System.out.println(plane1.getMake());
        
       
        AirCraft plane2 = new AirCraft();
        
        plane2.type = "International";
        
        System.out.println(plane2.getType());
        
        
        
        
        
        
    }
    
  
    
}
