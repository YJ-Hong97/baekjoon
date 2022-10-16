package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ³ª¸ÓÁö10430 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		System.out.println(plus(a,b)%c);
		System.out.println(plus(a%c,b%c)%c);
		System.out.println(multi(a,b)%c);
		System.out.println(multi(a%c, b%c)%c);
		
	}

	private static int multi(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	private static int plus(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
