/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ carTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author		: 심민규
 * @version		: 1.0
 */
public class CarTest2 {
	
	public static void main(String[] args) {
		Car2 car = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		
		System.out.println("<<자동차 목록>>");
		
		System.out.println("제조사명 :" + car.getCompany());
		System.out.println("모델명 : "+ car.getModel());
		System.out.println("색상 : "+ car.getColor());
		System.out.println("최대속도 : "+ car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		System.out.println("");
		
		car = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		 
		System.out.println("제조사명 :" + car.getCompany());
		System.out.println("모델명 : "+ car.getModel());
		System.out.println("색상 : "+ car.getColor());
		System.out.println("최대속도 : "+ car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		System.out.println("");
		
		car = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		
		System.out.println("제조사명 :" + car.getCompany());
		System.out.println("모델명 : "+ car.getModel());
		System.out.println("색상 : "+ car.getColor());
		System.out.println("최대속도 : "+ car.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", car.getPrice()) + "원");
		
	}
}
