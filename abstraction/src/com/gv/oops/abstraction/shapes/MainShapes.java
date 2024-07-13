package com.gv.oops.abstraction.shapes;

public class MainShapes {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle details:");
        circle.display(); // Should show area and perimeter of the circle

        System.out.println("\nRectangle details:");
        rectangle.display(); // Should show area and perimeter of the rectangle
    }
}

