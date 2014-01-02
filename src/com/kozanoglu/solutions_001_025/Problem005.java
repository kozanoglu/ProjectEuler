package com.kozanoglu.solutions_001_025;

public class Problem005 {


	public static void main(String[] args) {
		
		int x =2520;
		int j;
	
		do{
			x += 20;
			for(j = 11; j <= 20; j++){
				if(x % j != 0)
					break;
			}
		}while (j <= 20);
		System.out.println(x);
		

	}

}
