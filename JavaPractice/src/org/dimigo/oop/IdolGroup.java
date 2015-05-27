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

public class IdolGroup {
	public static void main(String[] args) {
		String[][] group = new String[][]{
				{"빅뱅", "GD", "태양", "TOP", "대성", "승리"},
				{"2NE1", "박봄", "산다라박", "공민지", "씨엘"},
				{"걸스데이", "유라", "혜리", "소진", "민아"}
		};
		
		for (int i =0; i<group.length; i++) {
			for (int j=0; j<group[i].length; j++) {
				if (j==0)
					System.out.println("<< " + group[i][j] + " >>");
				System.out.println(group[i][j]);
			}
		}
		
	}
}
