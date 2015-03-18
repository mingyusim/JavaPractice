package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int pay = 1700000;
		int staff = 3;
		int store = 1500;
		int month = 12;
		long sum = (long) pay*staff*store*month;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d", pay) + "원");
		System.out.println("점포 내 직원수 : " + staff + "명");
		System.out.println("점포 수 : " + String.format("%,d",  store) + "개");
		System.out.println("연간 인건비 : " + String.format("%,d", sum) + "원");
		  

	}

}
