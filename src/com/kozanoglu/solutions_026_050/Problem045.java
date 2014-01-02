package com.kozanoglu.solutions_026_050;

public class Problem045 {


	public static void main(String[] args) {

	//   all hexagonal numbers are also triangle numbers
			int n = 144;
			int i = 165;
			int p = i * (3 * i - 1) / 2;
			int h = n * (2 * n - 1);
			        while (p != h) {
			            n++;
			            h = n * (2 * n - 1);
			            while (h > p) {
			                i++;
			                p = i * ((3 * i - 1) / 2);
			            }
			        }
			        System.out.println("the next triangular number is " + h);
	}

}
