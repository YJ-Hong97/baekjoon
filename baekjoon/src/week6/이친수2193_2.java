package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ÀÌÄ£¼ö2193_2 {
	static ArrayList<ArrayList<Long>> list = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Long> list0 = new ArrayList<>();
		list0.add(0l);
		list.add(list0);
		ArrayList<Long> list1 = new ArrayList<>();
		list1.add(1l);
		list.add(list1);
		
		for(int i = 2; i<n+1; i++) {
			ArrayList<Long> list2 = new ArrayList<>();
			for(int j = 0;j<list.get(i-1).size();j++) {
				String str = list.get(i-1).get(j)+"";
				if(str.charAt(str.length()-1)=='0') {
					list2.add(Long.parseLong(str+"1"));
					list2.add(Long.parseLong(str+"0"));
					
				}else {
					list2.add(Long.parseLong(str+"0"));
				}
			}
			list.add(list2);
		}
		System.out.println(list.get(n).size());
	}
	

}
