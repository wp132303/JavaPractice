/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *  |_ Runner
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 * 
 * @author	: primeheader
 * @version	: 1.0
 */

public class Runner2 implements Runnable{
	private String name;

	/**
	 * @param name
	 */
	public Runner2(String name) {
		super();
		this.name = name;
	}
	
	public Runner2() {
		
	}
	
	public void run() {
		System.out.println(name + " 출발");
		
		
		for (int l = 100; l>=0; l-=10) {
		System.out.println(name + " " + l + " 미터");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		System.out.println(name + " 골인");
	}
	
	
}
