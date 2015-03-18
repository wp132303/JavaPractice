package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args) {
		int O0O0 = 1700000;
		int OO00 = 3;
		int OOO0 = 1500;
		long O000 = (long)O0O0 * 12 * OO00 * OOO0;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		
		System.out.println("월 평균 급여 : " + String.format("%,d", O0O0) + "원");
		
		System.out.println("점포 내 직원 수 : " + String.format("%,d", OO00) + "명");
		
		System.out.println("점포 수 : " + String.format("%,d", OOO0) + "원");
		
		System.out.print("연간 안건비 : " + String.format("%,d", O000) + "원");
	}
}
