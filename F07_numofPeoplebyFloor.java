package WorkBook;
/*
 * 한 층에 3집(1호, 2호, 3호)으로 되어 있는 5층짜리 아파트가 있다. 
 * 2차원 배열을 사용하여 101호부터 503호까지 각 집에 살고 있는 사람의 숫자를 입력받아 보관하라. 
 * 그리고 이 아파트에 사는 거주자의 숫자를 층별(1층~5층)로 합산하여 출력하고, 호수별(1호~3호)로 합산하여 출력하라. 
 * 예를 들어 1층 거주자의 수 는 101호, 102호, 103호 거주자의 수를 합한 것이고, 2호 라인 거주자의 수는 102호, 202호, 302호, 402호, 502호 거주자의 수를 합한 것이다.
 * 
 * 2019.01.03 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class F07_numofPeoplebyFloor {
	public static void main (String[] args) {
		int number[][] = new int[5][3]; // 각 집의 거주자 수, 층별, 호수별 중복 리스트 
		int newnum;
		int floor_total[] = new int[5];
		int line_total[] = new int[3];
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
		
		// 층별 총 거주자 계산
		for (i=0 ; i<5 ; i++) {
			for (j=0 ; j<3 ; j++) {
				floor_total[i] += number[i][j];
			}
		}
		
		// 라인 별 총 거주자 계산
		for (i=0 ; i<3 ; i++) {
			for (j=0 ; j<5 ; j++) {
				line_total[i] += number[j][i];
			}
		} 
		
		s1.close();
		
		for (i=0 ; i<5 ; i++) {
			System.out.println(i+1 + "층에 사는 거주자는 모두 "+ floor_total[i] + " 명입니다.");
		}
		
		System.out.println("\n");
		
		for (i=0 ; i< 3 ; i++) {
			System.out.println(i+1 + "호 라인에 사는 거주자는 모두 "+ line_total[i] + "명 입니다.");
		}
		
		System.out.println("\n");
		
		System.out.println("이 아파트에 사는 거주자는 모두 "+ total + "명 입니다.");
	}
}
