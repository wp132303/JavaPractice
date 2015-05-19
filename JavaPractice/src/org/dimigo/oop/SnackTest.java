/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *  |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * 
 * @author	: 경연
 * @version	: 1.0
 */

public class SnackTest {
	public static void main(String[] args) {
		int tot = 0;
		Snack snack[] = {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4),
		};
		
		for (int i=0; i<snack.length; i++) {
			snack[i].printSnack();
			tot += snack[i].calcPrice();
		}
		
		System.out.println("총 구매 금액 : " + tot + "원");
	}
}
