package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 조합0의개수2004 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int two = 0;
		int five = 0;
		
		for(int i = 0; i<M; i++) {
			int result = N;
			while(result%2==0) {
				two++;
				result/=2;
			}
			result = N;
			while(result%5==0) {
				five++;
				result/=5;
			}
			N--;
		}
		for(int i = 1; i<=M; i++) {
			int result = i;
			while(result%2==0) {
				two--;
				result/=2;
			}
			result = i;
			while(result%5==0) {
				five--;
				result/=5;
			}
		}
		
		
		System.out.println(two>five? five:two);
	}
}
