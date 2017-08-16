package com.summit.algorithm.seowha.chap1.gcd;

public class Gcd {

	public void gcd() {
		
	}
	
	public int getGcd(int numberA, int numberB) {
		int temp; //u와 v의 값을 교환하기 위한 임시 변수 
		while(numberA != 0) {
			if(numberA < numberB) {
				temp = numberA;
				numberA = numberB;
				numberB = temp;
			}
			numberA = numberA - numberB;
		}
		return numberB;
	}
}
