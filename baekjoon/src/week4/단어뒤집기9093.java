package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어뒤집기9093 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n-->0) {
			
			String[] arr = br.readLine().split(" ");
			
			for(int i = 0; i<arr.length; i++) {
				String str = "";
				for(int j = arr[i].length()-1; j>=0; j--) {
					str +=arr[i].charAt(j);
				}
				arr[i] = str;
			}
			
			for(int i = 0; i<arr.length; i++) {
				System.out.print(arr[i]);
				System.out.print(" ");
			}
		}
	}
}
