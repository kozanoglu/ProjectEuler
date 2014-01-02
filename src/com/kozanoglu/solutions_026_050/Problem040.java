package com.kozanoglu.solutions_026_050;

public class Problem040 {


	public static void main(String[] args) {


		StringBuilder sb = new StringBuilder();
		for (int i = 0; sb.length() <= 1000000; i++) {
			sb.append(i);
		}
		int prd = 1;
		for (int i = 1; i <= 1000000; i *= 10) {
			System.out.println(sb.charAt(i));
			prd *= (sb.charAt(i) - 48);
		}
		System.out.println(prd);

	}

}
