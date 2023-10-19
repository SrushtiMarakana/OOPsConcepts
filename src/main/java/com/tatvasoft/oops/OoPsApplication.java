package com.tatvasoft.oops;

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
		
		Shape triangle = new Triangle(5, 10);
		Shape square = new Square(4);
		Shape rectangle = new Rectangle(4, 8);	
		
		System.out.println("Traiangle area : " + triangle.calculateArea());
		System.out.println("Square area : " + square.calculateArea());
		System.out.println("Rectangle area : " + rectangle.calculateArea());
		
		System.out.println("Traiangle color : " + triangle.getColor());
		System.out.println("Square color : " + square.getColor());
		System.out.println("Rectangle color : " + rectangle.getColor());
	}

}
