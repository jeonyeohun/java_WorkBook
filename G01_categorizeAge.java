package WorkBook;
/*
 * 최대 100명까지 사람들의 태어난 년도를 입력받아 나이를 계산한 후, 
 * 그 값을 저장하되, 2019보다 큰 년 도가 입력되기 전까지 태어난 년도를 반복하여 입력받도록 하라. 
 * 반복이 끝나면 지금까지 입력된 사람들의 나이를 모두 출력하고, 각자의 나이에 따라 유아, 어린이, 청소년, 청년, 중년, 노년 여부를 판정하여 
 * 이 중 에 유아, 어린이, 청소년, 청년, 중년, 노년이 각각 몇 명인지 출력하라.
 * 단, 나이 = 2019 – 태어난 년도 + 1 로 계산하고 연령대 구분은 다음과 같이 판정한다. 
 * 7세 미만 : 유아, 
 * 7세 이상 ~ 13세미만 : 어린이, 
 * 13세 이상 ~ 20세 미만 : 청소년, 
 * 20세 이상 ~ 30세 미만 : 청년, 
 * 30세 이상 ~ 60세 미만 : 중년, 
 * 60세 이상 : 노년
 * 
 * 2019.01.04 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class G01_categorizeAge {
	public static void main (String[] args) {
		int birth_year;
		int age[] = new int[100];	// 최대 100명의 나이를 저장할 배열
		int count_person = 0;	// 입력된 인원
		int count_baby = 0;		// 유아 
		int count_child = 0;	// 어린이 
		int count_youth = 0;	// 청소년 
		int count_young = 0;	// 청년
		int count_adult = 0;	// 중년
		int count_old = 0;		// 노년 
		int i=0; 
		Scanner s1 = new Scanner(System.in);
		
		
		// 생년 입력 및 나이로 계산하여 배열에 저장 
		while(true) {
			System.out.print(i+1 + "번째 사람의 태어난 년도를 입력하세요: ");
			birth_year = s1.nextInt();
			
			if (birth_year>2019) {
				break;
			}
			
			count_person++;
			age[i++] = 2019 - birth_year +1 ;
			
		}
		
		s1.close();
		
		// 나이 출력 및 연령대 판정 
		for (i=0 ; i<count_person ; i++) {
			System.out.println(i+1 + "번째 사람의 나이는 "+ age[i] + "입니다.");
			if (age[i]<7) {
				count_baby++;
			}
			else if (age[i]<13) {
				count_child++;
			}
			else if (age[i]<20) {
				count_youth++;
			}
			else if (age[i]<30) {
				count_young++;
			}
			else if (age[i]<60) {
				count_adult++;
			}
			else {
				count_old++;
			}
		}
		
		// 연령대 출력 
		System.out.println("유아는 "+ count_baby +"명 입니다.");
		System.out.println("어린이는 "+ count_child +"명 입니다.");
		System.out.println("청소년은 "+ count_youth +"명 입니다.");
		System.out.println("청년은 "+ count_young +"명 입니다.");
		System.out.println("중년은 "+ count_adult +"명 입니다.");
		System.out.println("노년은 "+ count_old +"명 입니다.");
	}
}
