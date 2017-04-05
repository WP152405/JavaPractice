/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

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
public class Question {

	public static void main(String[] args) {
			
		String question[] = {"1. 가장 좋아하는 가수는?" , "2. 가장 좋아하는 배우는?", "3. 가장 좋아하는 과목은? "};
		String answers[] ={"사나", "이성경", "응용프로그래밍"};
		for ( int i=0; i<3; i++)
		{
			System.out.println(question[i]);
			Scanner scanner = new Scanner(System.in);
			String answer = scanner.nextLine();
			if (answers[i].equals(answer))
				System.out.println("정답입니다");
			else System.out.println("틀렸습니다!");
		}
			
		System.out.println("<< 결과 출력 >>");
		for (int i=0; i<3; i++) {
			StringBuilder sb = new StringBuilder(question[i]);
			System.out.println(question[i]+answers[i]+"입니다.");
		}
	}
}
