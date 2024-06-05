package Demojavabean;

import java.util.Scanner;

public class calculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int findArea;
		System.out.print("choose any shape:");
		System.out.print("1. square");
		System.out.print("2. Rectangle");
		System.out.print("3. Circle");
		System.out.println("Enter your choice:");
		findArea = sc.nextInt();
		
		

		Scanner scanner;
		switch (findArea) {
		case 1:
			System.out.print("Enter side of length of the square:");
			double side = scanner.nextDouble();
			double squareArea = side*side;
			System.out.println("Area of the square:"+ squareArea);
			break;
		case 2:
			System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            double rectangleArea = length * width;
            System.out.println("Area of the rectangle: " + rectangleArea);
            break;
            
		case 3:
			 System.out.print("Enter the radius of the circle: ");
             double radius = scanner.nextDouble();
             double circleArea = Math.PI * radius * radius;
             System.out.println("Area of the circle: " + circleArea);
             break;
             
             default:
            	 System.out.println("Invalid choice!");
		}
		scanner.close();
	
		}
		

	}
}


