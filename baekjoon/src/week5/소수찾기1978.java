package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기1978{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		while(N-->0) {
			if(find(Integer.parseInt(st.nextToken()))) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean find(int parseInt) {
		if(parseInt==1) {
			return false;
		}else if(parseInt==2){
			return true;
		}
		else{
			int n = 2;
			while(n<parseInt) {
				if(parseInt%n==0) {
					return false;
				}
				n++;
			}
		}
		return true;
	}
}
