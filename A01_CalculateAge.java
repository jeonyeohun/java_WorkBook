package WorkBook;
import java.util.Scanner;

// 태어난 년도를 입력받은 후, 이 값을 이용하여 나이를 계산하고 출력하라
// 단, 나이 = 2018 - 태어난 년도 + 1 로 계산한다.
// 2018.12.24 전여훈 

public class A01_CalculateAge {
	public static void main(String[] args) {
		int age;
		
		Scanner input = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하시오: ");
		int birth_year = input.nextInt();
		
		age = 2018 - birth_year + 1;
		
		System.out.println("당신의 나이는 "+ age + "살 입니다.");
		input.close();
	}	
}
