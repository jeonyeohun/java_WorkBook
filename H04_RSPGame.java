package WorkBook;
/*
 * 다음과 같이 사용자와 컴퓨터가 가위바위보를 하는 프로그램을 만들어라. 
 * 1) 랜덤으로 가위(1), 바위(2), 보(3) 셋 중에 하나를 만든다.
 * 2) 사용자에게 가위(1), 바위(2), 보(3) 중에 하나를 숫자로 입력받는다. 
 * 3) 사용자가 입력한 것과 컴퓨터가 만들어 낸 것을 비교하여
 * 컴퓨터가 이기면, "컴퓨터 승!" 사용자가 이기면, "사용자 승!" 비기면, "비김~" 으로 출력한다.
 * 4) 사용자가 0을 입력할 때까지 위 1)부터 3)을 계속 반복하다가, 끝나면 그동안 컴퓨터와 사용자가 이긴 횟수와 진 횟수, 비긴 횟수를 출력하라.
 * 
 * 2019.01.07 Jeon, Yeo Hun
 */

import java.util.Scanner;
import java.util.Random;

public class H04_RSPGame {
	public static void main (String[] args) {
		int com_finger;		// 컴퓨터의 선택 
		int my_finger;		// 사용자의 선택 
		int score[][] = new int[2][3];	// [컴퓨터의 승, 무, 패][사용자의 승, 무, 패]
		Scanner s1 = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 종료(0)를 입력하세요: ");
			my_finger = s1.nextInt();
			
			// 종료조건
			if (my_finger == 0) {
				break;
			}
			
			// 컴퓨터의 선택 생성
			com_finger = rand.nextInt(3)+1;
			
			
			// 컴퓨터가 보를 낸 경우 
			if (com_finger == 3) {
				System.out.print("컴퓨터가 낸 것은 보 입니다. ");
				if (my_finger == 1) {
					System.out.print("-----> 사용자 승!\n");
					score[0][2]++;	// 컴퓨터 전적 
					score[1][0]++;	// 사용자 전적 
				}
				else if (my_finger == 2) {
					System.out.print("-----> 컴퓨터 승!\n");
					score[0][0]++;
					score[1][2]++;
				}
				else if (my_finger == 3){
					System.out.print("-----> 비김~\n");
					score[0][1]++;
					score[1][1]++;
				}
			}
				
			// 컴퓨터가 바위를 낸 경우 
			else if (com_finger == 2) {
				System.out.print("컴퓨터가 낸 것은 바위 입니다. ");
				if (my_finger == 3) {
					System.out.print("-----> 사용자 승!\n");
					score[0][2]++;	// 컴퓨터 전적 
					score[1][0]++;	// 사용자 전적 
				}
				else if (my_finger == 1) {
					System.out.print("-----> 컴퓨터 승!\n");
					score[0][0]++;
					score[1][2]++;
				}
				else if (my_finger == 2){
					System.out.print("-----> 비김~\n");
					score[0][1]++;
					score[1][1]++;			
				}
			}	
			
			// 컴퓨터가 가위를 낸 경우 
			else if (com_finger == 1) {
				System.out.print("컴퓨터가 낸 것은 가위 입니다. ");
				if (my_finger == 2) {
					System.out.print("-----> 사용자 승!\n");
					score[0][2]++;	// 컴퓨터 전적 
					score[1][0]++;	// 사용자 전적 
				}
				else if (my_finger == 3) {
					System.out.print("-----> 컴퓨터 승!\n");
					score[0][0]++;
					score[1][2]++;
				}
				else if (my_finger == 1){
					System.out.print("-----> 비김~\n");
					score[0][1]++;
					score[1][1]++;			
				}
			}	
		}
		
		// 전적 출력
		System.out.println("컴퓨터 : 이긴 횟수는 "+ score[0][0] + "회, 진 횟수 "+ score[0][2] + "회, 비긴 횟수는 " + score[0][1] + "회 입니다.");
		System.out.println("사용자 : 이긴 횟수는 "+ score[1][0] + "회, 진 횟수 "+ score[1][2] + "회, 비긴 횟수는 " + score[1][1] + "회 입니다.");
		
		s1.close();
	}
}
