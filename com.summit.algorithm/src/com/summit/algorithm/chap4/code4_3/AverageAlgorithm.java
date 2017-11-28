package com.summit.algorithm.chap4.code4_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Vector;

/**
 * 
 * @author Summit
 * 이동 평균 구하기 #1 혼자 구현해 보
 */
public class AverageAlgorithm {
	private int n;
	private int m;
	
	public AverageAlgorithm(int n, int m) {
		this.n = n;
		this.m = m;
	}
	
	public Vector<Integer> calculateMovingAverage(int[] arr) {
		Vector<Integer> result = new Vector<Integer>();
		for(int i=m-1 ; i<n ; i++) {
			int temp=0;
			for(int j=i ; j>i-m ; j--) {
				temp += arr[j];
			}
			result.add(temp/m);
		}
		
		return result;
	}
	
	public void makeOutputFile(Vector<Integer> result) {
		BufferedWriter output = null;
		try {
			File file = new File("output.txt");
			output = new BufferedWriter(new FileWriter(file, false));
			for(int i=0 ; i< result.size() ; i++) {
				System.out.println("result[" + i + "]: " + result.get(i));
				output.write(result.get(i).toString()+"\n");
			}
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {7157,6679,6336,7080,7378,7869,7670,7506,8183,9395,10033,11239};
		AverageAlgorithm movingAverage = new AverageAlgorithm(12,3);	
		Vector<Integer> result = movingAverage.calculateMovingAverage(arr);
		movingAverage.makeOutputFile(result);
	}
}
