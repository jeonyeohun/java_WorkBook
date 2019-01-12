package WorkBook;
/*
 * 1부터 100사이의 임의의 숫자를 만들어서 대(70 이상), 중(40이상~70미만), 소(40미만) 셋 중에 하나 를 판정하여 결과를 리턴하는 메소드 GetRandom()을 만들어라. 
 * 그리고 이 메소드를 이용해서 임의의 숫 자 10개에 대해 대, 중, 소가 각각 몇 번씩 포함되어 있는지 개수를 출력하라.
 * 리턴값을 임의로 만들어낸 숫자가 속하는 구간번호 0.대(70 이상), 1.중(40이상 70 미만), 2.소(40미만) 출력
 * 
 * 2019.01.12 Jeon, Yeo Hun
 */

import java.util.Random;

public class I06_RandomNumScale {
	byte GetRandom() {
		Random rand = new Random();
		int num;
		
		num = rand.nextInt(100)+1;			
		System.out.println("생성된 임의의 숫자는 "+ num + "입니다.");
		
		// 구간 값 리턴
		if (num >= 70) {
			return 0;	
		}
		else if (num >= 40) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
	public static void main (String[] args) {
		int i;
		int scale0 = 0;	// 대 구간 횟수  
		int scale1 = 0; // 중 구간 횟수
		int scale2 = 0; // 소 구간 횟수
		int num;
		I06_RandomNumScale obj = new I06_RandomNumScale();
		System.out.println("10개의 임의의 숫자를 생성합니다.");
		
		// 메소드를 10번 실행하고 메소드의 리턴값에 맞게 구간 횟수 계산
		for(i=0 ; i<10 ; i++) {
			 num = obj.GetRandom();
			 if (num == 0) {
				 scale0++;
			 }
			 else if (num == 1) {
				 scale1++;
			 }
			 else {
				 scale2++;
			 }
		}
		
		// 계산 결과 출력
		System.out.println("1. 대 (70 이상) : " + scale0 + "회 생성");
		System.out.println("2. 중 (40 이상) : " + scale1 + "회 생성");
		System.out.println("3. 소 (40 미만) : " + scale2 + "회 생성");
		
	}
}
