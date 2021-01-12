package sec1;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int length){
        super();
        setLocation(x, y);
        setSize(width, length);
    }

    // Calculate the Perimeter of a rectangle
    // Return -1 if the input is invalid
    public double getPerimeter(){
        if (getHeight()<0 || getWidth()<0){
            System.out.println("Input Invalid");
            return -1;
        }
        return 2*( getHeight() + getWidth());
    }

    // Calculate the Area of a rectangle
    // Return -1 if the input is invalid
    public double getArea(){
        if (getHeight()<0 || getWidth()<0){
            System.out.println("Input Invalid");
            return -1;
        }
        return (getWidth() * getHeight());
    }
}
