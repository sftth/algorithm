package com.summit.algorithm.chap5.heapsort;

public class Heap {
	private int[] element; //element[0] contains length
	private static final int ROOTLOC = 1;
	private static final int DEFAULT = 10;

	public Heap(int size) {
//		if(size>DEFAULT) {
//			element = new int[size+1]; 
//			element[0] = 0;
//		} else {
//			element = new int[DEFAULT+1]; 
//			element[0] = 0;
//		}
	}
	public Heap() {
		
	}

	public void add(int newnum) {
//		if(element.length <= element[0] + 1) {
//			int[] elementTemp = new int[element[0]*2];
// 			for(int x = 0; x < element[0]; x++) {
// 				elementTemp[x] = element[x];
// 			}
//	 			element = elementTemp;
// 		}
// 		element[++element[0]] = newnum;
// 		upheap();
 	}
	 
 	public int extractRoot() {
// 		int extracted = element[1];
// 		element[1] = element[element[0]--];
// 		downheap();
// 		return extracted;
 		return 0;
 	}
	 
 	public int[] upheap(int[]array, int index) {
// 		int locmark = element[0];
// 		while(locmark >= 1 && element[locmark/2] > element[locmark]) {
// 			swap(locmark/2, locmark);
// 			locmark /= 2;
// 		}
 		
 		int tempVal = array[index];
 		while(index!=0&&array[index/2] < tempVal) {
 			array[index] = array[index/2];
 			index /=2;
 		}
 		array[index] = tempVal;
 		
 		return array;
 	}
 
 	public void downheap() {
// 		int locmark = 1;
// 		while(locmark * 2 <= element[0])
// 		{
// 			if(locmark * 2 + 1 <= element[0]) {
// 				int small = smaller(locmark*2, locmark*2+1);
// 				swap(locmark,small);
// 				locmark = small;
// 			}
// 			else {
// 				swap(locmark, locmark * 2);
// 				locmark *= 2;
// 			}
// 		}
 	}
 
 	public void swap(int a, int b) {
// 		int temp = element[a];
// 		element[a] = element[b];
// 		element[b] = temp;
 	}
 
 	public int smaller(int a, int b) {
 		return element[a] < element[b] ? a : b;
 	}
}
