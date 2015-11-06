/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *  |_ Race
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 * 
 * @author	: primeheader
 * @version	: 1.0
 */

public class Race2 {
	
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread d = new Thread(new Runner("홍길동"));
		Thread s = new Thread(new Runner("홍길순"));
		
		
		d.start();
		s.start();
		
		System.out.println("main thread end");
	}
}
