package com.naver.jiaezzan;

import com.naver.jiaezzan.service.ClassServiceV6;

public class Class_08 {
/*
 * 1. service.ClassServiceV6 클래스에
 * 	덧셈: add(), 뺄셈: substraction() 메서드를 선언
 * 	2개의 정수형 매개변수를 선언하여
 * 	전달받은 값을 각각 덧셈, 뺼셈한 후 return
 * 
 * 2. Class_08의 main() method에서
 * num1 = 8, num2 = 99 변수 선언후 값 할당 하고
 * add(),substration() 메서드에 전달하며 호출
 * 
 * 3. 메서드가 return 한 결과값을
 * 	각각 add, subst 변수에 저장후 console에 출력
 */
	public static void main(String[] args) {
		ClassServiceV6 csV6 = new ClassServiceV6();
		
		int add = csV6.add(8, 99);
		int subst = csV6.substraction(8, 99);
		
		System.out.println("합 : " + add);
		System.out.println("차 : " + subst);
		
	}
}
