import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public ExceptionEx() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			try {
			System.out.println("첫번째 수 -> " );
			
//			int num1 = scan.nextInt();//엔터치면 아스키코드 LF CR 실행 2byte // 숫자 아닌 데이타 InputMismatchException
			//콘솔의 문자열 1줄을 입력받는다.
			 int num1 = Integer.parseInt(scan.nextLine());
			 
			System.out.println("두번째 수 -> " );
			int num2 = Integer.parseInt(scan.nextLine());
//			int num2 = scan.nextInt();
			
			int result = num1*num2;
			int result2 = num1/num2; // 0으로 나누기	ArithmeticException
			
			System.out.println(num1 + "*" + num2 + " = " + result);
			System.out.printf("%d/%d=%d\n",num1,num2,result2);
		
			String[] names = { "세종대앙", "이순신" };
			for(int i = 0 ; i <=names.length ; i++) { // 배열길이를 넘어가는 인덱스 외 출력안됨 ArrayIndexOutOfBoundsException
				System.out.println("names["+i+"] =" + names[i]);
			}
			}
			//catch(InputMismatchException ime ) {
		//		System.out.println("숫자만 입력하세요");
			//}
			
			catch(NumberFormatException nf) {
				System.out.println("숫자만 입력하세요");
			}
			catch(ArithmeticException ae) {
				System.out.println("두번째 값은 0이외의 값을 입력");
			}
			catch(ArrayIndexOutOfBoundsException ai ) {
				System.out.println("배열의 인덱스를 잘못 사용.." + ai.getMessage());
			}
		}while(true);
	}

}
