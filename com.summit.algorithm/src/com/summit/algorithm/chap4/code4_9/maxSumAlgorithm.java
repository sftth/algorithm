package com.summit.algorithm.chap4.code4_9;

public class maxSumAlgorithm {
	
	public static int inefficientMaxSum(int[] arr) {
		int ret = -999999999;
		int n = arr.length;
		for(int i=0; i < n ; i++) {
			for(int j=i; j < n ; j++) {
				int sum = 0;
				for(int k=i; k <= j ; ++k) {
					sum += arr[k];
				}
				ret = ret>sum ? ret: sum;
			}
		}
		return ret;
	}
	
	public static int betterMaxSum(int[] arr) {
		int ret = -999999999;
		int n = arr.length;
		
		for(int i=0 ; i<n ; i++) {
			int sum = 0;
			for(int j=i ; j < n ; j++) {
				sum +=arr[j];
				ret = ret > sum? ret:sum;
			}
		}
		
		
		return ret;
	}
	
	public static void main(String[] args) {
		int[] arr ={-7,4,-3,6,3,-8,3,4};
		int ret = maxSumAlgorithm.inefficientMaxSum(arr);
		System.out.println("result: "+ ret);
	}
}
