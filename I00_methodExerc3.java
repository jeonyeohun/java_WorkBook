package WorkBook;

import java.util.Random;
import java.util.Scanner;

public class I00_methodExerc3 {
	int GetScore() {	// 반환형이 있는 메소드 
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.print("점수를 입력하시오. (0~100) :");
			int num = s.nextInt();
			if (num >= 0 && num <= 100) {
				return num;			// 범위내 유효한 숫자만 리턴 
			}
			System.out.println("잘못된 범위의 수입니다.");	// 리턴이 안되면 에러메세지 이후에 반복문 다시 반복
		}
	}
	
	public static void main (String[] args) {
		String class_name[] = {"국어", "영어", "수학"};
		int score[] = {0,0,0};
		int sum =0;
		
		I00_methodExerc3 obj = new I00_methodExerc3();
		
		for (int i=0 ; i<score.length ; i++) {
			System.out.print(class_name[i]);
			score[i] = obj.GetScore();
			sum += score[i];
		}
		double average = sum / 3.0;
		System.out.println("과목의 총점은 "+ sum + ", 평균은 " + average + "입니다.");
	}
	
}
