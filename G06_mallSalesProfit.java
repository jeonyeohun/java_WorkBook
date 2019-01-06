package WorkBook;
/*
 * 어떤 가게에서 세 종류의 제품(가죽장갑 1만원, 털장갑 6천원, 비닐장갑 3천원)을 판매하고 있다. 
 * 손님들이 들어오면 이 제품들에 대해 각각 몇 개를 구입할 것인지를 입력받아서 판매금액을 계산하여 출력하라. 
 * 구입 개수를 모두 0으로 입력하게 되면 판매가 종료되도록 하며, 지금까지 판매한 제품의 종류별 개수와 총 매출 금액을 화면에 출력하라.
 * 
 * 2019.01.05 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class G06_mallSalesProfit {
	public static void main (String[] args) {
		int order[] = {0, 0, 0};	// 입력받는 구매 제품 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]
		int sale;					// 계산한 판매금액 
		int total_sale = 0;				// 매출 총액 
		int total_order[] = {0, 0 ,0};	// 총 판매 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]
		int price[] = {10000, 6000, 3000};	// 제품별 가격
		int i;								// 반복문 변수 
		Scanner s1 =  new Scanner (System.in);
		
		System.out.println("세 종류의 제품이 있습니다.\n (1. 가죽장갑 1만원, 2. 털장갑 6천원, 3. 비닐장갑 3천원)");
		while(true) {
			sale = 0;
			// 개수 입력 받기 
			for (i=0 ; i<3 ; i++) {
				System.out.print(i+1 + "번 제품은 몇개를 구입하실래요?: ");
				order[i] = s1.nextInt();
				total_order[i] += order[i];
			}
			
			// 건 별 판매금액 계산 
			for (i=0 ; i<3 ; i++) {
				sale = sale + price[i] * order[i];
			}
			
			// 총 판매 금액 계산 
			total_sale += sale;
			
			// 종료 조건 설정
			if (order[0] == 0 && order[1]==0 && order[2] == 0) {
				break;
			}
			
			System.out.println("판매금액은 "+ sale + "원 입니다.");
		}
		
		// 계산결과 출력
		System.out.println("지금까지의 총 매출금액은 "+ total_sale + "원 입니다.");
		s1.close();	
	}
}
