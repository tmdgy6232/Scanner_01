package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_02 {

	/*
	 * 일반적으로 main()매서드가 없는 클래스들은
	 * 다양한 method들을 정의하여 외부에서 사용할 수 있도록
	 * 코드가 만들어진다.
	 * 
	 * 이때,
	 * 클래스에 정의된 method들이
	 * 공통으로 사용할 변수들은 member 변수 영역에 선언한다.
	 * 
	 * 멤버 변수영역에 선언된 변수중에
	 * Primetive(기본형 변수 : int, float, String, boolean)들은
	 * 자동으로 초기화되어 사용준비가 된다
	 * 
	 * 하지만
	 * reference( 참조형 변수 : 배열, 객체)들은
	 * 자동으로 초기화가 되지 않아 사용준비가 되지 않는다.
	 */
	
	private int intNum;// 자동으로 0으로 초기화
	
	private Random rnd ;//=초기화 코드를 new Random();를 생성자로...
	private Scanner scan;
	
	/*
	 *멤버 변수 영역에 선언된 참조형 변수들은
	 *사용할 수 있도록 초기화(생성)코드는
	 *생성자 매서드에 그 코드를 작성해 주어야 한다. 
	 */
	
	public NumPick_02() {
		rnd = new Random();
		scan = new Scanner(System.in);
		
	}
	

}

