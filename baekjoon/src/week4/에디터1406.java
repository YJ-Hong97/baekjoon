package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;



public class ¿¡µðÅÍ1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		LinkedList<Character> resultList = new LinkedList<>();
		for(int i = 0; i<str.length(); i++) {
			resultList.add(str.charAt(i));
		}
		ListIterator<Character> iterator = resultList.listIterator();
		while(iterator.hasNext()) {
			iterator.next();
		}
		int n = Integer.parseInt(br.readLine());
		while(n-->0) {
			String command = br.readLine();
			char key = command.charAt(0);
			
			switch (key) {
			case 'L':
				if(iterator.hasPrevious()) {
					iterator.previous();
				}
				break;
			case 'D':
				if(iterator.hasNext()) {
					iterator.next();
				}
				break;
			case 'B':
				if(iterator.hasPrevious()) {
					iterator.previous();
					iterator.remove();
				}
				break;
			case 'P':
				
				iterator.add(command.charAt(2));
				
				break;

			default:
				break;
			}
		}
		resultList.forEach(r->{
			try {
				bw.write(r);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		bw.flush();
		bw.close();
	}
}
