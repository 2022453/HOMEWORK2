/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author paulooliveira
 */
public class MultipleVehicles implements Drivable{
    
    
    //protected so then i could use then in the main class.
    protected float speed;
    private float direction;
    protected String make;
    protected String type;

    @Override
    public void accelerate(float speed) {
    }

    @Override
    public void brake() {
    }

    @Override
    public void turn(float angle) {
       
    }

    @Override
    public float getDirection() {
       return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getMake() {
     return make;
    }

    @Override
    public String getType() {
        return type;
    }
    
    // to String to bring the information when printing 
    public String toString() { 
        return " This car's brand is " + make +  " of type " + type +  " its currently speed is " + speed;
         
    }
}


