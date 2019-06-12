package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_07 {

	public static void main(String[] args) {

		/*
		 * 1부터 10까지 임의의 난수를 하나 만들고 키보드로 1부터 10까지 숫자를 입력받아서 난수를 맞추는 게임 작성 하시오.
		 * 
		 * 단, 임의로 종료를 선택할때까지 계속해서 새로운 난수를 만들고 게임을 계속 할 수 있도록 하시오.
		 */
		Random rnd = new Random();
		int intRnd = rnd.nextInt(10) + 1;
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int b = 0;
		String str = "--END";
		
		while (b == 0) {

			System.out.print("숫자(1~10)까지 입력 >>");
			String strKey = scan.nextLine();
			intRnd = rnd.nextInt(3) + 1;
	
			if (b==1) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
			while (b == 0) {

			
				if (str.equals(strKey)) {
					System.out.println("게임이 끝났습니다.");
					b++;
					break;
				} else {
					i++;
					int intKey = Integer.valueOf(strKey.trim());

					if (intKey == intRnd) {
						System.out.println("참 잘했어요");
						System.out.println(i+"번째 맞췄네요~");
						break;
					}
					if (intKey > intRnd) {
						System.out.println("큰 수를 입력했군요");
						break;

					}
					if (intKey < intRnd) {
						System.out.println("작은수를 입력했군요");
						break;
					}


				}

			}

		}
	}
}
