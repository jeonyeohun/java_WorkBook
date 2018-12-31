package WorkBook;
/*
 * 반복해서 0부터 100 사이의 숫자를 입력받아서 지금까지 입력된 숫자들 중 가장 큰 수와 가장 작은 수가 무엇인지 출력하라. 
 * 0부터 100 사이의 숫자가 아닌 수가 입력되면 반복문이 중단되도록 하라.
 * 
 * 2018.12.31 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class D02_findMaxandMin {
	public static void main (String[] args) {
		int number;
		int max_num=1;	// 최댓값을 저장하는 변수는 범위 내 최소값으로 초기화. 
		int min_num=99;	// 최솟값을 저장하는 변수는 범위 내 최댓값으로 초기화.
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.print("0부터 100사이의 숫자를 입력하세요: ");
			number = input.nextInt();
			if (number <0 || number >100) {
				break;	// 0 보다 작거나 100보다 큰 수가 입력되면 반복 종료.
			}
			
			if (number>max_num) {
				max_num = number;	// 숫자가 입력될 때마다 비교해서 더 큰 숫자가 들어오면 변수에 저장.
			}
			if (number<min_num) {
				min_num = number;	// 숫자가 입려될 때마다 비교해서 더 작은 숫자가 들어오면 변수에 저장.
			}
		}
		
		input.close();
		
		System.out.println("입력된 숫자들 중 가장 큰 수는 "+ max_num + " 이고, 가장 작은 수는 "+ min_num +" 입니다.");
	}
}
