package forMakeStar;

import java.util.Scanner;

public class ScannerStar {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("라인수 입력(홀수) : ");
		int line = scan.nextInt();
		int star = 1;
		int space = line/2;
		boolean flag = true; 
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i == line/2) {
				flag = !flag;
			}
			if(flag) {
				star += 2;
				space--;
			}else {
				star-=2;
				space++;
			}
			
		}
		scan.close();
	}
}