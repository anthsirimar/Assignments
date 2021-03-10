/**
 * 
 */
package com.ss.shape;

/**
 * @author Anthony
 *
 */
public class Triangle implements Shape{

	Float base;
	Float height;
	
	Triangle(Float base, Float height){
		this.base = base;
		this.height = height;
	}
	
	@Override
	public Float calculateArea() {
		return 0.5f * base * height;
	}

	@Override
	public void display() {
		System.out.println("Area = " + this.calculateArea());
		
	}

}
