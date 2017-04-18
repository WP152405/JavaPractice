/**
 * 
 */
package org.dimigo.oop;

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
public class PiggyBank {
	private static int balance;
	public static void putMoney(FamilyMember member , int amount){
		System.out.println(member.getMemberName() + " : " + amount + "원 넣음");
		balance += amount;
	}
	public static void printBalance(){
		System.out.println("돼지저금통 총 금액 : "+ balance + "원");
	}
}
