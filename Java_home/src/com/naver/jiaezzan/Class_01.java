package com.naver.jiaezzan;

import com.naver.jiaezzan.service.ClassServiceV1;

public class Class_01 {
/*
 * 1. c.n.j.service.ClassServiceV1 클래스에
 *  add() 메서드를 3개 생성
 *  a. 정수 2개를 매개변수로 받아 덧셈 계산 후 출력
 *  b. 정수 1개, float형 실수 1개를 매개변수로 받아 덧셈
 *  	계산후 출력
 *  c. double 형 실수1개, float형 실수 1개를
 *  	매개변수로 받아 4칙 연산 수행한 후 다음과 같이 출력
 *  	(값은 임의로 설정)
 *  	예) 30.2 x 21.2 = ??
 *  2. Class_01의 main() method에서 호출하여 실행
 */
	public static void main(String[] args) {
		
		ClassServiceV1 csV1 = new ClassServiceV1();
		
		csV1.add(34, 23.3f);
	}
}
