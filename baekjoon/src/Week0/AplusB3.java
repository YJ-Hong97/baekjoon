package Week0;

import java.util.Scanner;

public class AplusB3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		for(int i = 0; i<tc; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int result = a+b;
			System.out.println(result);
		}
	}

}
