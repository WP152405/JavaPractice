/**
 * 
 */
package org.dimigo.oop;

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
public class PiggyBank {
	private static int balance;
	public static void putMoney(FamilyMember member , int amount){
		System.out.println(member.getMemberName() + " : " + amount + "�� ����");
		balance += amount;
	}
	public static void printBalance(){
		System.out.println("���������� �� �ݾ� : "+ balance + "��");
	}
}
