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

public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 => ");
		int kor = scanner.nextInt();
	
		System.out.print("수학 점수 입력 => ");
		int mat = scanner.nextInt();
		
		System.out.print("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		int tot = kor + mat + eng;
		
		System.out.println();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<< 점수 출력 >>\n")
		  .append("국어 점수 : ")
		  .append(kor + "점\n")
		  .append("수학 점수 : ")
		  .append(mat + "점\n")
		  .append("영어 점수 : ")
		  .append(eng + "점\n")
		  .append("총점 : ")
		  .append(tot + " 점\n")
		  .append("평균 : ")
		  .append(String.format("%.1f", tot/3.0) + "점");
		
		System.out.println(sb);
	}
}
