package com.naver.jiaezzan.service;

import java.util.Scanner;

public class ClassServiceV3 {

	private int intNum1 = 0;
	private int intNum2 = 0;
	private Scanner scan = new Scanner(System.in);
	
	public void input() {
		System.out.print("숫자입력 : ");
		intNum1 = scan.nextInt();
		
		System.out.print("숫자입력 : ");
		intNum2 = scan.nextInt();
	}
	
	public void algebra() {
		System.out.println(intNum1 + "+" + intNum2 + "=" + (intNum1 + intNum2));
		System.out.println(intNum1 + "-" + intNum2 + "=" + (intNum1 - intNum2));
		System.out.println(intNum1 + "*" + intNum2 + "=" + (intNum1 * intNum2));
		System.out.println(intNum1 + "%" + intNum2 + "=" + (intNum1 % intNum2));
		
	}
}
