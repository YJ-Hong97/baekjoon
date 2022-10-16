package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2xn≈∏¿œ∏µ211727 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		arr[0]= 1;
		arr[1] =1;
	
		for(int i = 2; i<N+1;i++) {
			arr[i] = (arr[i-1]+2*arr[i-2])%10007;
		}
		System.out.println(arr[N]);
	}
}
