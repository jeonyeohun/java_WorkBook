package WorkBook;
import java.util.Scanner;

// 태어난 년도를 입력받아 나이를 계산한 후, 미성년자인지 여부를 판정하여 그 결과를 출력하라.
// 단, 나이 = 2018 – 태어난 년도 + 1 로 계산하고 나이가 20세 미만인 경우, 미성년자로 판정한다.
// 2018.12.26 Jeon, Yeo Hun

public class B01_CheckUnderAge {
	public static void main (String[] args) {
		int birth_year;
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요: ");
		birth_year = input.nextInt();
		input.close();
		
		age = 2018 - birth_year +1;
		
		//조건문 사용.
		if(age>=20) {
			System.out.println("미성년자가 아닙니다.");
		}
		else {
			System.out.println("미성년자입니다.");
		}
	}
}
