class Test{
	public static void go(Long n) {
		System.out.println("Long");
	}
	public static void go(int n) {
		System.out.println("int");
	}
	public static void go(Short n) {
		System.out.println("Short");
	}
}


public class TestMain extends Test{

	
	public static void main(String[] args) {
		short y = 6;
		long z = 7;
		
		go(y);
		go(z);
		
	}

}
