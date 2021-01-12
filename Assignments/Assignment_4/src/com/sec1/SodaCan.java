package com.sec1;

public class SodaCan {
    private float height;
    private float diameter;

    // Constructor
    // Receives the height and diameter
    public SodaCan(float height, float diameter){
        this.height = height;
        this.diameter = diameter;
    }
    // Calculates the volume of a Soda Can
    // Returns the result as float
    public float getVolume(){
          double radius = diameter/2;
          return (float) (Math.PI * Math.pow(radius,2) * height);
    }

    // Calculates the Surface Area of a Soda Can
    // Returns the result as float
    public float getSurfaceArea(){
        double radius = diameter/2;
        return (float)((2 * Math.PI * Math.pow(radius,2)) + (2 * Math.PI * radius * height));
    }
}
