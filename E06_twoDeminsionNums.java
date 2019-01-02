package WorkBook;
/*
 * 행의 크기(rows)와 열의 크기(columns)를 입력받은 후에, 
 * 이 크기만큼의 바둑판 모양의 2차원 공간의 각 칸마다 행 번호(1, 2, ..., width)와 열 번호(1, 2, ..., height)를 곱한 값을 출력하라.
 * 
 * 2019.01.02 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class E06_twoDeminsionNums {
	public static void main (String[] args) {
		int rows, columns;	// 행의 갸수, 열의 개수
		int number;	// 각 칸에 출력하는 값 
		int i, j;	// 반복문 변수 
		Scanner input = new Scanner(System.in);
		
		System.out.print("출력하려는 행의 크기와 열의 크기를 입력하시오: ");
		rows = input.nextInt();
		columns = input.nextInt();
		
		input.close();
		
		for (i= 1 ; i <= rows ; i++) {
			for (j=1 ; j<=columns ; j++) {
				number = j*i; // 행이 n개 증가할 때마다 숫자가 첫행에 n배 만큼 증가한다.
				System.out.print(number+"\t");	
			}
			System.out.print("\n");
		}
	}

}
