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
public class Chinese extends Person {
	private String name;
	public Chinese(String name){
		this.name =name;
	}
	public void sayHello(){
		System.out.println("���Ͽ�");
	}
	public void sayBye(){
		System.out.println("¹���");
	}
	public String toString(){
		return "���� �߱���� "+name+"�Դϴ�.";
	}
}
