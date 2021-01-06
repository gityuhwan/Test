
public class AnomTest {

	public AnomTest() {
		start();
	}
	public void start() {
		//익명의 내부클래스 ex) 프로그램의 종료 버튼 등 AnomTest$1.Class 형식으로 저장
		new Sample() {
			//실행부
			public void oddSum(int max) {//Sample 클래스의 oddSum메소드 오버라이딩
				int s = 0;
				for(int i = 1; i <= max ; i+=2) {
					s = s + i;
				}
				System.out.println("1~ max 까지 홀수의 합 = " + s);
			}
		}
		.oddSum(100);
		
	}

	public static void main(String[] args) {
		new AnomTest();
		
	}

}
