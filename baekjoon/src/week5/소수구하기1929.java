package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하기1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int MIN = Integer.parseInt(st.nextToken());
		int MAX = Integer.parseInt(st.nextToken());
		boolean[] arr = new boolean[MAX+1];
		arr[0] = true;
		arr[1] = true;
		for(int i = 2;i<=MAX; i++) {
			if(!arr[i]) {
				for(int j = i+i;j<=MAX;j+=i) {
					arr[j] = true;
				}
			}
		}
		for(int i = MIN;i<=MAX;i++) {
			if(!arr[i]) sb.append(i+"\n");
		}
		System.out.println(sb);
	}

	
}
