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
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person("Tom");
		System.out.println(p);
		Korean k = new Korean("ȫ�浿");
		System.out.println(k);
		Japanese j = new Japanese("�ٳ�ī");
		System.out.println(j);
		Chinese c = new Chinese("�չ�");
		System.out.println(c);
		System.out.println();
		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();
		System.out.println();
		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();
	}

}
