class parents{
	int num = 3;
	public parents() {
		
	}
	public void sum() {
		
	}
}

public class child extends parents{
	String name = "나다";
	public child() {
	
	}
	
	public void div() {
		
	}
	
	public static void main(String[] args) {
		parents a = new child();
		
		child b = new child();

		a = b;
		
//		b = (child) a;

		parents c = new child();
		
//		child d = new parents();
		
//		Object e = new Object();
		
//		a = (parents) b; //parents 생략가능
		b = (child) a;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
