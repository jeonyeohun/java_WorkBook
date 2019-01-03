package WorkBook;
/*
 * 사용자에게 1부터 100사이의 숫자를 10개 입력받아 이를 순서대로 출력하라. 
 * 단, 사용자가 입력하는 동안 이미 입력한 숫자와 같은 숫자를 입력하면 
 * "잘못 입력하였습니다. 다시 입력하세요."라는 문구와 함께 다시 입력받도록 하라. 
 * 입력이 완료되면 10개의 수를 모두 출력하라.
 * 
 * 2019.01.03 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class F08_tenNumbersNoDup {
	public static void main (String[] args) {
		 int number[] = new int[10];
		 int newnum;
		 int count=0;
		 boolean dup = false;
		 int i;
		 Scanner s1 = new Scanner(System.in);
		 
		 System.out.println("1 부터 100 사이의 숫자를 입력하시오.");
		 
		 while(count<10) {
			 System.out.print(count+1 + "번째 숫자를 입력하세요: ");
			 newnum = s1.nextInt();
			 
			 // 중복 판정 반복문 
			 for (i=0 ; i<count ; i++) {
				 if (number[i] == newnum) {
					 dup = true;
					 break;
				 }
				 else {
					 dup = false;
				 }
			 }
			 // 중복이 없으면 배열에 저장 후 개수 1 증가 
			 if (dup == false) {
				 number[count] = newnum;
				 count++;
			 }
			 // 중복이 있으면 에러 메세지 출력 
			 else {
				 System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
			 }
		 }
		 s1.close();

		 
		 // 배열요소 출력 
		 for (i=0 ; i<10 ; i++) {
			 System.out.println(i+1 +"번째 숫자는 "+ number[i] + "입니다.");
		 }
	}
}
