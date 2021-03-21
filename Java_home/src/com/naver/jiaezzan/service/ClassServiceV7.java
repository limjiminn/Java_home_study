package com.naver.jiaezzan.service;

public class ClassServiceV7 {
	
	public void dan(int num) {
		System.out.println("===========================");
		System.out.println("구구단" + num + "단");
		System.out.println("---------------------------");
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n",num, i, num*i);
		
		}
		System.out.println("===========================");
	}
}
