/**
 * 
 */
package org.dimigo.inheritance;

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
public class Japanese extends Person {
	private String name;
	public Japanese(String name){
		this.name =name;
	}
	public void sayHello(){
		System.out.println("�����̿�");
	}
	public void sayBye(){
		System.out.println("��䳪��");
	}
	public String toString(){
		return "���� �Ϻ���� "+name+"�Դϴ�.";
	}
}