/**
 * 
 */
package org.dimigo.inheritance;

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
public class Chinese extends Person {
	private String name;
	public Chinese(String name){
		this.name =name;
	}
	public void sayHello(){
		System.out.println("니하오");
	}
	public void sayBye(){
		System.out.println("쨔이찌엔");
	}
	public String toString(){
		return "저는 중국사람 "+name+"입니다.";
	}
}
