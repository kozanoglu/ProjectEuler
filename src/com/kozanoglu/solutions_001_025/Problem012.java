package com.kozanoglu.solutions_001_025;

public class Problem012 {

	//  n. triangle number hesaplayýcý
	public static long triang(int n) {
		long sum12 = 0;
		for (int i = 1; i <= n; ++i) {
			sum12 += i;
		}
		return sum12;
	}
	
	public static int triang2(int n) {
		int sum12 = n*(n+1)/2;
		return sum12;
		
	}
	

	public static void main(String[] args) {

	//   15-20 dakika sürüyor
			int counter = 0;
			int n = 6;
			System.out.println(triang2(n));
			int qwe;
			boolean asd = true;
			while(asd) {
				qwe = triang2(n);
				for (int j = 1; j <= qwe; ++j) {
					if (qwe % j == 0){
						++counter;
						System.out.println(counter);
						if (counter > 500)
							asd = false;
							System.out.println(triang(n));
					}
				}
				counter = 0;
				++n;
			}
			System.out.println(triang(n));
		
	}

}
