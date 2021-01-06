
public class FinalMain extends FinalTest {

	public FinalMain() {
	}
	public void start() {
		
//		STATUS = 3;
		System.out.println("STATUS = "  + STATUS );
		total();
//		super.total();
		totalEven(100);
	}
	public void totalEven(final int k) {
		//k = 100; 매개변수안 final 변수가능, 값을 변경할수 없다.
		System.out.println(k);
		System.out.println("1~100 짝수 합 2550");
	}

	public static void main(String[] args) {
		FinalMain a =new FinalMain();
		a.start();
		

	}

}
