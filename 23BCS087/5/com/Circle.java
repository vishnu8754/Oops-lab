package com.raja.oopslanb.shapes;

import java.util.Scanner;

public class Circle implements Shape {
    private double radius;
    private double area;

    @Override
    public void printArea() {
        System.out.println("\nCircle");
        System.out.println("-------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius of Circle : ");
        this.radius = input.nextDouble();
        this.area = Math.PI * this.radius * this.radius;
        System.out.println("Area of the Circle is : " + this.area);
    }
}
