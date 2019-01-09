package WorkBook;
/*
 * 어떤 식당의 메뉴판을 보여주는 메소드를 만들어라. 
 * 메인 메소드에서 이 메소드를 호출하여 메뉴판을 보여준 다음 메뉴번호를 입력받아 해당 메뉴의 가격을 합산하되 
 * 메뉴선택 종료를 의미하는 5값을 입력 받을 때까지 계속 반복하여 메뉴를 선택하게 하고, 
 * 선택종료 후 선택한 메뉴의 총 합계금액을 출력하라.
 * 2019.01.09 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class I01_showMenu {
	void ShowMenu() {
		System.out.println("1. 피자(15,000) 2. 스파게티(10,000) 3. 샐러드(7,000원) 4. 음료수(2,000원)");
	}
	
	public static void main (String[] args) {
		int sum = 0;
		int op;
		int menu [] = {15000, 10000, 7000, 2000};
		Scanner s1 = new Scanner(System.in);
		I01_showMenu obj = new I01_showMenu();	// 인스턴스 생성 
		
		while(true) {
			obj.ShowMenu();	// 메소드 불러오기
			System.out.print("메뉴를 선택해주세요(종료는 5): ");
			op = s1.nextInt();
			
			// 종료 조건 
			if (op == 5) {
				break;
			}
			
			// 현재까지 가격 계산
			sum += menu[op-1];
			
			System.out.println("현재까지 주문 금액은 "+ sum + "원 입니다.\n");
		}
		
		System.out.println("\n총 주문 금액은 "+ sum + "원 입니다.");
		s1.close();
	}
}
