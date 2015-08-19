/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ Triangle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 * 
 * @author	: primeheader
 * @version	: 1.0
 */

public class Triangle extends Figure {
	private int width;
	private int height;
	/**
	 * @param centerX
	 * @param centerY
	 * @param width
	 * @param height
	 */
	public Triangle(int width, int height) {
		this(0, 0, width, height);
	}
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return 0.5 * width * height;
	}
	
	protected void printCenter() {
		System.out.print("삼각형 ");
		super.printCenter();
	}
}
