package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class 요세푸스문제1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		Queue<String> q = new LinkedList<>();
		for(int i = 0; i<N;i++) {
			q.offer(i+1+"");
		}
		bw.write('<');
		while(q.size()!=1) {
			for(int i = 0; i<K-1; i++) {
				q.offer(q.poll());
			}
			
			bw.write(q.poll());
			bw.write(',');
			bw.write(' ');
			
		}
		bw.write(q.poll());
		bw.write('>');
		bw.flush();
		bw.close();
		
	}
}
