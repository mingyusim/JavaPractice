package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a = 9;
		int b = 10;
		double h1 = 5.8;					// 사다리꼴의 높이
		double h2 = 5.4;					// 평행사변형의 높이
		double s1 = (a+b) * h1 / 2;			// 사다리꼴의 넓이
		double s2 = a * h2; 				// 평행사변형의 넓이
		
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + s1);
		System.out.println("평행사변형 넓이 : " + s2 + "\n");
		
		if(s1 > s2)
			System.out.println("사다리꼴이 평행사변형 보다 " + (s1 - s2) + " 더 큽니다.");
		else
			System.out.println("평행사변형이 사다리꼴 보다 " + (s2 - s1) + " 더 큽니다");  
	}
}
