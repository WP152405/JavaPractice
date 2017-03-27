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
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("현대자동차", "제네시스 ", "검정색", 225, 50000000);
				
		System.out.println("제조사명 : "+car.getCompany());
		System.out.println("모델명 : "+car.getModel());
		System.out.println("색상 : "+car.getColor());
		System.out.println("최대속도 : "+car.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", car.getPrice()));
		
		Car car2 = new Car("기아 자동차","K7", "흰색", 246, 40000000);
		car2.setCompany("기아 자동차");
		car2.setModel("");
		car2.setColor("기아 자동차");
		car2.setMaxSpeed=246;
		car2.setPrice = 40000000;
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+car2.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", car2.getPrice()));
		
		Car car3 = new Car("삼성자동차", "SM7", "회색", 200, 38000000);
		
		System.out.println("제조사명 : "+car3.getCompany());
		System.out.println("모델명 : "+car3.getModel());
		System.out.println("색상 : "+car3.getColor());
		System.out.println("최대속도 : "+car3.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", car3.getPrice()));
		
		//
		
	}

}
