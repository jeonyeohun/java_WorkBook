package WorkBook;
/*
 * 학생들의 국어, 영어, 수학 점수를 입력받아 총점과 평균을 계산하고 이 클래스를 이용하여 
 * 5명의 정보를 입력하고 출력할 수 있도록 프로그램을 완성하라.
 * 
 * 2019.01.16 Jeon, Yeo Hun;
 */

import java.util.Scanner;
class student{
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	String grade;
	
	Scanner s = new Scanner(System.in);
	
	void input() {
		System.out.print("번 학생의 국어, 영어, 수학점수를 입력허시오 --> ");
		kor = s.nextInt();
		eng = s.nextInt();
		math = s.nextInt();
		
		// 총점 및 평균 계산
		total = kor + eng + math;
		avg = Math.round((double) (total/3.0) * 10)/10.0;
		
		// 성적 판정
		if (avg <60) {
			grade = "F";
		}
		else if (avg <65) {
			grade = "D0";
		}
		else if (avg <70) {
			grade = "D+";
		}
		else if (avg <75) {
			grade = "C0";
		}
		else if (avg <80) {
			grade = "C+";
		}
		else if (avg <85) {
			grade = "B0";
		}
		else if (avg <90) {
			grade = "B+";
		}
		else if (avg <95) {
			grade = "A0";
		}
		else {
			grade = "A+";
		}
	}
	
	void print(int index) {
			System.out.println((index+1) +  "\t " + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg + "\t" + grade);
	}
}


public class K07_testResult {
	public static void main (String[] args) {
		int index;
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? ");
		index = s.nextInt();
		student[] st = new student[index];
		
		// 인스턴스 생성 및 정보 입력받기
		for(int i=0 ; i<index ; i++) {
			st[i] = new student();
			System.out.print(i+1);
			st[i].input();
		}
		
		// 출력 메뉴 구성
		System.out.println("============================================");
		System.out.println("등록된 " + index + "명의 학생 목록은 당므과 같습니다.");
		System.out.println("--------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		
		// 저장된 정보 출력
		for (int i=0 ; i<index ; i++) {
			st[i].print(i);
		}
		s.close();
	}
}
