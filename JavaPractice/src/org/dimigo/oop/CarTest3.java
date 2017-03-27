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
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
				
		System.out.println("제조사명 : "+car.getCompany());
		System.out.println("모델명 : "+car.getModel());
		System.out.println("색상 : "+car.getColor());
		System.out.println("최대속도 : "+car.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", car.getPrice()));
		
		Car3 car2 = new Car3("기아 자동차","K7", "흰색");
		car2.setCompany("기아 자동차");
		car2.setModel("");
		car2.setColor("기아 자동차");
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());

		
		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");
		
		System.out.println("제조사명 : "+car3.getCompany());
		System.out.println("모델명 : "+car3.getModel());
		System.out.println("색상 : "+car3.getColor());
		System.out.println("최대속도 : "+car3.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", car3.getPrice()));
		
		
		
	}

}
