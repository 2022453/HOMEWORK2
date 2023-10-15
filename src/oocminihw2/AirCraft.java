/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author paulooliveira
 */
public class AirCraft implements Flyable{
    
    private float altitude;
    private float speed;
    protected String make;
    protected String type;
    
    @Override
    public void changeAltitude(float change) {
        
    }

    @Override
    public float getAltitude() {
        return altitude;
    }

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
        return altitude;
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
    
}
