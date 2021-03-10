/**
 * 
 */
package com.ss.shape;

/**
 * @author Anthony
 *
 */
public class Rectangle implements Shape{
	
	Float width;
	Float height;
	
	Rectangle(Float width, Float height){
		this.width = width;
		this.height = height;
	}

	@Override
	public Float calculateArea() {
		return width * height;
	}

	@Override
	public void display() {
		System.out.println("Area = " + this.calculateArea());
	}

}
