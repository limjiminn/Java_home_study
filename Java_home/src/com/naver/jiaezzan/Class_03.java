package com.naver.jiaezzan;

import com.naver.jiaezzan.service.ClassServiceV3;

public class Class_03 {
/*
 * 1. service.ClassServiceV3 클래스에
 * 	a. 정수형 intNum1, intNum2 인스턴스 변수 선언
 * 	b. Scanner 클래스를 사용하여 scan 인스턴스 변수 선언
 * 
 * 2. input() 메서드 선언
 * 	a. 두개의 숫자를 캐보드로 입력받아
 * 		각각 인스턴스 변수 intNum1, intNum2에 저장
 * 
 * 3. algebra() 메서드 선언
 *  a. 인스턴스변수 intNum1과 intNum2 변수값을 사용하여
 *  	사칙연산 결과를 출력
 *  
 * 4. Class_03의  main() method에서 호출하여 실행
 */
	public static void main(String[] args) {
		ClassServiceV3 csV3 = new ClassServiceV3();
		
		csV3.input();
		csV3.algebra();
			
	}
	
}
