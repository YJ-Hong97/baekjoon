package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class º°Âï±â2447 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nString = br.readLine();
		int n = Integer.parseInt(nString);
		String[][] arr = new String[n][n];
		
		arr = makeArr(arr, n);
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i][j]==null) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	private static String[][] makeArr(String[][] arr, int n) {
		if(n==1) {
			return arr;
		}else {
			int num = n;
			int row = num/3;
			int col = num/3;
			for(int i = 0; i<arr.length; i++) {
				col = num/3;
				if(i==row+(n/3)) {
					row= row+n;
					if(row>arr.length)break;
				}
				else if(i<row||i>row+(n/3)) {
					continue;
				}else {
					for(int j = 0; j<arr.length; j++) {
						if(j == col+(n/3)) {
							col = col+n;
							if(col>arr.length)break;
						}
						else if(j<col||j>col+(n/3)) {
							continue;
						}else {
							arr[i][j]= " ";
						}
					}
				}
			}
			n = n/3;
			return makeArr(arr, n);
		}
	}

	
}
