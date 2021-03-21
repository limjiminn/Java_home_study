package com.naver.jiaezzan;

import com.naver.jiaezzan.service.ScoreServiceV1;

public class Score_002 {
/*
 * c.n.j.service.scoreServiceV1 클래스를 생성한 후
 * score() 메서드를 생성한다.
 * score() 메서드는 총점(intSum)과 평균(floatAvg)을 전달받는 2개의
 * 매개변수가 있다.
 * 
 * Score_05의 main()에서 호출하여
 * 다음과 같이 Console에 출력하는 코드를 작성
 * 
 * 총점: 242
 * 평균: 80.666
 */
	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		ssV1.score(242, 80.666f);
		
	}
}
