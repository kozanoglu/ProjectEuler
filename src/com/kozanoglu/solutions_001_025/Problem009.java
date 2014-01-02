package com.kozanoglu.solutions_001_025;

public class Problem009 {


	public static void main(String[] args) {

		for (int a = 1; a < 998; a++) {
			for (int b = a + 1; b < 998; b++) {
				for (int c = b + 1; c < 998; c++) {
					if (a < b && b < c && a < c) {
						if (a + b + c == 1000) {
							if (a * a + b * b == c * c) {
								System.out.print(a + " ");
								System.out.print(b + " ");
								System.out.print(c + " ");
								System.out.println(a * b * c);
							}
						}
					}
				}
			}
		}
	}

}
