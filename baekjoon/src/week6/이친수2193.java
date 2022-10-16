package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ÀÌÄ£¼ö2193 {
	static long[] d = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		d = new long[n+1];
		d[0] = 0l;
		d[1] = 1;
		for(int i = 2; i<d.length; i++) {
			d[i]=d[i-1]+d[i-2];
		}
		System.out.println(d[n]);
	}
	

}
