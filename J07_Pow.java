package WorkBook;
/*
 * 반복해서 임의의 숫자 n을 입력받은 후 2n을 계산하여 출력하되, 재귀메소드를 이용하여 계산하라. 
 * 이 때 사용할 재귀메소드 poweroftwo()의 정의는 다음과 같다.
 * 
 * 2019.01.12 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class J07_Pow {
	int poweroftwo(int n) {
		if (n == 0) {
			return 1;
		}
		else {
			return 2 * poweroftwo(n-1); 
		}
	}
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		J07_Pow obj = new J07_Pow();
		
		int n; 
		while (true) {
			System.out.print("숫자를 입력하세요 (0.종료) : ");
			n =  s.nextInt();

			if (n == 0) {
				break; 
			}
			
			System.out.println("2의 " + n + "승은 : " + obj.poweroftwo(n));
		}
		
		s.close();
	}
}
