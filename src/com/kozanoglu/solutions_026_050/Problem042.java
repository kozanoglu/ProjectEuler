package com.kozanoglu.solutions_026_050;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem042 {
	
	public static int triangleNumber(int n) {
	    return n * (n + 1) / 2;
	}
	
	public static long calcValue(String tmp) {    //  prob 42 için String value hesaplayýcý

		int LocalSum = 0; 
		for (int j = 0; j < tmp.length(); j++)
		{
			if 		(tmp.charAt(j) == 'A')
				LocalSum += 1;
			else if (tmp.charAt(j) == 'B')
				LocalSum += 2;
			else if (tmp.charAt(j) == 'C')
				LocalSum += 3;
			else if (tmp.charAt(j) == 'D')
				LocalSum += 4;
			else if (tmp.charAt(j) == 'E')
				LocalSum += 5;
			else if (tmp.charAt(j) == 'F')
				LocalSum += 6;
			else if (tmp.charAt(j) == 'G')
				LocalSum += 7;
			else if (tmp.charAt(j) == 'H')
				LocalSum += 8;
			else if (tmp.charAt(j) == 'I')
				LocalSum += 9;
			else if (tmp.charAt(j) == 'J')
				LocalSum += 10;
			else if (tmp.charAt(j) == 'K')
				LocalSum += 11;
			else if (tmp.charAt(j) == 'L')
				LocalSum += 12;
			else if (tmp.charAt(j) == 'M')
				LocalSum += 13;
			else if (tmp.charAt(j) == 'N')
				LocalSum += 14;
			else if (tmp.charAt(j) == 'O')
				LocalSum += 15;
			else if (tmp.charAt(j) == 'P')
				LocalSum += 16;
			else if (tmp.charAt(j) == 'Q')
				LocalSum += 17;
			else if (tmp.charAt(j) == 'R')
				LocalSum += 18;
			else if (tmp.charAt(j) == 'S')
				LocalSum += 19;
			else if (tmp.charAt(j) == 'T')
				LocalSum += 20;
			else if (tmp.charAt(j) == 'U')
				LocalSum += 21;
			else if (tmp.charAt(j) == 'V')
				LocalSum += 22;
			else if (tmp.charAt(j) == 'W')
				LocalSum += 23;
			else if (tmp.charAt(j) == 'X')
				LocalSum += 24;
			else if (tmp.charAt(j) == 'Y')
				LocalSum += 25;
			else if (tmp.charAt(j) == 'Z')
				LocalSum += 26;
		}
		return LocalSum;		
	}


	public static void main(String[] args) throws IOException {


		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < 30; ++i) {
			array.add(i, triangleNumber(i+1));
		}
		FileInputStream fstream = new FileInputStream("src/words.txt");  
		DataInputStream in = new DataInputStream(fstream);  
		BufferedReader br = new BufferedReader(new InputStreamReader(in));  
		StringBuffer sb = new StringBuffer();
		String line;
	    while((line = br.readLine())!= null) {
	        sb.append(line);
	    }
	    String [] words = sb.toString().split(",");
	    int counter = 0;
	    int a;
	    for ( int i = 0; i <= words.length-1; ++i) {
			a = (int) calcValue(words[i]);
	    	if (array.contains(a)) {
	    		counter += 1;
	    	}
	    }
	    br.close();
	    System.out.println(counter);

	}

}
