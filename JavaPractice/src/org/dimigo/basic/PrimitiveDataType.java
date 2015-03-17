package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args) {
		String title = "<< 아이유 프로필 >>";
		String name = "아이유";
		boolean isWoman = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';	
		
		System.out.println(title);
		System.out.println("이름 : " + name);
		if (isWoman)
			System.out.println("성별 : 여성");
		else
			System.out.println("성별 : 남성");
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodtype + "형");
	}
}
