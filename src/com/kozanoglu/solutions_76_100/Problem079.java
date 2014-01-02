package com.kozanoglu.solutions_76_100;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem079 {

public static void main(String[] args) throws IOException {
		
		
		ArrayList<String> numbers = new ArrayList<String>();

		String pass = "";

		try {
			Scanner file = new Scanner(new File("src/keylog.txt"));

			while (file.hasNextLine()) {

				numbers.add(file.nextLine());

			}

			file.close();

			for (int j = 0; numbers.size() > 0; j++) {

				boolean first = true;
				boolean none = false;
				for (int k = 0; k < numbers.size(); k++) {

					int ans = numbers.get(k).indexOf(Integer.toString(j % 10));
					if (ans > -1) {
						none = true;
					}
					if (ans > 0) {
						first = false;
						break;
					}

				}
				if (first && none) {

					String nr_part = Integer.toString(j % 10);
					pass += nr_part;

					String temp = "";
					for (int k = 0; k < numbers.size(); k++) {

						temp = numbers.get(k);
						if (temp.indexOf(nr_part) == 0) {
							temp = temp.replaceFirst(nr_part, "");
							if (!temp.isEmpty())
								numbers.set(k, temp);
							else {
								numbers.remove(k);
								k--;
							}
						}

					}

				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(pass);
		
		
		/*********************************************************************/
		
		long start = System.currentTimeMillis();
	      short [][] values= new short[50][3];
	      ArrayList<Short> password = new ArrayList<Short>();		
	      BufferedReader reader = new BufferedReader(new FileReader("src/keylog.txt"));
	      String line = "";
	      int lineNumber = 0;
	      while ((line = reader.readLine()) != null) {
	         values[lineNumber][0] = (short)(line.charAt(0) - '0');
	         values[lineNumber][1] = (short)(line.charAt(1) - '0');
	         values[lineNumber][2] = (short)(line.charAt(2) - '0');
	         lineNumber++;
	      }
	      boolean change = true;
	      while (change) {
	         change=false;
	         for (int i = 0 ; i < 50 ; i++) {
	            if (password.indexOf(values[i][0])==-1 &&
	               password.indexOf(values[i][1])==-1 &&
	               password.indexOf(values[i][2])==-1) {
	               password.add(values[i][0]);
	               password.add(values[i][1]);
	               password.add(values[i][2]);
	               change = true;
	            } 
	            if (password.indexOf(values[i][0])==-1 &&
	               password.indexOf(values[i][1])>-1) {
	               int index = password.indexOf(values[i][1]);
	               password.add(index, values[i][0]);
	               change = true;
	            }
	            if (password.indexOf(values[i][1])==-1 &&
	               password.indexOf(values[i][2])>-1) {
	               int index = password.indexOf(values[i][2]);
	               password.add(index, values[i][1]);
	               change = true;
	            }
	            if (password.indexOf(values[i][0])>-1 &&
	                  password.indexOf(values[i][1])==-1) {
	                  int index = password.indexOf(values[i][0]);
	                  password.add(index+1, values[i][1]);
	                  change = true;
	            }
	            if (password.indexOf(values[i][1])>-1 &&
	               password.indexOf(values[i][2])==-1) {
	               int index = password.indexOf(values[i][2]);
	               password.add(index+1, values[2][i]);
	               change = true;
	            }
	            if (password.indexOf(values[i][0])>-1 &&
	               password.indexOf(values[i][1])>-1 &&
	               password.indexOf(values[i][2])>-1) {
	               //check order
	               int index1 = password.indexOf(values[i][0]);
	               int index2 = password.indexOf(values[i][1]);
	               int index3 = password.indexOf(values[i][2]);
	               if (index1>index2 || index2>index3 || index1>index3) {
	                  ArrayList<Integer> indexList = new ArrayList<Integer>();
	                  indexList.add(index1);
	                  indexList.add(index2);
	                  indexList.add(index3);
	                  Collections.sort(indexList);
	                  password.remove((int)indexList.get(0));
	                  password.add(indexList.get(0), values[i][0]);
	                  password.remove((int)indexList.get(1));
	                  password.add(indexList.get(1), values[i][1]);
	                  password.remove((int)indexList.get(2));
	                  password.add(indexList.get(2), values[i][2]);
	                  change = true;
	               }
	            } 
	         }
	      }
	      long end = System.currentTimeMillis();
	      reader.close();
	      System.out.println("result = " + password );
	      System.out.println("computation time = " + (end - start));
		
		
		
	}

}
