package WorkBook;
import java.util.Scanner;

// 날 수를 입력받아 이 날 수에 해당되는 기간은 모두 몇 초인지 계산하여 출력하라. 
// 단, 초 = 날 수 * 24 * 60 * 60 으로 계산한다.
// 2018.12.24 Jeon, Yeo Hun

public class A05_CalculateDateToSec {
	public static void main(String[] args) {
		int days;
		int seconds;
		Scanner input = new Scanner(System.in);
		
		System.out.print("날 수를 입력하세요: ");
		days = input.nextInt();
		
		input.close();
		
		seconds = days * 24 * 60 * 60;
		
		System.out.println("날 수에 해당되는 시간은 모두 " + seconds + " 초 입니다.");
	}
}
