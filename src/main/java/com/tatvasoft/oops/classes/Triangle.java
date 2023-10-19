package com.tatvasoft.oops.classes;

import com.tatvasoft.oops.interfaces.Shape;

public class Triangle implements Shape{
	
	double base;
	double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}

	@Override
	public String getColor() {
		return "Yellow";
	}

}
