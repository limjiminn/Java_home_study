package com.naver.jiaezzan.service;

public class ScoreServiceV1 {

	public void score(int intSum, float floatAvg) {
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatAvg);
	}
	
	public void print(int kor, int eng, int math) {
		
		int intSum = kor + eng + math;
		
		float floatAvg = (float)intSum / 3;
		
		System.out.println("=============================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(intSum + "\t");
		System.out.print(floatAvg + "\t");
		System.out.println("=============================");
	}
}
