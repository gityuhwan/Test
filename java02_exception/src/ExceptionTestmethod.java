
public class ExceptionTestmethod {

	public ExceptionTestmethod() throws ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException {
		
		method1();
	}
	
	
	
		
	public void method1() throws ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException
	{
		int a = 100, b = 10;
		int c = a/b;
		System.out.println("c = " + c);// 런타임 에러 발생
		method2();
		
	}
	
	public void method2()  throws NumberFormatException, ArrayIndexOutOfBoundsException{
		String numStr = "12";
		int num = Integer.parseInt(numStr);	// NumberFormatException
		System.out.println("num = " + num);	
		method3();
	}
	public void method3() throws ArrayIndexOutOfBoundsException{
		int num[] = {10,20,30};
		System.out.println(num[num.length]);
		
	}
	
	
	public static void main(String[] args){
		try {
		new ExceptionTestmethod();
		}catch(ArithmeticException ae) {
			System.out.println("0으로 못나눔");
		}catch(NumberFormatException nf) {
			System.out.println("문자 숫자로 변경 불가");
		}catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("배열 첨자값 오류");
			aie.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}
	

}
