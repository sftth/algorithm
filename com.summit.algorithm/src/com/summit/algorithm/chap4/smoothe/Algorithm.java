package com.summit.algorithm.chap4.smoothe;

import java.util.Vector;

public class Algorithm {
	public static Vector<Double> movingAverage(Vector<Double> v, int m){
		Vector<Double> result = new Vector<Double>();
		int size = v.size();
		
		for(int i= m-1 ; i < size ; i++) {
			double partialSum = 0;
			for(int j=0 ; j<m ; j++) {
				partialSum += v.get(i-j);
			}
			result.add(partialSum/m);
		}
		
		return result;
	}
}
