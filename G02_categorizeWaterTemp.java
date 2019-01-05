package WorkBook;
/*
 * 물의 온도를 10회 입력받은 후, 이 물이 각각 어느 정도의 온수인지 판정하여 그 결과를 출력하라. 
 * 출력할 내용은 입력된 10개의 온도 값, 냉수 입력 횟수, 미온수 입력 횟수, 온수 입력 횟수, 끓는 물 입력 횟수를 각각 출력하라.
 * 단, 온수의 판정 구간은 다음과 같이 판정한다.
 * 음수 값 (0미만) : 잘못입력 
 * 0도 ~ 25도 미만 : 냉수 
 * 25도 ~ 40도 미만 : 미온수 
 * 40도 ~ 80도 미만 : 온수 
 * 80도 이상 : 끓는 물
 * 
 * 2019.01.04 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class G02_categorizeWaterTemp {
	public static void main (String[] args) {
		double input_degree;
		double degree[] = new double[10];
		String degree_name[] = {"냉수", "미온수", "온수", "끓는 물"};	// 물 종류 
		int count[] = {0, 0, 0, 0};	// 각 종류별 횟수 기록 
		int i;
		Scanner s1 = new Scanner(System.in);
		
		for (i=0 ; i<10 ; i++) {
			System.out.print(i+1 + "번 물의 온도를 입력하세요: ");
			input_degree = s1.nextDouble();
			
			degree[i] = input_degree;
		}
		
		for (i=0 ; i<10 ; i++) {
			if (degree[i]<0){
				System.out.println("잘못된 입력입니다.");
				System.exit(0);
			}
			else if(degree[i] < 25) {
				System.out.println(i+1 + "번 물의 온도는 "+ degree[i] + "입니다. " + degree_name[0]);
				count[0]++;
			}
			else if (degree[i] < 40) {
				System.out.println(i+1 + "번 물의 온도는 "+ degree[i] + "입니다. " + degree_name[1]);
				count[1]++;
			}
			else if (degree[i] < 80) {
				System.out.println(i+1 + "번 물의 온도는 "+ degree[i] + "입니다. " + degree_name[2]);
				count[2]++;
			}
			else{
				System.out.println(i+1 + "번 물의 온도는 "+ degree[i] + "입니다. " + degree_name[3]);
				count[3]++;
			}
		}
		
		s1.close();
		
		System.out.println("냉수 입력 횟수: " + count[0]);
		System.out.println("미온수 입력 횟수: " + count[1]);
		System.out.println("온수 입력 횟수: " + count[2]);
		System.out.println("끓는 물 입력 횟수: " + count[3]);
	}
}
