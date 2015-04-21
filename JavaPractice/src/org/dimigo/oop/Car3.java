package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ car
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author		: 심민규
 * @version		: 1.0
 */
public class Car3 {
		private String company;
		private String model;
		private String color;
		private int maxSpeed;
		private int price;
		
		public Car3() {
			
		}
		
		public Car3(String company, String model, String color, int maxSpeed, int price) {
			this.company = company;
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
			this.price = price;
		}
		
		public Car3(String Company, String model, String color, int maxSpeed) {
			this(Company, model, color, maxSpeed, 0);
		}
		
		public Car3(String Company, String model, String color) {
			this(Company, model, color, 0);
		}

		public String getCompany() {
			return company;
		}
		public String getModel() {
			return model;
		}
		public String getColor() { 
			return color;
		}
		public int getMaxSpeed() {
			return maxSpeed;
		}
		public int getPrice() {
			return price;
		}
		
//		public void setCompany(String company) {
//			this.company = company;
//		}
//		public void setModel(String model) {
//			this.model = model;
//		}
//		public void setColor(String color) {
//			this.color = color;
//		}
//		public void setMaxSpeed(int maxSpeed) {
//			this.maxSpeed = maxSpeed;
//		}
//		public void setPrice(int price) {
//			this.price = price;
//		}
}
