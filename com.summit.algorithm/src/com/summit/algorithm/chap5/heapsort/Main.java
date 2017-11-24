package com.summit.algorithm.chap5.heapsort;

public class Main {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int[] result = {0,0,0,0,0};
		Heap heapSort = new Heap();
		
		for(int i=0; i< array.length ; i++) {
			result = heapSort.upheap(array,i);
		}
		for(int i=0; i< array.length ; i++) {			
			System.out.println(array[i]);
		}
//		for(int i=0; i< array.length ; i++) {			
//			System.out.println(result[i]);
//		}
	}
}
