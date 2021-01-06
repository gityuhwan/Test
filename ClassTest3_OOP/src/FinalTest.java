//클래스에 final붙이면
//상속불가
public class FinalTest {
	// 한번 값이 설정되면 수정할 수 없다.
	// 상속가능
	final int STATUS;
	public FinalTest() {
		STATUS = 2;
	}
	// 하위클래스에서 total()은 오버라이딩 할 수 없느 메소드가 되었다.
	// 상속가능
	public final void total() {
		int i = 0;
		for(int j = 1; j <= 100; j+=2) {
			i += j;
			
		}
		System.out.println("1~100 홀수합 : " + i + "!!!");
	}
}
