package com.biz.scan;

import java.util.Scanner;

public class Scanner_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//2개의 숫자를 키보드로부터 입력받아서
		//덧셈, 곱셈, 뺄셈, 나눗셈을 4칙연산을 수행한다.
		
		int num1 =0;
		int num2 =0;
		
		
		//prompt라고 하며
		//사용자에게 키보드로 무엇인가 보여주는 것
		
		System.out.println("숫자1입력>");
		num1 = scan.nextInt();
		
		System.out.println("숫자2입력>");
		num2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d",num1, num2, num1+num2);
	}

}
