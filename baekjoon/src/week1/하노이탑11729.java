package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 하노이탑11729 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nString = br.readLine();
		int n = Integer.parseInt(nString);
		int[] arr =	new int[4];
		arr[0] = n;
		arr = makeCount(arr);
		System.out.println(arr[3]);
		arr = new int[4];
		arr[0] = n;
		makehanoi(arr);
	}
	private static int[] makeCount(int[] arr) {
		if(arr[0]==0&&arr[1]==0) {
			return arr;
		}else {
			if(arr[2]==0) {
				arr[0]--;
				arr[2]++;
				arr[3]++;
				return makeCount(arr);
			}else if(arr[1]==0) {
				arr[0]--;
				arr[1]++;
				arr[3]++;
				return makeCount(arr);
			}else if(arr[1]<=arr[2]) {
				if(arr[2]>1) {
					arr[2]--;
					arr[0]++;
					arr[3]++;
					arr[2]--;
					arr[1]++;
					arr[3]++;
					arr[0]--;
					arr[1]++;
					arr[3]++;
				} else {
					arr[2]--;
					arr[1]++;
					arr[3]++;
				}
				return makeCount(arr);
			}else if(arr[1]>arr[2]) {
				if(arr[1]>1) {
					arr[1]--;
					arr[0]++;
					arr[3]++;
					arr[1]--;
					arr[2]++;
					arr[3]++;
					arr[0]--;
					arr[2]++;
					arr[3]++;
				}
				else {
					arr[1]--;
					arr[2]++;
					arr[3]++;
				}
				return makeCount(arr);
			}
			return makeCount(arr);
		}
	}
	private static int[] makehanoi(int[] arr) {
		if(arr[0]==0&&arr[1]==0) {
			return arr;
		}else {
			if(arr[2]==0) {
				arr[0]--;
				arr[2]++;
				arr[3]++;
				System.out.println("1 3");
				return makehanoi(arr);
			}else if(arr[1]==0) {
				arr[0]--;
				arr[1]++;
				arr[3]++;
				System.out.println("1 2");
				return makehanoi(arr);
			}else if(arr[1]<=arr[2]) {
				if(arr[2]>1) {
					arr[2]--;
					arr[0]++;
					arr[3]++;
					System.out.println("3 1");
					arr[2]--;
					arr[1]++;
					arr[3]++;
					System.out.println("3 2");
					arr[0]--;
					arr[1]++;
					arr[3]++;
					System.out.println("1 2");
				} else {
					arr[2]--;
					arr[1]++;
					arr[3]++;
					System.out.println("3 2");
				}
				return makehanoi(arr);
			}else if(arr[1]>arr[2]) {
				if(arr[1]>1) {
					arr[1]--;
					arr[0]++;
					arr[3]++;
					System.out.println("2 1");
					arr[1]--;
					arr[2]++;
					arr[3]++;
					System.out.println("2 3");
					arr[0]--;
					arr[2]++;
					arr[3]++;
					System.out.println("1 3");
				}
				else {
					arr[1]--;
					arr[2]++;
					arr[3]++;
					System.out.println("2 3");
				}
				return makehanoi(arr);
			}
			return makehanoi(arr);
		}
	}


}
