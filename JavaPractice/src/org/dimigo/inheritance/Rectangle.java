/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ Rectangle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 * 
 * @author	: primeheader
 * @version	: 1.0
 */

public class Rectangle extends Figure {
	private int width;
	private int height;
	/**
	 * @param centerX
	 * @param centerY
	 * @param width
	 * @param height
	 */
	public Rectangle(int width, int height) {
		this(0, 0, width, height);
	}
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return width * height;
	}
	
	protected void printCenter() {
		System.out.print("사각형 ");
		super.printCenter();
	}
}
