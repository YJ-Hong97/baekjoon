package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;


public class µ¦10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<Integer>();
		while(N-->0) {
			String[] arr = br.readLine().split(" ");
			switch (arr[0]) {
			case "push_front":
				deque.addFirst(Integer.parseInt(arr[1]));
				break;
			case "push_back":
				deque.addLast(Integer.parseInt(arr[1]));
				break;
			case "pop_front":{
				Integer first = deque.pollFirst();
				System.out.println(first==null? -1:first);
			}
				break;
			case "pop_back":{
				Integer last = deque.pollLast();
				System.out.println(last==null?-1:last);
			}
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				System.out.println(deque.isEmpty()? 1:0);
				break;
			case "front":{
				Integer first = deque.peekFirst();
				System.out.println(first==null?-1:first);
			}
				break;
			case "back":{
				Integer last = deque.peekLast();
				System.out.println(last==null?-1:last);
			}
				break;

			default:
				break;
			}
		}
	}
}
