package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ω∫≈√10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> stack = new ArrayList<>();
		while(n>0) {
			String[] arr = br.readLine().split(" ");
			String key = arr[0];
			n--;
			switch (key) {
			case "push": {
				int value = Integer.parseInt(arr[1]);
				stack.add(value);
				break;
			}
			case "pop":{
				if(stack.size()==0) {
					System.out.println(-1);
				}else {
					System.out.println(stack.get(stack.size()-1));
					stack.remove(stack.size()-1);
				}
				break;
			}
			case "size":{
				System.out.println(stack.size());
				break;
			}
			case "empty":{
				if(stack.size()==0) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
					
			}
			case "top" :{
				if(stack.size()==0) {
					System.out.println(-1);
				}else {
					System.out.println(stack.get(stack.size()-1));
				}
				break;
			}
			default:
				break;
			}
		}
		
	}
}
