package Demojavabean;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the length of the side of the square: ");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of the square: " + squareArea);
                break;
            case 2:
                System.out.print("Enter the length and width of the rectangle: ");
                double length = scanner.nextDouble();
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
                System.out.println("Invalid choice! Please choose between 1 to 3.");
        }

        scanner.close();
    }
}