package com.naver.jiaezzan;

import com.naver.jiaezzan.service.ClassServiceV7;

public class Class_10 {
/*
 * 1. service.ClassServiceV7 클래스의
 * 	구구단 출력 메서드를 호출하여
 * 2. 2단 ~ 9단 까지의 구구단을 연속해서 출력
 */
	public static void main(String[] args) {
		
		ClassServiceV7 csV7 = new ClassServiceV7();
		
		for(int i = 2; i < 10; i++) {
			csV7.dan(i);
		}
	}
}
