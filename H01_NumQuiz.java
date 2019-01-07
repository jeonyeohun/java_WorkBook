package WorkBook;
/*
 * 1부터 100 사이의 임의의 숫자를 만든 후에 사용자로 하여금 이 숫자를 맞추도록 하라. 
 * 사용자가 제시한 숫자보다 큰 수인지 작은 수인지를 알려주면서 몇 번 만에 맞추었는지 출력하라.
 * 
 * 2019.01.07 Jeon, Yeo Hun
 */

import java.util.Scanner;
import java.util.Random;
public class H01_NumQuiz {
	public static void main (String[] args) {
		int answer;
		int number_try;
		int count=0;
		Scanner s1 = new Scanner(System.in);
		Random generator = new Random();
		
		// 랜덤한 숫자 생성 
		answer = generator.nextInt(100)+1;
		
		// 사용자에게 값을 입력받아 힌트 알려주기 
		while(true) {
			System.out.print("1부터 100까지의 숫자 하나를 맞춰보세요: ");
			number_try = s1.nextInt();
			
			count++; // 시도 횟수 업데이트 
			
			// 종료조건 설정 
			if (number_try == answer) {
				break;
			}
			
			// 힌트 출력 
			else if (number_try > answer) {
				System.out.println("좀 더 작은 숫자 입니다. ");
			}
			else {
				System.out.println("좀 더 큰 숫자 입니다. ");
			}
		}
		
		System.out.println(count + "번 만에 맞추셨습니다. ");
		s1.close();
		
	}
}
