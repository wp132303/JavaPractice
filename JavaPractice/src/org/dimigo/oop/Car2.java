/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 * 
 * @author	: 경연
 * @version	: 1.0
 */

public class Car2 {
	private String company;
	private	String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2() {
		
	}
	
	public Car2(String acompany, String amodel, String acolor, int amaxSpeed, int aprice){
		company = acompany;
		model = amodel;
		color = acolor;
		maxSpeed = amaxSpeed;
		price = aprice;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCompany(String acompany) {
		company = acompany;
	}
	
	public void setModel(String amodel) {
		model = amodel;
	}
	
	public void setColor(String acolor) {
		color = acolor;
	}
	
	public void setMaxSpeed(int amaxSpeed) {
		maxSpeed = amaxSpeed;
	}
	
	public void setPrice(int aprice) {
		price = aprice;
	}
	
}
