package com.tatvasoft.oops.classes;

import com.tatvasoft.oops.interfaces.Shape;

public class Rectangle implements Shape{
	
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}

	@Override
	public String getColor() {
		return "red";
	}

}
