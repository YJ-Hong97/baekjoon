package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketOption;
import java.util.StringTokenizer;


public class 카드구매하기11052 {
	static int pay = 0;
	static int max = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		result(n, arr);
		System.out.println(max);
	}
	private static void result(int n, int[] arr) {
		if(n==0) {
			if(max<pay) {
				max=pay;
				pay = 0;
			}else {
				pay = 0;
			}
		}else {
			for(int i = 0 ;i<arr.length; i++) {
				if(n-(i+1)>=0) {
					n = n-(i+1);
					pay += arr[i];
					result(n, arr);
					
					n = n+(i+1);
				}else {
					break;
				}
				
			}
		}
		
	}

	
}
