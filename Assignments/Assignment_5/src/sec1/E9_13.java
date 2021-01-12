package sec1;

import java.awt.Rectangle;

public class E9_13 {

    public static void main(String[] args) {


        // 1. Positive test
        BetterRectangle myRectangle1 = new BetterRectangle(0,0,7,3);
        System.out.println("POSITIVE TEST");
        if (myRectangle1.getPerimeter()>0 && myRectangle1.getArea()>0){
            System.out.println("Area of the rectangle is: " + myRectangle1.getArea());
            System.out.println("Perimeter of the rectangle is: " + myRectangle1.getPerimeter());
        }

        // 2. Negative test
        BetterRectangle myRectangle2 = new BetterRectangle(0,0,-2,-3);
        System.out.println("\nFIRST NEGATIVE TEST");
        if (myRectangle2.getPerimeter()>0 && myRectangle1.getArea()>0){
            System.out.println("Area of the rectangle is: " + myRectangle2.getArea());
            System.out.println("Perimeter of the rectangle is: " + myRectangle2.getPerimeter());
        }

        // 3. Negative test
        BetterRectangle myRectangle3 = new BetterRectangle(0,0,-7,0);
        System.out.println("\nSECOND NEGATIVE TEST");
        if (myRectangle3.getPerimeter()>0 && myRectangle1.getArea()>0){
            System.out.println("Area of the rectangle is: " + myRectangle3.getArea());
            System.out.println("Perimeter of the rectangle is: " + myRectangle3.getPerimeter());
        }
    }
}
