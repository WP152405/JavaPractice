/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

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
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int attack =100;
			// 0~2, 0~3
			
		// Ʈ���̽� ��� ���
			String[] character ={"������", "����", "���", "���"};
			
		// do while : �޴� ó��
			Scanner scanner = new Scanner(System.in);
			int choice;
			do {
				System.out.println("<<���� �޴�>>");
				System.out.println("1. ���ݷ� ����");
				System.out.println("2. ���ݷ� ����");
				System.out.println("3. ĳ���� ����");
				System.out.println("9. ����");
				System.out.printf("==== �޴� �Է� ");
				
				choice= scanner.nextInt();
				
				// ġŲ ���� ġŲ ���� ��� 
				
			
			switch(choice)
			{
			case 1:
			System.out.printf("���ݷ��� �����Ͽ����ϴ�. ���� ���ݷ� : %d\n", attack+10);
			attack= attack+10;
			break;
			case 2:
				System.out.printf("���ݷ��� �����Ͽ����ϴ�. ���� ���ݷ�: %d\n", attack-10);
				attack=attack-10;
				break;
			case 3:
				int n = new Random().nextInt(4);
				System.out.println(character[n]);
			    break;
			case 9:
				System.out.printf("���� �����ϼ���!\n");
				break;
			default:
				System.out.printf("���ݷ� :%d\n",attack);
				attack=100;
			}
		}while (choice != 9);
			
      }
}
