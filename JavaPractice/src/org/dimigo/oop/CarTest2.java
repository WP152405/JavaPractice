/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *&{package_name} 
 *  |_ &{type_name}
 * 1. ���� :
 * 2. �ۼ���: &{date}
 * </pre>
 *
 * @author  : ����
 * @version : 1.0
 */
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("�����ڵ���", "���׽ý� ", "������", 225, 50000000);
				
		System.out.println("������� : "+car.getCompany());
		System.out.println("�𵨸� : "+car.getModel());
		System.out.println("���� : "+car.getColor());
		System.out.println("�ִ�ӵ� : "+car.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d", car.getPrice()));
		
		Car car2 = new Car("��� �ڵ���","K7", "���", 246, 40000000);
		car2.setCompany("��� �ڵ���");
		car2.setModel("");
		car2.setColor("��� �ڵ���");
		car2.setMaxSpeed=246;
		car2.setPrice = 40000000;
		System.out.println("������� : "+car2.getCompany());
		System.out.println("�𵨸� : "+car2.getModel());
		System.out.println("���� : "+car2.getColor());
		System.out.println("�ִ�ӵ� : "+car2.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d", car2.getPrice()));
		
		Car car3 = new Car("�Ｚ�ڵ���", "SM7", "ȸ��", 200, 38000000);
		
		System.out.println("������� : "+car3.getCompany());
		System.out.println("�𵨸� : "+car3.getModel());
		System.out.println("���� : "+car3.getColor());
		System.out.println("�ִ�ӵ� : "+car3.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d", car3.getPrice()));
		
		//
		
	}

}
