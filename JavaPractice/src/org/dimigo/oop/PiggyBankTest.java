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
public class PiggyBankTest {

	
	public static void main(String[] args) {
		FamilyMember[] family = {
				new FamilyMember("�ƺ�"),
				new FamilyMember("����"),
				new FamilyMember("��"),
				new FamilyMember("������")
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
