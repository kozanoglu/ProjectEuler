package com.kozanoglu.solutions_026_050;

public class Problem033 {


	public static void main(String[] args) {

		int d = 1;
		for(int i = 1; i < 10; ++i) {
			for(int j = 1; j < i; ++ j) {
				for(int k = 1; k < j; ++k) {
					int ki = k * 10 + i;
					int ij = i * 10 + j;
					if(k * ij == ki * j) {    //    if( ((double) ij / ki) == ((double) j / k)  ) 
						d *= (double) ij / ki;
						System.out.println(d);
					}
					
				}
			}
		}

	}

}
