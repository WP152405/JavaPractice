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
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car = new Car3("�����ڵ���", "���׽ý�", "������", 225, 50000000);
				
		System.out.println("������� : "+car.getCompany());
		System.out.println("�𵨸� : "+car.getModel());
		System.out.println("���� : "+car.getColor());
		System.out.println("�ִ�ӵ� : "+car.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d", car.getPrice()));
		
		Car3 car2 = new Car3("��� �ڵ���","K7", "���");
		car2.setCompany("��� �ڵ���");
		car2.setModel("");
		car2.setColor("��� �ڵ���");
		System.out.println("������� : "+car2.getCompany());
		System.out.println("�𵨸� : "+car2.getModel());
		System.out.println("���� : "+car2.getColor());

		
		Car3 car3 = new Car3("�Ｚ�ڵ���", "SM7", "ȸ��");
		
		System.out.println("������� : "+car3.getCompany());
		System.out.println("�𵨸� : "+car3.getModel());
		System.out.println("���� : "+car3.getColor());
		System.out.println("�ִ�ӵ� : "+car3.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d", car3.getPrice()));
		
		
		
	}

}
