package com.summit.algorithm.chap4.code9;

import com.summit.algorithm.cmmn.Util;

public class Main {
//	private static final int[] array = {-7,4,-3,6,3,-8,3,4};
	
	private static final Integer[] array = Util.randomArray(1000000);
	
	public static void main(String[] args) {
		long startTime = Util.getTime();
		
//		int result = Algorithm.inefficientMaxSum(array);
//		int result = Algorithm.betterMaxSum(array);
		int lo = 0;
		int hi = 999999;
		int result = Algorithm.fastMaxSum(array, lo, hi);
		long endTime = Util.getTime();
		System.out.println("The time required: " + Util.calTime(startTime, endTime) +"(Sec)");
		System.out.println("Result: " + result);		
	}
	
}
