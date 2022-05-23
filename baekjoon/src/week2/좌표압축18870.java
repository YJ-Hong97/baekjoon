package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		String[] arr2 = arr.clone();
		
		int[] counts = new int[n];
		int count = 0;
		Arrays.sort(arr2);
		for(int i = 0; i<arr.length; i++) {
			for(int j= 0; j<arr.length; j++) {
				if(arr[i].equals(arr2[j])) {
					counts[i] = j;
					break;
				}
			}
		}
		for(int i = 0; i<counts.length; i++) {
			if(i==counts.length-1) {
				sb.append(counts[i]);
			}else {
				sb.append(counts[i]+" ");
			}
			
		}
		System.out.println(sb);
	}

}
