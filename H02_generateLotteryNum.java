package WorkBook;
/*
 * 1부터 45사이의 임의의 숫자를 6개 만들어 로또 번호를 완성하라. 
 * 단, 6개의 번호 중에 중복되는 번호가 없도록 해야 한다. 
 * 출력한 후에 사용자에게 "더 만드시겠습니까? (Y/N) "를 물어보고 
 * N을 입력할 때까지 계속해서 반복하라.
 * 
 * 2019.01.07 Joen, Yeo Hun 
 */

import java.util.Scanner;
import java.util.Random;

public class H02_generateLotteryNum {
	public static void main (String[] args) {
		int lotto[] = new int[6]; // 로또 번호 리스트
		int count;					// 로또 순서 
		String onemore;				// 반복여부 
		int i;
		Scanner s1 = new Scanner(System.in);
		Random rand = new Random();
		
		while(true){
			
			// 6개의 중복되지 않는 로또 번호 생성
			for (count=0 ; count<6 ; count++) {
				lotto[count] = rand.nextInt(45)+1;
				
				// 지금까지 만든 번호 와 같은 숫자가 만들어졌다면 인덱스 1 감소 후 다시 난수생성
				for (i = 0 ; i<count; i++) {
					if(lotto[count] == lotto[i]) {
						count--;
					}
				}
			}
			
			// 만들어진 로또 번호 출력 
			
			System.out.print("생성된 로또 번호는 ");
			for (i=0 ; i<6 ; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println("입니다.");
			
			// 종료조건
			System.out.print("더 만드시겠습니까?(Y/N): ");
			onemore = s1.next();
			
			if (onemore.equalsIgnoreCase("N")) {
				break;
			}
		}
		s1.close();
	}
}
