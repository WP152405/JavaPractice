/**
 * 
 */
package org.dimigo.basic;

/**  
 *<pre>
 *&{package_name} 
 *  |_ &{type_name}
 * 1. ���� : ������ ������ ����ϱ�
 * 2. �ۼ���: &{date} 2017.03.09
 * </pre>
 *
 * @author  : ����
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name = "������";
       boolean isMale = false;    		   
       int age = 25;
       double height = 161.8;
       double weight = 44.3;
       char blood = 'A';
       String profile = "<<������ ������>>";
       System.out.println(' ' + profile);
       System.out.println("�̸� : " +name);
       System.out.println(isMale ? "����: ����" : "����: ����");
       System.out.println("����: "+ age);
       System.out.println("Ű: " +height);
       System.out.println("������ : " +weight);
       System.out.println("������: " + blood);
	}

}
