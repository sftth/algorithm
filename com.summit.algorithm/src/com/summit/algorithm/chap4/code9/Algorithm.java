package com.summit.algorithm.chap4.code9;

import com.summit.algorithm.cmmn.Util;

/**
 * 주어진 배열의 모든 부분 구간을 순회하면서 합을 계산하는 알고리즘
 * 시간 복잡도는 O(N3)
 * @author Summit
 *
 */
public class Algorithm {
	private static final int MIN = 0; 
	
	public static int inefficientMaxSum(Integer[] array) {
		int size = array.length;
		int ret = MIN;

		for(int i = 0 ;i< size ; i++){
			for(int j=i ; j < size ; j++){
				//구간 list[i..j]의 합을 구한다.
				int sum = 0;
				for(int k=i; k <=j; k++){
					sum += array[k];
				}
				ret = max(ret,sum);
			}
		}
		return ret;
	}
	
	public static int betterMaxSum(Integer[] array) {
		int size = array.length;
		int ret = MIN;
		
		for(int i = 0 ; i< size; i++) {
			int sum = 0;
			for(int j = i ; j < size ; j++) {
				sum += array[j];
				ret = max(ret, sum);
			}
		}
		
		return ret;
	}
	
	public static int fastMaxSum(Integer[] array, int lo, int hi) {
		//기저 사례: 구간의 길이가 1일 경
		if(lo == hi) {
			return array[lo];
		}
		//배열을 array[lo..mid], array[mid+1..hi]의 두 조각으로 나눈다.
		int mid = (lo + hi) / 2;
		/** 두 부분에 모두 걸쳐 있는 최대 합 구간을 찾는다. 이 구간
		 *  array[i..mid]와 array[mid+1..j]형태를 갖는 구간의 합으로 이루어진다.
		 *  array[i..mid]형태를 갖는 최대 구간을 찾는다.
		 */
		int left = MIN;
		int right = MIN;
		int sum = 0;
		for(int i = mid; i >= lo ; --i) {
			sum += array[i];
			left = max(left,sum);
		}
		
		sum = 0;
		
		for(int j = mid+1 ; j <= hi; ++j) {
			sum += array[j];
			right = max(right, sum);
		}
		//최대 구간이 두 조각 중 하나에만 속해 있는 경우의 답을 재귀 호출로 찾는다.
		int single = max(fastMaxSum(array, lo, mid), fastMaxSum(array,mid+1, hi));
		
		//두 경우 중 최대치를 반환한다.
		return max(left+right, single);
	}
	
	private static int max(int a, int b) {
		if(a > b) {
			return a;
		}else{
			return b;
		}
	}
}
