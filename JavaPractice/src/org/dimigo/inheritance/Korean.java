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
public class Korean extends Person {
		private String name;
		public Korean(String name){
			this.name =name;
		}
		public void sayHello(){
			System.out.println("�ȳ��ϼ���");
		}
		public void sayBye(){
			System.out.println("�ȳ��� �輼��");
		}
		public String toString(){
			return "���� �ѱ���� "+name+"�Դϴ�.";
		}
}
