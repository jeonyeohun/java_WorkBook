package WorkBook;
/*
 * 부동산 거래종류(1:매매, 2:임대, 0:계산종료)와 거래금액을 입력받은 후
 * 이에 대한 중개 수수료를 계산 하여 출력하라. 
 * 입력과 출력을 계속 반복하되 계산종료(0)를 입력하면 반복을 중단하고 지금까지의 수수료 총액을 출력하라.
 * 
 * 2019.01.05 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class G04_realEstateInterest {
	public static void main (String[] args) {
		int kind;	// 거래 종류 (1: 매매, 2: 임대, 0: 계산종료)
		int money; 	// 거래 금액
		int charge; // 중계 수수료
		int total_charge=0; // 수수료 총액
		Scanner s1 = new Scanner(System.in);
		
		while(true) {
			System.out.print("부동산 거래 종류(1:매매, 2:임대, 0:계산종료)를 입력하세요: ");
			kind = s1.nextInt();
			
			// 종료조건 설정 
			if(kind == 0) {
				break;
			}
			
			System.out.print("부동산 거래금액(원)을 입력하세요: ");
			money = s1.nextInt();
			
			// 매매 수수료 계산
			if(kind == 1) {	// 매매 
				if (money < 50000000) {	// 5천만원 미만 
					charge = (int) (money * 0.006);
					// 상한 금액 설정 
					if (charge >250000) {
						charge = 250000;
					}
				}
				else if (money < 200000000) {	// 5천만원 이상, 2억원 미만 
					charge = (int) (money * 0.005);
					// 상한 금액 설정
					if (charge > 800000) {
						charge = 800000;
					}
				}
				else {	// 2억원 이상 
					charge = (int) (money * 0.004);
				}
				System.out.println("이에 대한 부산 중개 수수료는 " + charge + "원 입니다.");
				total_charge += charge;
			}
			
			else if (kind == 2) {	// 임대 
				if (money < 20000000) {	// 2천만원 미만 
					charge = (int)(money * 0.005);
					// 상한 금액 설정
					if (charge > 70000) {
						charge = 70000;
						}
				}
				else if (money < 50000000) {	// 5천만원 미만 
					charge = (int)(money * 0.005);
					// 상한 금액 설정
					if (charge > 200000) {
						charge = 200000;
						}
				}
				else if (money < 100000000) {	// 1억원 미만 
					charge = (int)(money * 0.004);
					// 상한 금액 설정
					if (charge > 300000) {
						charge = 300000;
					}
				}
				else { // 1억원 이상 
					charge = (int)(money * 0.003);
				}
				System.out.println("이에 대한 부산 중개 수수료는 " + charge + "원 입니다.");
				total_charge += charge;
			}
		}
		
		// 수수료 총액 출력 
		s1.close();
		System.out.println("지금까지의 수수료 총액은 "+ total_charge +"원 입니다.");
	}
}
