import java.util.Scanner;

public class MyExceptionTest {
	Scanner scan = new Scanner(System.in);
	public MyExceptionTest() {
		
		try {
			System.out.print("1~10까지의 정수 입력 = ");
			int data = scan.nextInt(); // InputMismatchException
			if(data<1 || data > 10) {
				// throw : 강제 예외발생
//				throw new MyException();
				throw new MyException("범위 이외의값 에러발생!!");
			}else {
				sum(data);
			}
		}catch(MyException e) {
			e.printStackTrace();
		}
			
	}
	public void sum(int m) {//메소드 빼서 작업 == 객체
		int s = 0;
		for(int i = 0; i <= m ; i++) {
			s += i;
		}
		System.out.println("s-> " +  s);
	}
	public void start() {
		
	}
	public static void main(String[] args) {
		new MyExceptionTest();
	}
	
}
