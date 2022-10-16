package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ÆÑÅä¸®¾ó10872 {
	static int i = 1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(fac(N));
	}

	private static int fac(int n) {
		if(n<=0) {
			return i;
		}else {
			i *=n;
			n--;
			return fac(n);
		}
		
	}
}
