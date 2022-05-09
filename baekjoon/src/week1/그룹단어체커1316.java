package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커1316 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tcString = br.readLine();
		int tc = Integer.parseInt(tcString);
		
		int count = 0;
		while(tc-->0) {
			if(check(br.readLine())) count++;
		}
		System.out.println(count);
	}

	private static boolean check(String str) {
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);
			if(i==0) {
				if(str.charAt(i+1)==c) {
					
				}
				else {
					return false;
				}
			}
			else if(i==str.length()-1) {
				if(str.charAt(i-1)==c) {
				}
				else {
					return false;
				}
			}else {
				if(str.charAt(i+1)==c||str.charAt(i-1)==c) {
				}
				else {
					return false;
				}
			}
		}
		return true;
		
	}

}
