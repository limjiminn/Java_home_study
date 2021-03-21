package com.naver.jiaezzan.service;

public class ClassServiceV1 {

	public void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	public void add(int num3, float fnum1) {
		float result = (float)num3 + fnum1;
		System.out.println(result);
	}
	public void add(double dnum1, float fnum2) {
		double sum = dnum1 + fnum2;
		double min = dnum1 - fnum2;
		double gop = dnum1 * fnum2;
		double nanu = dnum1 / fnum2;
		
		System.out.print(sum + "\t");
		System.out.print(min+ "\t");
		System.out.print(gop + "\t");
		System.out.println(nanu);
	}
}
