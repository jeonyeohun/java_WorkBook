package WorkBook;
/*
 * 숫자를 입력받은 후, 이 숫자가 1보다 큰 경우 1부터 이 숫자까지의 모든 정수를 더한 값을 출력하라. 
 * 단, 입력한 숫자가 1 이하이면 "잘못 입력하였습니다."라고 출력한다.
 * 
 * 2018.12.31. Jeon, Yeo Hun
 */

import java.util.Scanner;
public class D01_addNums {
	public static void main (String[] args) {
		int number;
		int totalsum=0;
		int i;
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		number = input.nextInt();
		
		input.close();
		
		if (number <= 1) {
			System.out.print("잘못 입력하셨습니다.");
			System.exit(0);
		}
		
		for (i=1 ; i <= number ; i++) {
			totalsum = totalsum + i;	// 입력받은 숫자까지 1씩 증가시키며 계속 더하기 
		}
		
		System.out.println("1부터 입력한 숫자까지의 모든 정수를 더한 값은 "+ totalsum +" 입니다.");
	}

}
