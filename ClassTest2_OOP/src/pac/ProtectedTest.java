package pac;

public class ProtectedTest {
	protected String username = "세종왕";

	public ProtectedTest() {
		System.out.println("생성자실행");
	}
	
	protected void print(){
		System.out.println("username = " + username);
		}
	
	
	}


