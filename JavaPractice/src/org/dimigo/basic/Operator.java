/**
 * 
 */
package org.dimigo.basic;

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
		System.out.println("<< ��̺��� ���� �ΰǺ�>>");
		System.out.printf("�� ��� �޿� : %s��\n", String.format("%,d", 1700000));
		System.out.printf("���� �� ���� �� : %,d��\n", n);
		System.out.printf("���� �� : %d��\n", store);
		System.out.printf("���� �αǺ� : %,d��", ingunbi);
		
	}

}
