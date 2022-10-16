package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _123´õÇÏ±â9095 {
	static int count = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int tc = Integer.parseInt(br.readLine());
		while(tc-->0) {
			count = 0;
			result(Integer.parseInt(br.readLine()));
			sb.append(count+"\n");
		}
		System.out.println(sb);
	}

	private static void result(int parseInt) {
		if(parseInt>=3) {
			result(parseInt-3);
			result(parseInt-2);
			result(parseInt-1);
		}else if(parseInt>=2) {
			result(parseInt-2);
			result(parseInt-1);
		}else if(parseInt>=1) {
			result(parseInt-1);
		}else{
			count++;
		}
		
	}

}
