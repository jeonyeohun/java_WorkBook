package WorkBook;
/*
 * 날 수를 입력받아 이 날 수에 해당되는 기간은 모두 몇 초인지 계산하고, 
 * 100만 초가 넘는 경우에는 100만 초가 모두 몇 번이나 포함되는지 계산하여 출력하라.
 * 단, 초 = 날 수 * 24 * 60 * 60 으로 계산한다.
 * 2018.12.28 Jeon. Yeo Hun
 */

import java.util.Scanner;
public class B05_DateCalculator {
	public static void main (String[] args) {
		int days;
		int seconds;
		int m_count;
		Scanner input = new Scanner (System.in);
		
		System.out.print("날수를 입력하세요: ");
		days = input.nextInt();
		
		input.close();
		
		seconds = days * 24 * 60 * 60;
		System.out.println("날수에 해당되는 기간은 모두 "+ seconds + " 초입니다.");
		
		if (seconds > 1000000) {
			m_count = seconds/1000000;
			System.out.println("100만 초가 모두 "+ m_count + " 번이나 포함됩니다.");
		}
	}
}
