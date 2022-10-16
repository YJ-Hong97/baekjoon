package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴증가하는수열11053 {
	static int max = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0;i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(rcur(arr,0));
		
	}

	private static int rcur(int[] arr, int i) {
		if(i==arr.length) {
			return max;
		}else {
			int temp = 0;
			int count  = 0;
			for(int j = i;j<arr.length; j++) {
				if(temp<arr[j]) {
					temp = arr[j];
					count++;
				}
			}
			if(count>max) {
				max = count;
			}
			i++;
			return rcur(arr, i);
		}
		
		
	}

}
