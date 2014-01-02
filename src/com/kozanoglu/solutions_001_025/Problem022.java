package com.kozanoglu.solutions_001_025;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem022 {
	
	
	public static long calcValue(String tmp) {    //  prob 22 için String value hesaplayýcý

		int LocalSum = 0; 
		for (int j = 0; j < tmp.length(); j++) {
			
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


		FileInputStream fstream = new FileInputStream("src/names.txt");  
		DataInputStream in = new DataInputStream(fstream);  
		BufferedReader br = new BufferedReader(new InputStreamReader(in));  
		StringBuffer sb = new StringBuffer();
		String line;
	    while((line = br.readLine())!= null) {
	        sb.append(line);
	    }
	    String [] store = sb.toString().split(",");
		//for ( int i = 0; i <= store.length-1; ++i)
			//System.out.println(store[i]);
	    Arrays.sort(store);
        long total = 0;
        for (int i = 0; i <= store.length - 1; i++) {
            total += (i+1)*calcValue(store[i]);  
        }
        
        br.close();
        System.out.println(total); 

	}

}
