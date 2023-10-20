package com.tatvasoft.oops;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tatvasoft.oops.classes.Rectangle;
import com.tatvasoft.oops.classes.Square;
import com.tatvasoft.oops.classes.Triangle;
import com.tatvasoft.oops.interfaces.Shape;

@SpringBootApplication
public class OoPsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OoPsApplication.class, args);

		Shape triangleColor = new Triangle();
		Shape squareColor = new Square();
		Shape rectangleColor = new Rectangle();

		try (Scanner scanner = new Scanner(System.in)) {
			int choice;

			do {
				System.out.println("1. Calaulate Square Area");
				System.out.println("2. Calaulate Rectangle Area");
				System.out.println("3. Calaulate Traiangle Area");
				System.out.println("4. Get Square Color");
				System.out.println("5. Get Rectange Color");
				System.out.println("6. Get Triangle Color");
				System.out.println("7. Exit \n");
				System.out.print("Please Enter your choice : ");

				choice = scanner.nextInt();
				switch (choice) {

				case 1:
					System.out.print("Enter Square length : ");
					Double lengthSquare = scanner.nextDouble();
					Shape square = new Square(lengthSquare);
					System.out.println("Square area : " + square.calculateArea() + "\n");
					break;

				case 2:
					System.out.print("Enter Rectangle length : ");
					Double length = scanner.nextDouble();
					System.out.print("Enter Rectangle width : ");
					Double width = scanner.nextDouble();
					Shape rectangle = new Rectangle(length, width);
					System.out.println("Rectangle area : " + rectangle.calculateArea() + "\n");
					break;

				case 3:
					System.out.print("Enter Triangle base : ");
					Double base = scanner.nextDouble();
					System.out.print("Enter Triangle height : ");
					Double height = scanner.nextDouble();
					Shape triangle = new Triangle(base, height);
					System.out.println("Triangle area : " + triangle.calculateArea() + "\n");
					break;

				case 4:
					System.out.println("Square Color : " + squareColor.getColor() + "\n");
					break;

				case 5:
					System.out.println("Rectangle Color : " + triangleColor.getColor() + "\n");
					break;

				case 6:
					System.out.println("Triangle Color : " + rectangleColor.getColor() + "\n");
					break;

				case 7:
					System.out.println("---------Thank you---------");
					break;

				default:
					System.out.println("Please enter valid choice Choice between 1 to 7 \n");
				}
			} while (choice != 7);
		}
	}

}
