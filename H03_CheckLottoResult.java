package WorkBook;
/*
 * 사용자에게 1부터 45사이의 임의의 숫자를 6개 입력받은 후에, 
 * 프로그램에서 만든 임의의 로또 번호와 대 조하여 몇 개의 숫자가 일치하는 지 출력하라. 
 * 단, 사용자가 입력한 6개의 번호 중에 중복되는 번호가 없도 록 입력받아야 하며, 
 * 프로그램에서 만든 임의의 로또 번호에서도 중복되는 번호가 없도록 해야 한다.
 * 
 * 2019.01.07 Jeon, Yeo Hun;
 */

import java.util.Scanner;
import java.util.Random;

public class H03_CheckLottoResult {
	public static void main (String[] args) {
		int lotto_com[] = new int[6];		// 컴퓨터가 만든 로또 번호 리스트
		int lotto_user[] = new int[6]; 		// 사용자가 입력한 로또 번호 리스트
		int i;
		int count;
		int match_count = 0;	// 일치하는 로또 번호의 개수
		Scanner s1 = new Scanner(System.in);
		Random rand = new Random();
		
		// 6개의 중복되지 않는 로또 번호 생성
		for (count=0 ; count<6 ; count++) {
			lotto_com[count] = rand.nextInt(45)+1;
			// 지금까지 만든 번호 와 같은 숫자가 만들어졌다면 인덱스 1 감소 후 다시 난수생성
			for (i = 0 ; i<count; i++) { 
				if(lotto_com[count] == lotto_com[i]) {
						count--;
				}
			}
		}
		
		// 사용자에게 중복되지 않는 6개의 숫자 입력받기 
		for (count=0 ; count<6 ; count++) {
			System.out.print("원하는 " + (count+1) + "번째 로또 숫자를 입력하세요: ");
			lotto_user[count] = s1.nextInt();
			for (i=0 ; i<count ; i++) {
				if (lotto_user[count] == lotto_user[i]) {
					System.out.println("=> 잘못 입력하셨습니다.");
					count--;
				}
			}
		}
		
		// 컴퓨터가 생성한 로또번호 출력 
		System.out.println("\n이번 주의 로또 당첨 번호는 ");
		for (i=0 ; i<6 ; i++) {
			System.out.print(lotto_com[i] + " ");
		}
		System.out.println("입니다.\n");
		
		// 일치하는 로또 번호 확인
		for (i=0 ; i<6 ; i++) {
			if(lotto_com[i] == lotto_user[i]) {
				match_count++;
			}
		}
		
		System.out.println("일치하는 로또 번호는 "+ match_count + "개 입니다.");
		s1.close();
	}
}
