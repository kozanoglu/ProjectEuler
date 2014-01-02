package com.kozanoglu.solutions_026_050;

import java.util.ArrayList;
import java.util.List;

public class Problem044 {

	
	public static void main(String[] args) {


		List<Integer> pentagon = new ArrayList<Integer>();
		for(int n = 1; n <= 3000;  ++n) {
			pentagon.add(n*(3*n - 1)/2);
		}
		asd:
		for (Integer x : pentagon) {
			for (Integer y : pentagon) {
				if(pentagon.contains(Math.abs(x-y))) {
					if (pentagon.contains(x + y)) {
					System.out.println("x: " + x + " " + "y: " + y );
					System.out.println("D: " + Math.abs(x-y));
					break asd;
					}
				}
			}
		}

	}

}
