package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_03 {

	
	
	private int intNum;// 자동으로 0으로 초기화
	
	private Random rnd ;//=초기화 코드를 new Random();를 생성자로...
	private Scanner scan;
	
	//생성자 매서드
	public NumPick_03() {
		rnd = new Random();
		scan = new Scanner(System.in);
		
	}
		
	
	public void pickup() {
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
		}}}
	
