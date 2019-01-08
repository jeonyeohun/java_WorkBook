package WorkBook;
/*
 * 간단한 슬롯 머신을 만들어라. 사용자에게 코인의 개수를 숫자로 입력받은 다음에, 
 * 1부터 9까지의 숫자 3개 를 랜덤으로 만들어 3개의 숫자가 같으면 상금으로 코인 4개, 
 * 2개의 숫자가 같으면 코인 2개를 더해준다. 
 * 한 번 할 때마다 코인을 1개 씩 소모하게 되고, 
 * 사용자의 코인이 모두 소모될 때까지 게임을 반복시켜라.
 * 
 * 2019.01.08 Jeon, Yeo Hun
 */

import java.util.Scanner;
import java.util.Random;

public class H05_slotMachine {
	public static void main (String[] args) {
		int coins;
		int number[] = new int[3];
		int dummy;
		int i;
		Scanner s1 = new Scanner(System.in);
		Random rand = new Random();
		
		// 코인 개수 입력 받기 
		System.out.print("사용하실 코인의 개수를 입력하세요: ");
		coins = s1.nextInt();
		
		for (i=0 ; i<coins ; i++) {
			// 게임시작 메세지
			System.out.print("게임 "+ (i+1) + "회 Start!! (아무 숫자나 입력하세요.): ");
			dummy = s1.nextInt();
			
			// 랜덤한 슬록머신 숫자 생성			
			for (dummy=0 ; dummy < 3 ; dummy++) {
				number[dummy] = rand.nextInt(9)+1;
			}
			
			// 게임 결과 출력
			System.out.print("게임 결과 : ");
			for (dummy = 0 ; dummy < 3 ; dummy++) {
				System.out.print(number[dummy] + " ");
			}
			if (number[0] == number[1] && number[0] == number[2]) {
				coins += 4;
				System.out.println("숫자 3개 일치... 코인 4개 증정");
			}
			else if (number[0] == number[1] || number[0] == number[2] || number[1] == number[2]) {
				coins += 2;
				System.out.println("숫자 2개 일치... 코인 2개 증정");	
			}
			else {
				System.out.println("꽝입니다... 아쉽군요...");
			}
			
			// 남아 있는 코인 알려주기 
			System.out.println("남아있는 코인은 "+ (coins-i-1) + "개 입니다.");
		}
		
		// 반복문이 종료되면 게임 종료
		System.out.println("\n게임 종료!!!");
		
		s1.close();
	}
}
