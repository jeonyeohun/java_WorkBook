package WorkBook;
/*
 * 숫자 10개를 입력받아 이 중 최댓값을 찾아서 리턴하는 메소드 MaxOfTen()을 만들고, 
 * 이 메소드를 이용 하여 10개의 숫자 중 최댓값을 출력하라.
 * 
 * 2019.01.12 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class I05_returnBigg {
	int MaxOfTen() {	// 리턴값만 있는 메소드
		Scanner s = new Scanner(System.in);
		int num;
		int max=0;
		int i;
		
		// 10개의 수 입력받아 입력받을 때마다 그 값이 현재까지의 최댓값인지 확인
		for (i=0 ; i<10 ; i++) {
			System.out.print((i+1) + "번 수를 입력하세요: ");
			num = s.nextInt();
			
			if (max < num) {
				max = num;
			}
		}
		s.close();
		return max;	// 최댓값 리턴 
	}

	public static void main (String[] args) {
		I05_returnBigg obj = new I05_returnBigg();
		
		// 시작 메세지와 리턴받은 최댓값 출력.
		System.out.println("10개의 숫자 중 최댓값을 구합니다.");
		System.out.println("최댓값은 "+ obj.MaxOfTen() + "입니다.");
	}
}
