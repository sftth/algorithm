package chap4.recursion;

import java.util.Scanner;

public class Hanoi {
	static void move(int from, int to) {
		System.out.println(String.format("\nMove from %d to %d",from, to));
	}
	
	static void hanoi(int n, int from, int by, int to) {
		if(n==1) {
			move(from,to);
		} else {
			hanoi(n-1,from,to,by);
			move(from,to);
			hanoi(n-1,by,from,to);
		}
	}
	
	public static void main(String[] args) {
		int i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nIf you want to quit, enter minus integer.");
		while(true) {
			System.out.println("\nEnter height of Hanoi tower -> ");
			i = Integer.parseInt(scan.nextLine());
			if(i <= 0 ) 
				break;
			hanoi(i,1,2,3);
		}
	}
}
