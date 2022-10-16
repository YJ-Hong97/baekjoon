package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;


public class 최대공약수와최소공배수2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		
		bw.write(maxs(A, B)+"\n");
		bw.write(mins(A,B)+"\n");
		bw.flush();
		bw.close();
	}

	private static int maxs(int a,int b) {
		ArrayList<Integer> amaxs = new ArrayList<>();
		ArrayList<Integer> bmaxs = new ArrayList<>();
		int n = 0;
		if(a>b) {
			n=b;
		}else {
			n=a;
		}
		while(n>0) {
			
			if(a%n==0) {
				amaxs.add(n);
			}
			if(b%n==0) {
				bmaxs.add(n);
			}
			if(bmaxs.contains(n)&&amaxs.contains(n)) {
				return n;
			}
			n--;
		}
		return 1;
	}

	private static int mins(int a,int b) {
		int n=1;
		ArrayList<Integer> amins = new ArrayList<>();
		ArrayList<Integer> bmins = new ArrayList<>();
		int result = 0;
		while(true) {
			amins.add(a*n);
			bmins.add(b*n);
			if(a>b) {
				result = b*n;
				if(amins.contains(result)) {
					return result;
				}
			}else {
				result= a*n;
				if(bmins.contains(result)) {
					return result;
				}
			}
			n++;
			
		}
	}
}
