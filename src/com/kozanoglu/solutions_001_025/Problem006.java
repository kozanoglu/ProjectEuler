package com.kozanoglu.solutions_001_025;

public class Problem006 {


	public static void main(String[] args) {

		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 1; i <=100; ++i) {
			sum1 += i;
		}
		
		sum1 = (int)Math.pow(sum1, 2);
		
		for(int i = 1; i <= 100; ++i){
			sum2 += Math.pow(i,2);
		}
		
		System.out.println(sum1 - sum2);
		
	}

}
