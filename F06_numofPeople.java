package WorkBook;
/*
 * 한 층에 3집(1호, 2호, 3호)으로 되어 있는 5층짜리 아파트가 있다. 
 * 2차원 배열을 사용하여 101호부터 503호까지 각 집에 살고 있는 사람의 숫자를 입력받아 보관하라. 
 * 그리고 이 아파트에 사는 거주자는 모두 몇 명인지 출력하라.
 * 
 * 2019.01.03 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class F06_numofPeople {
	public static void main (String[] args) {
		int number[][] = new int[5][3]; // 각 집의 거주자 수, 층별, 호수별 중복 리스트 
		int newnum;
		int total=0;
		int ho;
		int i,j;
		Scanner s1 = new Scanner(System.in);
		
		for (i=0 ; i<5 ; i++) {
			for (j=0 ; j<3 ; j++) {
				ho = (i+1)*100+j+1;	// 호수 계산. 층수*100 + 방 번호 
				System.out.print(ho + "호에 살고 있는 사람의 숫자를 입력하세요: ");
				newnum = s1.nextInt();
				
				// 총 거주자 수 계산 
				number[i][j] = newnum;
				total = total+newnum;
			}
		}
		s1.close();
		System.out.println("이 아파트에 사는 거주자는 모두 "+ total + "명 입니다.");
	}
}
