/**
 * 
 */
package com.ss.shape;

import java.lang.Math;

/**
 * @author Anthony
 *
 */
public class Circle implements Shape{

	Float radius;
	
	public Circle(Float radius) {
		this.radius = radius;
	}
	
	@Override
	public Float calculateArea() {
		return (float)Math.PI * radius*radius;
	}

	@Override
	public void display() {
		System.out.println("Area = " + this.calculateArea());
		
	}
	

}
