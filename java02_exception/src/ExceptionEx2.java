import java.util.Scanner;

public class ExceptionEx2 {
	Scanner scan = new Scanner(System.in);

	public ExceptionEx2() {
		
	}
	public void start() {
		
		try {
		System.out.println("첫번째 수 -> " );
		//콘솔의 문자열 1줄을 입력받는다.
		 int num1 = Integer.parseInt(scan.nextLine()); //--!! NumberFormatException
		 
		System.out.println("두번째 수 -> " );
		int num2 = Integer.parseInt(scan.nextLine());
//		int num2 = scan.nextInt();
		
		int result = num1*num2;
		int result2 = num1/num2; // 0으로 나누기	ArithmeticException
		
		System.out.println(num1 + "*" + num2 + " = " + result);
		System.out.printf("%d/%d=%d\n",num1,num2,result2);
	
		String[] names = { "세종대앙", "이순신" };
		for(int i = 0 ; i <=names.length ; i++) { // 배열길이를 넘어가는 인덱스 외 출력안됨 ArrayIndexOutOfBoundsException
			System.out.println("names["+i+"] =" + names[i]);
		}
		
		}
		catch(ArrayIndexOutOfBoundsException aoe) {
				System.out.println("배열에서 예외 발생");
		}
		catch(Exception e) { //하위클래스에있는 Exception 이 마지막으로
			System.out.println("0을제외한 정수입력" + e.getStackTrace());
		}
		
		
	}
	public static void main(String[] args) {
		new ExceptionEx2().start();
		
	}

}
