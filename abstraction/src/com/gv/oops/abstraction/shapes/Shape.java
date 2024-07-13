package com.gv.oops.abstraction.shapes;

abstract class Shape {
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void display() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
