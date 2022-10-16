package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class _123¥ı«œ±‚5_15990{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		long[][] d = new long[100001][4];
		d[1][1] = 1;
		d[2][2] = 1;
		d[3][1] = 1;
		d[3][2] = 1;
		d[3][3] = 1;
		
		for(int i = 4; i<d.length; i++) {
			d[i][1] =( d[i-1][2]+d[i-1][3])%1000000009;
			d[i][2] = (d[i-2][3]+d[i-2][1])%1000000009;
			d[i][3] = (d[i-3][1]+d[i-3][2])%1000000009;
		}
		while(n-->0) {
			int num = Integer.parseInt(br.readLine());
			sb.append((d[num][1]+d[num][2]+d[num][3])%1000000009+"\n");
		}
		System.out.println(sb);
	}
	
}
