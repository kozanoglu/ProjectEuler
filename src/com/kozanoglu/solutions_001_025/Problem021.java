package com.kozanoglu.solutions_001_025;

import java.util.ArrayList;

public class Problem021 {
	
	public static int sumofproperdivisors(int n) {
		int total = 0;
		for (int i=1; i < n; i++) {
            if(n % i == 0) {
                  total += i;
            }
		}
            return total;
    }


	public static void main(String[] args) {


		int a, b;
		ArrayList<Double> total = new ArrayList<Double>();
		for (int i = 1; i < 10000; ++i) {
			a = sumofproperdivisors(i);
			b = sumofproperdivisors(a);
			if (i == b && a != b) {
				if (total.contains(i) == false)
					total.add((double) i);
			}
		}
		int finaltotal = 0;
		for (int i = 0; i <= total.size() - 1; ++i) {
			finaltotal += total.get(i); }
		System.out.println(finaltotal);

	}

}
