/**
 * 
 */
package org.dimigo.oop;

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
public class Question {

	public static void main(String[] args) {
			
		String question[] = {"1. ���� �����ϴ� ������?" , "2. ���� �����ϴ� ����?", "3. ���� �����ϴ� ������? "};
		String answers[] ={"�糪", "�̼���", "�������α׷���"};
		for ( int i=0; i<3; i++)
		{
			System.out.println(question[i]);
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if (answers[i].equals(answer))
				System.out.println("�����Դϴ�");
			else System.out.println("Ʋ�Ƚ��ϴ�!");
		}
			
		System.out.println("<< ��� ��� >>");
		for (int i=0; i<3; i++) {
			StringBuilder sb = new StringBuilder(question[i]);
			System.out.println(question[i]+answers[i]+"�Դϴ�.");
		}
	}
}
