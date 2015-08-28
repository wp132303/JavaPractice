/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *  |_ SmartPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 28.
 * </pre>
 * 
 * @author	: primeheader
 * @version	: 1.0
 */

public class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone() {
		
	}

	/**
	 * @param model
	 * @param company
	 * @param price
	 */
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
		
	}
	
	public void pay() {
		System.out.println(company + "페이로 결제합니다.");
	}
	
	public void useSpecialFunction() {
		if (this instanceof IPhone) {
			IPhone d = (IPhone)this;
			d.useAirDrop();
		}
		else {
			Galaxy d = (Galaxy)this;
			d.useWirelessCharging();
		}
			
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SmartPhone [model=" + model + ", company=" + company
				+ ", price=" + price + "]";
	}
	
	
	
	
}
