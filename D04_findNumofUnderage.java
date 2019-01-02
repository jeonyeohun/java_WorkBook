package WorkBook;
/*
 * 가족이 몇 명인지 입력받은 후, 그 인원 수 만큼 태어난 년도를 입력받으면서, 
 * 나이를 계산하여 미성년자가 모두 몇 명인지 출력하라.
 * 단, 나이 = 2018 – 태어난 년도 + 1 로 계산하고 나이가 20세 미만인 경우, 미성년자로 판정한다.
 * 
 * 2018.12.31 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class D04_findNumofUnderage {
	public static void main (String[] args) {
		int count_all;	// 가족 인원 수 
		int count_young = 0; // 미성년자의 수 
		int birth_year; // 태어난 년도
		int age;		// 나이 
		int i;			// 반복문에 사용할 변수 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("가족이 몇명인지 입력하세요: ");
		count_all = input.nextInt();
		
		for (i=0 ; i<count_all ; i++) {
			System.out.print("태어난 년도를 입력하세요: ");
			birth_year = input.nextInt();
			
			age = 2018 - birth_year +1;	// 나이를 계산
			if (age < 20) {		// 계산 결과가 20 미만이면 미성년자 수 변수 증가
				count_young ++;
			}			
		}
		
		input.close();
		System.out.println("가족들 중에 미성년자는 모두 "+ count_young + "명 입니다.");
	}
}
