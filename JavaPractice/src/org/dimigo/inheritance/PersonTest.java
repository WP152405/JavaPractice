/**
 * 
 */
package org.dimigo.inheritance;

/**
 *<pre>
 *&{package_name} 
 *  |_ &{type_name}
 * 1. °³¿ä :
 * 2. ÀÛ¼ºÀÏ: &{date}
 * </pre>
 *
 * @author  : ºùÁ¶
 * @version : 1.0
 */
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person("Tom");
		System.out.println(p);
		Korean k = new Korean("È«±æµ¿");
		System.out.println(k);
		Japanese j = new Japanese("´Ù³ªÄ«");
		System.out.println(j);
		Chinese c = new Chinese("¿Õ¹Ö");
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
