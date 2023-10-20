package com.tatvasoft.oops.classes;

import com.tatvasoft.oops.interfaces.Shape;

public class Square implements Shape{
	
	double length;
	
	public Square() {
		super();
	}

	public Square(double length) {
		super();
		this.length = length;
	}

	@Override
	public double calculateArea() {
		return length * length;
	}

	@Override
	public String getColor() {
		return "Green";
	}
	
}
