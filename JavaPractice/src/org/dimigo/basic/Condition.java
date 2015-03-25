package org.dimigo.basic;

public class Condition {
	public static void main(String[] args) {
		String sort = "고속버스";
		int dis = 25;
		int fee = 0;
		int plus = 0;
		int size = 0;
		
		// 고속850, 경차300, 600
		
		switch(sort) {
		case "고속버스":
			fee = 850;
			plus = 300;
			break;
		case "경차":
			fee = 300;
			plus = 200;
			break;
		default:
			fee = 600;
			plus = 200;
			break;
		}
		
		if(0<= dis && dis <= 10)
			size = 0;
		else if(11<= dis && dis <= 20)
			size = 1;
		else if(21<= dis)
			size = 2;
		
		fee = fee + (size * plus);
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + dis + "km");
		System.out.println("차종 : " + sort);
		System.out.println("통행료 : " + fee + "원");
			
	}




}
