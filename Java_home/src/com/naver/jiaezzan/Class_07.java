package com.naver.jiaezzan;

import com.naver.jiaezzan.service.ClassServiceV5;

public class Class_07 {
/*
 * 1. service.ClassServiceV5 클래스에
 *   sum(float num1, float num2) 메서드 선언
 *   sum() 메서드는 num1과 num2를 덧셈하여 return
 * 2. Class_07의 main() method에서
 * 	sum() 메서드를 호출하면서
 * 	실수 55.2와 33.7을 전달
 * 3. sum() 메서드가 return한 결과를
 * 	result 변수에 저장
 * 4.result 변수에 담긴 결과를 console에 출력
 */
	public static void main(String[] args) {
		
		ClassServiceV5 csV5 = new ClassServiceV5();
				
		float result = csV5.sum(55.2f , 33.7f);
		
		System.out.println(result);
		
	}
}
