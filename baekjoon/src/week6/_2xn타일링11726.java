package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2xn≈∏¿œ∏µ11726 {
	static int count = 1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
        
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        
        for (int i = 2; i < n; i++) {
            int num = arr[i - 1] + arr[i - 2];
            arr[i] = num % 1000000007;
        }
        
       System.out.println(arr[n-1]);
	}

	
}
