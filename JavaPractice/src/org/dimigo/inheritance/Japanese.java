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
public class Japanese extends Person {
	private String name;
	public Japanese(String name){
		this.name =name;
	}
	public void sayHello(){
		System.out.println("오하이요");
	}
	public void sayBye(){
		System.out.println("사요나라");
	}
	public String toString(){
		return "저는 일본사람 "+name+"입니다.";
	}
}