package WorkBook;
/*
 * 2에서 9사이의 숫자 5개를 입력받아 배열에 저장한 후, 
 * 이 5개의 숫자들 중 임의의 2개의 숫자 a와 b를 선택하여 ab의 값을 계산하여 이 중에서 가장 큰 수와 가장 작은 수를 만들 수 있는 경우를 찾아내라. 
 * 계산 할 때에는 메소드 pow()를 사용하라. 
 * 예를 들어 2, 3, 4, 5, 6을 입력한 경우에는 가장 작은 수는 23이고, 가장 큰 수는 56이 된다.
 * 
 * 2019.01.08 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class H06_powCombination {
	public static void main(String[] args) {
		int number[] = new int[5];			// 입력받은 5개의 값 
		int pow_value[][] = new int [5][5];	// 임의의 두 수 로 만들 수 있는 a^b의 값들
		int max, min;						// 최댓값과 최소값 
		int max_a, max_b;					// 최댓값을 만들어내는 경우의 a와 b의 값
		int min_a, min_b;					// 최솟값을 만들어내는 경우의 a와 b의 값 
		int i, j;
		Scanner s1 = new Scanner(System.in);
		
		// 5개의 숫자 입력받기 
		System.out.print("2에서 9사이의 숫자 5개를 입력하세요: ");
		for (i=0 ; i<5 ; i++) {
			number[i] = s1.nextInt();
		}
		
		max = min = min_a = min_b = (int) Math.pow(number[0], number[1]);
		max_a = max_b = 0;
		
		// 제곱수 만들어서 배열에 저장
		for (i=0 ; i<5 ; i++) {
			for (j=0; j<5 ; j++) {
				if (i == j) {	// 같은 수를 제곱하는 경우 제외 
					continue;
				}
				pow_value[i][j] = (int) Math.pow(number[i], number[j]);
				if (pow_value[i][j] <= min) {
					min = pow_value[i][j];
					min_a = number[i];
					min_b = number[j];
				}
				else if (pow_value[i][j] >= max) {
					max = pow_value[i][j];
					max_a = number[i];
					max_b = number[j];
				}
			}
		}
		
		// 결과 출력
		System.out.println("입력하신 5개의 수로 제곱수를 만들면...");
		System.out.println("가장 큰 수는 "+ max_a + "의 " + max_b + "승인 " + max + " 입니다.");
		System.out.println("가장 작은 수는 "+ min_a + "의 " + min_b + "승인 " + min + " 입니다.");
		
		
		s1.close();
	}

}
