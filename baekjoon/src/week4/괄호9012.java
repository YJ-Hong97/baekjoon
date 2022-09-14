package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class °ýÈ£9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		aa:while(n-->0) {
			String str = br.readLine();
			int left = 0;
			for(int i = 0; i<str.length(); i++) {
				if(left<0) {
					System.out.println("NO");
					continue aa;
				}
				else if(str.charAt(i)=='(') {
					left++;
				}else {
					left--;
				}
			}
			if(left==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
