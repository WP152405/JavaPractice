/**
 * 
 */
package org.dimigo.basic;

/**  
 *<pre>
 *&{package_name} 
 *  |_ &{type_name}
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일: &{date} 2017.03.09
 * </pre>
 *
 * @author  : 빙조
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name = "아이유";
       boolean isMale = false;    		   
       int age = 25;
       double height = 161.8;
       double weight = 44.3;
       char blood = 'A';
       String profile = "<<아이유 프로필>>";
       System.out.println(' ' + profile);
       System.out.println("이름 : " +name);
       System.out.println(isMale ? "성별: 남자" : "성별: 여자");
       System.out.println("나이: "+ age);
       System.out.println("키: " +height);
       System.out.println("몸무게 : " +weight);
       System.out.println("혈액형: " + blood);
	}

}
