package com.kozanoglu.solutions_051_075;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem067 {


	public static void main(String[] args) throws IOException {

		FileInputStream fstream = new FileInputStream("src/triangle.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		int arraySize = 101;
		String array[][] = new String[arraySize][];
		int index = 0;
		while ((strLine = br.readLine()) != null) {
			if (index >= arraySize - 1) {
				System.out.println("Error : Increase array size !");
				break;
			}
			array[index] = strLine.split(" ");
			index++;
		}
		int[][] values = new int[101][101];
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				for (int j = 0; j < array[i].length; j++) {
					values[i][j] = Integer.parseInt(array[i][j]);
				}
			}
		}
		int depth = values.length - 2;
		while (depth >= 0) {
			for (int j = 0; j <= depth; j++) {
				values[depth][j] += Math.max(values[depth + 1][j],
						values[depth + 1][j + 1]);
			}
			depth += -1;
		}
		br.close();
		System.out.println("The maximum path sum is: " + values[0][0]);
	}

}
