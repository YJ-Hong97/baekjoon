package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ∞ÒµÂπŸ»Â¿«√ﬂ√¯6588{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0)break;
			boolean[] arr = new boolean[n+1];
			
			arr[0] = true;
			arr[1] = true;
			int result1 = 0;
			int result2 = 0;
			
			for(int i = 3;i<n;i++) {
				if(i%2==1) {
					for(int j = i+i; j<n;j+=i) {
						arr[j] = true;
					}
				}else {
					arr[i] = true;
				}
			}
			int count = 0;
			for(int i = 3; i<n+1;i++) {
				if(arr[i]==false&&arr[n-i]==false) {
					result1 = i;
					result2 = n-i;
					count=0;
					break;
				}else {
					count++;
				}
			}
			if(count>0) {
				sb.append( "Goldbach's conjecture is wrong."+"\n");
			}else {
				sb.append(n+" = "+result1+" + "+result2+"\n");
			}
			
		}
		System.out.println(sb);
	}
	
	
}
