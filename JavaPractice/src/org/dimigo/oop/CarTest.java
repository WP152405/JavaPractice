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
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
				
		System.out.println("������� : "+car.getCompany());
		System.out.println("�𵨸� : "+car.getModel());
		System.out.println("���� : "+car.getColor());
		System.out.println("�ִ�ӵ� : "+car.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d", car.getPrice())+"��");
		
		Car car2 = new Car();
		car2.setCompany("��� �ڵ���");
		car2.setModel("K7");
		car2.setColor("���");
		car2.setMaxSpeed=246;
		car2.setPrice = 40000000;
		System.out.println("������� : "+car2.getCompany());
		System.out.println("�𵨸� : "+car2.getModel());
		System.out.println("���� : "+car2.getColor());
		System.out.println("�ִ�ӵ� : "+car2.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d", car2.getPrice())+"��");
		
		Car car3 = new Car();
		
		car2.setCompany("�Ｚ�ڵ���");
		car2.setModel("SM7");
		car2.setColor("ȸ��");
		car2.setMaxSpeed=200;
		car2.setPrice = 38000000;
		
		
		System.out.println("������� : "+car3.getCompany());
		System.out.println("�𵨸� : "+car3.getModel());
		System.out.println("���� : "+car3.getColor());
		System.out.println("�ִ�ӵ� : "+car3.getMaxSpeed()+"km");
		System.out.println("���� : "+String.format("%,d", car3.getPrice())+"��");
		
		
		
	}

}
