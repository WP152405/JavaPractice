/**
 * 
 */
package org.dimigo.basic;

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
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int store =1500;
		long gy = 1700000;
		long ingunbi = n * store *gy*12; 
		System.out.println("<< 디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : %s원\n", String.format("%,d", 1700000));
		System.out.printf("점포 내 직원 수 : %,d명\n", n);
		System.out.printf("점포 수 : %d개\n", store);
		System.out.printf("연간 인권비 : %,d원", ingunbi);
		
	}

}
