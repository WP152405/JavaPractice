/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *&{package_name} 
 *  |_ &{type_name}
 * 1. 개요 :
 * 2. 작성일: &{date}
 * </pre>
 *
 * @author  : 빙조
 * @version : 1.0
 */
public class Car2 {
		private String company;
		private String model;
		private String color;
		private int maxSpeed;
		private int price;
		
	
		public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice){
				company = newCompany;
				model = newModel;
				color = newColor;
				maxSpeed = newMaxSpeed;
				price = newPrice;
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
		public void setCompany(String newCompany) {
			company = newCompany;
		}
		public void setModel(String newModel) {
			model = newModel;
		}
		public void setColor(String newColor) {
			color = newColor;
		}
		public void setMaxSpeed(int newMaxSpeed) {
			maxSpeed = newMaxSpeed;
		}
		public void setPrice(int newPrice) {
			price = newPrice;
		}



		
		
		











}



