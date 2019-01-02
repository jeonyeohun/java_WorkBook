package WorkBook;
/*
 * 반복해서 직사각형의 가로크기와 세로크기를 입력받으면서 이 값을 이용하여 
 * 직사각형의 모양을 판정하여 각각의 종류별로 몇 개가 입력되었는지 결과를 출력하라. 
 * 가로 크기와 세로 크기 중 하나라도 0이하의 값이 입력되면 반복을 중단한다.
 * 단, 평가 기준은 다음과 같다.
 * 가로 크기와 세로크기가 동일 : "정사각형"
 * 가로 크기가 세로크기의 2배 이상 : "좌우로 길쭉한 직사각형" 
 * 세로 크기가 가로크기의 2배 이상 : "위아래로 길쭉한 직사각형" 
 * 가로 크기가 세로크기보다 크면 : "일반적인 가로형 직사각형"
 * 세로 크기가 가로크기보다 크면 : "일반적인 세로형 직사각형"
 * 
 * 2019.01.02 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class D05_countRect {
	public static void main (String[] args) {
		int width, height; // 가로크기, 세로크기
		int count1=0; // 정사각형의 개수 
		int count2=0; // 좌우로 길쭉한 직사각형의 개수
		int count3=0; // 위아래로 길쭉한 직사각형의 개수
		int count4=0; // 일반적인 가로형 직사각형의 개수
		int count5=0; // 일반적인 세로형 직사각형의 개수
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("직사각형의 가로 크기와 세로 크기를 입력하시오: ");
			width = input.nextInt();
			height = input.nextInt();
			
			if (width <= 0 || height <= 0) { // 가로나 세로 중 0 이하인 값이 있다면 반복문 탈출
				break;
			}
			
			if (width == height) {	// 가로와 세로 값이 같다면  
				count1++; // 정사각형 개수 변수 1 증가.
			}
			else if (width>height*2) { // 가로크기가 세로크기의 2배 이상이라면 
				count2++;	// 좌우로 길쭉한 직사각형 변수 1 증가 
			}
			else if (height>width*2) { // 세로크기가 가로크기의 2배 이상이라면 
				count3++;	// 위아래로 길쭉한 직사각형 변수 1 증가
			}
			else if (width>height) {	// 가로 크기가 세로 크기보다 크다면
				count4++;	// 일반적인 가로형 직사각형 변수 1 증가 
			}
			else { // 다른 모든 경우에는 == 세로크기가 가로 크기가 큰 경우 
				count5++; // 일반적인 세로형 직사각형 변수 1 증가 
			}
		}
		input.close();
		
		System.out.println("정사각형의 개수는 "+ count1 + " 입니다.");
		System.out.println("좌우로 길쭉한 직사각형의 개수는 "+ count2 + " 입니다.");
		System.out.println("위아래로 길쭉한 직사각형의 개수는 "+ count3 + " 입니다.");
		System.out.println("일반적인 가로형 직사각형의 개수는 "+ count4 + " 입니다.");
		System.out.println("일반적인 세로형 직사각형의 개수는 "+ count5 + " 입니다.");
	}
}
