package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class 스택수열1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> resultList = new ArrayList<>();
		List<Integer> copyList = new ArrayList<>();
		List<String> result = new ArrayList<>();
		while(n-->0) {
			int number = Integer.parseInt(br.readLine());
			resultList.add(number);
		}
		int count= 0;
		for(int i = 0; i<resultList.size(); i++) {
			if(copyList.size()==0) {
				for(int j = 1; j<resultList.get(i)+1; j++) {
					copyList.add(j);
					result.add("+");
					
				}
				result.add("-");
				copyList.remove(copyList.size()-1);
			}
			else if(copyList.get(copyList.size()-1)==resultList.get(i)) {
				result.add("-");
				copyList.remove(copyList.size()-1);
			}else if(!copyList.contains(resultList.get(i))) {
				int start = copyList.get(copyList.size()-1)+1;
				int end = resultList.get(i)+1;
				List<Integer> resultList2 = resultList.subList(0, i);
				for(int j = start; j<end; j++) {
					if(resultList2.contains(j)) {
						
					}else {
						copyList.add(j);
						result.add("+");
					}
					
				}
				result.add("-");
				copyList.remove(copyList.size()-1);
			}else {
				count++;
				System.out.println("NO");
				break;
			}
		}
		if(copyList.size()!=0&&count==0) {
			System.out.println("NO");
		}
		else if(copyList.size()==0&&count==0) {
			for(int i = 0; i<result.size(); i++) {
				System.out.println(result.get(i));
			}
		}
				
	}

}
