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

public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String singer_a = "태연";
		String actress_a  = "신세경";
		String sub_a    = "자바";
		
		System.out.println("가장 좋아하는 가수는?");
		String answer = scanner.nextLine();
		if (singer_a.equals(answer))
			System.out.println("정답입니다!! ^^");
		else
			System.out.println("틀렸습니다!! ㅜㅜ");
		
		System.out.println("가장 좋아하는 배우는?");
		answer = scanner.nextLine();
		if (actress_a.equals(answer))
			System.out.println("정답입니다!! ^^");
		else
			System.out.println("틀렸습니다!! ㅜㅜ");
	
		
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		if (sub_a.equals(answer))
			System.out.println("정답입니다!! ^^");
		else
			System.out.println("틀렸습니다!! ㅜㅜ");
		scanner.close();
	
	}
}
