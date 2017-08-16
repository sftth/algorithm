package com.summit.algorithm.chap4.smoothe;

import java.util.Vector;

public class Algorithm2 {
	public Vector<Double> movingAverage2(Vector<Double>v, int m){
		Vector<Double> result = new Vector<Double>();
		
		int size = v.size();
		double partialSum = 0;
		
		for(int i=0; i< m-1; i++){
			partialSum += v.get(i);
		}
		
		for(int i=m-1 ; i< size ; i++){
			partialSum += v.get(i);
			result.add(partialSum/m);
			partialSum -= v.get(i-m+1);
		}
		
		return result;
	}
}
