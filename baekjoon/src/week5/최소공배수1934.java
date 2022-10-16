package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class 최소공배수1934 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(mins(a, b)+"\n");
			
		}
		System.out.println(sb);
	}

	private static int mins(int a, int b) {
		int n = 0;
		
		int mins = 1;
		if(a==1) {
			return b;
		}else if(b==1) {
			return a;
		}
		
		if(a>b) {
			n=b;
		}else {
			n=a;
		}
		ArrayList<Integer> amaxs = new ArrayList<>();
		ArrayList<Integer> bmaxs = new ArrayList<>();
		while(n>0) {
			if(a%n==0) {
				amaxs.add(n);
			}
			n--;
		}
		for(int i = 0; i<amaxs.size(); i++) {
			if(b%amaxs.get(i)==0) {
				mins = amaxs.get(i);
				break;
			}
		}
		return (a*b)/mins;
	}
}
