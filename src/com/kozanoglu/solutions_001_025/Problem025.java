package com.kozanoglu.solutions_001_025;

import java.math.BigInteger;

public class Problem025 {
	
	// fibonacci fonk., BigInteger ve dinamik programlama
	public static BigInteger fib2(int n) {
		BigInteger[] fibArray = new BigInteger[10000000];
		int i = 2;
		fibArray[0] = BigInteger.valueOf(0);
		fibArray[1] = BigInteger.valueOf(1);
		while(i <= n) {
			fibArray[i] = (fibArray[i - 1]).add(fibArray[i - 2]);
			++i;
		}
		return fibArray[n];
	}

	
	public static void main(String[] args) {


	//  hýzlandýrmak için i büyük bir sayýdan baþlatýlabilir
			int i = 0;
			while (true) {
				System.out.println((fib2(i)).toString().length());
				if ((fib2(i)).toString().length() == 1000)
					break;
			++i;			
			}
			System.out.println(i);

	}

}
