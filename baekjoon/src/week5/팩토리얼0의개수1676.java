package week5;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼0의개수1676 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int two = 0;
		int five = 0;
		for(int i = 1; i<=N; i++) {
			int n = i;
			while(n%2 ==0) {
				two++;
				n/=2;
			}
			while(n%5 ==0) {
				five++;
				n/=5;
			}
		}
		System.out.println(two>five? five:two);
	}

	
}
