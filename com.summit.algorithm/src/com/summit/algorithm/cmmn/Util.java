package com.summit.algorithm.cmmn;

import java.util.*;

public class Util {
	public static long getTime() {
		long time = System.currentTimeMillis();		
		return time;
	}
	
	public static float calTime(long startTime, long endTime) {
		return (endTime - startTime ) / 1000f;
	}
	
	public static Integer[] randomArray(int count) {
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		for(int i=0 ; i<count ; i++) {
			list.add(r.nextInt());
		}
		
		Integer[] array = new Integer[list.size()];
		array = list.toArray(array);
		
		return array;
		
	}
}
