package com.naver.jiaezzan;

import java.util.Scanner;

import com.naver.jiaezzan.service.ClassServiceV7;

public class Class_09 {
/*
 * 1. service.ClassServiceV7 클래스에
 * 	구구단 "단" 값을 매개변수롤 전달 받아
 * 	구구단을 출력하는 메서드 선언
 * 
 * 2. Class_09 main() method 에서
 * 	키보드를 이용하여
 * 	2 ~ 9 까지 정수 중 1개를 입력 받아
 * 
 * 3. ClassServiceV7의 구구단 method에 전달하며
 * 	호출하여 구구단 출력
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassServiceV7 csV7 = new ClassServiceV7();
		
		System.out.print("몇단을 출력할까요? :");
		
		csV7.dan(scan.nextInt());

	}
	
}

