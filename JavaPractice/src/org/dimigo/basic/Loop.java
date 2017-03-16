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
 * 1. 개요 :
 * 2. 작성일: &{date}
 * </pre>
 *
 * @author  : 빙조
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
			
		// 트와이스 멤버 출력
			String[] character ={"마법사", "영주", "농민", "기사"};
			
		// do while : 메뉴 처리
			Scanner scanner = new Scanner(System.in);
			int choice;
			do {
				System.out.println("<<게임 메뉴>>");
				System.out.println("1. 공격력 증가");
				System.out.println("2. 공격력 감소");
				System.out.println("3. 캐릭터 설정");
				System.out.println("9. 종료");
				System.out.printf("==== 메뉴 입력 ");
				
				choice= scanner.nextInt();
				
				// 치킨 선택 치킨 선택 출력 
				
			
			switch(choice)
			{
			case 1:
			System.out.printf("공격력이 증가하였습니다. 현재 공격력 : %d\n", attack+10);
			attack= attack+10;
			break;
			case 2:
				System.out.printf("공격력이 감소하였습니다. 현재 공격력: %d\n", attack-10);
				attack=attack-10;
				break;
			case 3:
				int n = new Random().nextInt(4);
				System.out.println(character[n]);
			    break;
			case 9:
				System.out.printf("이제 공부하세요!\n");
				break;
			default:
				System.out.printf("공격력 :%d\n",attack);
				attack=100;
			}
		}while (choice != 9);
			
      }
}
