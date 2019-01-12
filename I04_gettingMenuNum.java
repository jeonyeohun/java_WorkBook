package WorkBook;
/*
 * 어떤 식당의 메뉴판을 보여준 후에 메뉴번호를 입력받아 그 가격을 리턴하는 메소드를 만들어라. 
 * 메인 메소드에서 이 메소드를 호출하여 리턴 받은 가격을 합산하되 
 * 메뉴선택 종료를 의미하는 5를 리턴 받을 때까지 계속 반복하여 메뉴를 선택하게 하고, 선택종료 후 선택한 메뉴의 총 합계금액을 출력하라.
 * 단, 사용할 메뉴는 다음과 같다.
 * 1. 피자(15,000원), 
 * 2. 스파게티(10,000원), 
 * 3. 샐러드(7,000원), 
 * 4. 음료수(2,000원), 
 * 5. 종료
 * 
 * 2019.01.12 Jeon, Yeo Hun

 */

import java.util.Scanner;
public class I04_gettingMenuNum {
	
	@SuppressWarnings("resource")
	int SelectMenu() {
		int op;
		Scanner s1 = new Scanner(System.in);
		System.out.print("메뉴를 선택해주세요.(종료 : 5): ");
		op = s1.nextInt();
		
		// 옵션별 가격 리턴
		if (op == 1) {
			return 15000;
		}
		else if(op == 2) {
			return 10000;
		}
		else if (op == 3) {
			return 7000;
		}
		else if (op == 4) {
			return 2000;
		}
		else {
			return -1;
		}
	}
	
	public static void main (String[] args) {
		int sum = 0;
		int price=0;
		I04_gettingMenuNum obj = new I04_gettingMenuNum();
		
		// 메뉴 출력
		System.out.println("1. 피자, 2.스파게티, 3. 샐러드, 4. 음료수, 5. 종료");
		
		// 총 주문 금액 계산 
		while(true) {
			price = obj.SelectMenu();
			if (price == -1) {
				break;
			}
			sum += price;
			System.out.println("현재까지의 주문 금액은 "+ sum + "원 입니다.");
		}
		
		System.out.println("총 주문 금액은 "+ sum + "원 입니다.");
	}
}
