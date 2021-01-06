
public class MyException extends Exception {

	
	//매개변수가 없으니까 생성자에서 super로 Exception(String message) 호출
	public MyException() {
		super("1~10까지의 값만 유효한 값이다");
	}
	
	//매개변수의 값이 예외 메세지로 설정
	public MyException(String message) {
		super(message);
	}

	

}
