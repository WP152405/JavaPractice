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
public class Person {
		private String name;
		public Person(){
			
		}
		public Person(String name){
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void sayHello(){
			System.out.println("Hello");
		}
		public void sayBye(){
			System.out.println("Bye");
		}
		public String toString(){
			return "���� "+ name+"�Դϴ�.";
		}
}
