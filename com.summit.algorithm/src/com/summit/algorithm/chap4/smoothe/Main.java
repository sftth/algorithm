package com.summit.algorithm.chap4.smoothe;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		v.add(75.5);
		v.add(75.0);
		v.add(73.0);
		v.add(72.8);
		v.add(76.1);
		v.add(73.4);
		v.add(73.5);
		v.add(75.3);
		v.add(70.9);
		v.add(74.1);
		
		int m = 3;
		
		Vector<Double> result = Algorithm.movingAverage(v, m);
		for(int i=0; i<result.size();i++){
			System.out.println(result.get(i));
		}
	}
}
