package WorkBook;
/*
 * 2부터 9 사이의 숫자를 입력받아 이 숫자에 해당하는 구구단을 출력하라. 
 * 단, 2부터 9 사이의 숫자가 아닌 수를 입력하면 "잘못 입력하였습니다."라고 출력하고 
 * 바르게 입력할 때까지 다시 입력을 받도록 하라. 
 * 반복문은 적당하게 선택
 * 
 * 2019.01.02 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class D09_99Dan {
	public static void main (String[] args) {
		int dan;
		int i;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오(2-9): ");
			dan = input.nextInt();
			
			if (dan > 1 && dan < 10) {
				break; // 단수가 범위 내 일 경우에만 무한반복 탈출 
			}
			else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
		
		input.close();
		
		for (i = 1 ; i<10 ; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
		
	}

}
