package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		String car = "고속버스";
		
		int distance = 14;
		int pay = 0;
		int a;
		
		if(distance % 10 == 0)
			a = 0;
		else
			a = 1;
			
		switch(car){
		case "고속버스":
			pay += 850;
			pay += (distance / 10 -1 + a) * 300;
			break;
			
		case "경차":
			pay += 300;
			pay += (distance / 10 -1 + a) * 200;
			break;
			
		default:
			pay += 600;
			pay += (distance / 10 -1 + a) * 200;
			break;
		}
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + pay);
	}
}
