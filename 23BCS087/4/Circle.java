package com.raja.oopslanb.shapes;
import java.util.Scanner;
public class Circle implements Shape
{ double area = 0.0;
@Override
public void printArea() {
System.out.println("\nCircle");
System.out.println("-------\n");
Scanner input = new Scanner(System.in);
System.out.println("Enter Radius of Circle : ");
this.length = input.nextDouble();
this.area = Math.PI * this.length * this.length;
System.out.println("Area of the Circle is : " + this.area);
}
}