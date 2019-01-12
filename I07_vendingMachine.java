package WorkBook;
/*
 * 자판기의 메뉴를 보여주고 선택하게 하여 선택된 음료의 가격을 리턴하는 메소드 SelectCan()을 만들어라. 
 * 그리고 이 메소드를 이용해서 자판기에서 음료를 반복해서 선택하게 하여 총 음료의 개수와 가격을 출력하 라.
 * 자판기의 음료 종류와 가격은 다음과 같다.
 * 1.콜라(700원) 
 * 2.원두커피(300원) 
 * 3.레몬주스(1000원) 
 * 4.홍차(500원) 
 * 5.코코아(600원)
 * 
 * 2019.01.12 Jeon, Yeo Hun 
 */

import java.util.Scanner;
public class I07_vendingMachine {
	Scanner s = new Scanner(System.in);	// 전역변수로 선언해서 계속 에러 났던 부분 해결.
	int SelectCan() {	// 리턴값은 음료의 값. 
		int op;
		int price[] = {700, 300, 1000, 500, 600};	// 각 음료별 가격을 저장하고 있는 배열
		
		System.out.println("1.콜라(700원) 2.원두커피(300원) 3.레몬주스(1000원) \n4.홍차(500원) 5.코코아(600원)");
		System.out.print("메뉴를 선택해주세요: ");
		op = s.nextInt();
		
		// 선택된 음료의 가격을 리턴
		return price[op-1];
	}
	
	public static void main (String[] args) {
		I07_vendingMachine obj = new I07_vendingMachine();
		String op;
		Scanner s = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int price;
		
		// 메소드 호출 및 총 가격 계산
		while(true) {
			price = obj.SelectCan();
			System.out.print("더 필요하십니까?(Y/N): ");
			op = s.next();
			
			count++;
			sum += price;
			
			// 무한루프 종료 조건 >> 사용자가 N을 입력했을 때.
			if (op.equals("N")) {
				break;
			}
				
			
		}
		// 선택한 음료의 개수 및 총 가격 출력.
		s. close();
		System.out.println(count + "개의 음료를 선택하여 총 "+ sum + "원 입니다.");
	}
}
