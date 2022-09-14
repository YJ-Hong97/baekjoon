package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class ť10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> resultList = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		while(n-->0) {
			String[] arr = br.readLine().split(" ");
			switch (arr[0]) {
			case "push":
				resultList.add(Integer.parseInt(arr[1]));
				break;
			case "pop":
				if(resultList.size()==0) {
					System.out.println(-1);
				}else {
					System.out.println(resultList.get(0));
					resultList.remove(resultList.get(0));
				}
				break;
			case "size":
				System.out.println(resultList.size());
				break;
			case "empty":
				System.out.println(resultList.isEmpty()? 1:0);
				break;
			case "front":
				if(resultList.size()==0) {
					System.out.println(-1);
				}else {
					System.out.println(resultList.get(0));
				}
				
				break;
			case "back":
				if(resultList.size()==0) {
					System.out.println(-1);
				}else {
					System.out.println(resultList.get(resultList.size()-1));
				}
				
				break;

			default:
				break;
			}
		}
	}
}
