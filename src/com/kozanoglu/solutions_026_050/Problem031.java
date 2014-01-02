package com.kozanoglu.solutions_026_050;

public class Problem031 {


	public static void main(String[] args) {


			// Dinamik prog.
				int[] coinSizes = { 1, 2, 5, 10, 20, 50, 100, 200 };
				int[] ways = new int[201];
				ways[0] = 1;
				 
				for (int i = 0; i < 8; i++) {
				    for (int j = coinSizes[i]; j <= 200; j++) {
				        ways[j] += ways[j - coinSizes[i]];
				    }
				}
				System.out.println(ways[ways.length-1]);
			
				
				// Brute force
				int target  = 200;
		        int ways2 = 0;

		        for (int a = target; a >= 0; a -= 200) {
		            for (int b = a; b >= 0; b -= 100) {
		                for (int c = b; c >= 0; c -= 50) {
		                    for (int d = c; d >= 0; d -= 20) {
		                        for (int e = d; e >= 0; e -= 10) {
		                            for (int f = e; f >= 0; f -= 5) {
		                                for (int g = f; g >= 0; g -= 2) {                                                                                    
		                                            ways2++;                                            
		                                }
		                            }
		                        }
		                    }
		                }
		            }
		        }
		        System.out.println(ways2);

	}

}
