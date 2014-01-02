package com.kozanoglu.solutions_001_025;

import java.util.ArrayList;

public class Problem029 {

	
	public static void main(String[] args) {


		ArrayList<Double> list = new ArrayList<Double>();
		for(int a = 2; a <= 100; ++a)
			for(int b = 2; b <= 100; ++b)
				if (list.contains(Math.pow(a,b)) == false)
                    list.add(Math.pow(a, b));
		System.out.println(list.size()); 

	}

}
