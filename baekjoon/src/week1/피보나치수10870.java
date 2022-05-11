package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수10870 {
	static int i = 2;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nString = br.readLine();
		int n = Integer.parseInt(nString);
		
		int result = makeResult(n);
		System.out.println(result);
	}

	private static int makeResult(int n) {
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		if(arr[i]==0) {
			arr[i] = arr[i-1]+arr[i-2];
			i++;
 		}
		if(i==n) return arr[n];
		else return makeResult(n);
	}

}
