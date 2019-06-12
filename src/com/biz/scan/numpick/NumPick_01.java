package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_01 {

	/*
	 * main() 매서드가 없는 클래스는
	 * 헬퍼 클래스라고도 하며
	 * 다른클래스, 매서드에서 객체로 생성하여
	 * 사용하는 클래스
	 */
	
		//멤버번수 영역(scope), 필드변수 영역
		//rnd와 scan 객체를 각각의 클래스로 선언만
	// rnd와 scan의 매서드는 아직 사용할 수 없다.
	private Random rnd ;
	private Scanner scan;
	
	
	//return값에 맞게 가운데 단어가 있음. ex) public void xxx, public int xxx
	
	//클래스의 생성자 매서드
	//1. 클래스명과 같은 (첫글자 대문자 등)이름을 정하고
	//2. 리턴 type이 정의되지 않는다.
	public NumPick_01() {
		rnd = new Random();
		scan = new Scanner(System.in);
		
	}
	public Scanner getScan() {
		return scan;
	}
	
	

}

