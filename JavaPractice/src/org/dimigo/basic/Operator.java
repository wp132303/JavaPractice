package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int s1 = 9, s2 = 10;
		double sh = 5.8;
		
		int p = 9;
		double ph = 5.4;
		
		double sn = (s1 + s2)*sh/2;
		double pn = p*ph;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + sn);
		System.out.println("평행사변형 넓이 : " + pn);
		
		if (sn > pn)
			System.out.println("사다리꼴이 평행사변형 보다 " + (sn - pn) + "더 큽니다");
		else if (sn == pn)
			System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다");
		else
			System.out.println("평행사변형이 사다리꼴 보다" + (pn - sn) + "더 큽니다");
	}
}
