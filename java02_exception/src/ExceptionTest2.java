
public class ExceptionTest2 {

	public ExceptionTest2() {
		try {
			
			int data[] = {10,8,95,32,54 };
			System.out.println(data[data.length]);
						
			//실행부
		}
//		catch(ArrayIndexOutOfBoundsException ae){
//			System.out.println("인덱스 잘못사용 = " + ae.getMessage());
//		}
		catch(Exception e){
			System.out.println("인덱스 잘못사용 = " + e.getMessage());
		}
		finally {
			System.out.println("finally 무조건 한번은 실행 됨");
		}
	}

	public static void main(String[] args) {
		
		new ExceptionTest2();
		
	}

}
