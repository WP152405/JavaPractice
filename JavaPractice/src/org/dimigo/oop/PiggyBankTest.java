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
public class PiggyBankTest {

	
	public static void main(String[] args) {
		FamilyMember[] family = {
				new FamilyMember("아빠"),
				new FamilyMember("엄마"),
				new FamilyMember("나"),
				new FamilyMember("남동생")
		};
		
		int balance = 20000;
		FamilyMember.printMemberCnt();
		for (int i=0; i<4; i++)
		{
			balance /= 2000;
			balance *= 1000; 
			PiggyBank.putMoney(family[i], balance);
		}
		PiggyBank.printBalance();
		PiggyBank.putMoney(family[2], balance);
		PiggyBank.printBalance();
		
	}

}
