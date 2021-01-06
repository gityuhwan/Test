import java.util.Arrays;

public class ArraysTest {
	
	
	
	public ArraysTest() {
		
			int data[] = {58,62,4,95,31,75,15, 11, 22, 33, 44 ,55};
			//배열객체의 데이터를 크기순으로 정렬
//			Arrays.sort(data);//오름차순으로 정렬
//			Arrays.sort(data, Collections.reverseOrder());//내림차순으로 정렬
			Arrays.sort(data,1 ,5);//오름차순으로 정렬
			

			
			System.out.println("정렬후 "+ Arrays.toString(data));
			
			int[] data2 = Arrays.copyOfRange(data, 1, 5);
			
			System.out.println("복사후 "+ Arrays.toString(data2));
			
			int[] data3 = Arrays.copyOf(data, 5);
			System.out.println("copy -> " + Arrays.toString(data3));
			//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
			int[] data4 = new int[20];
			// data 배열의 index 5부터 6개를 data4의 index 3에서 시작하도록 복사
			System.arraycopy(data, 5, data4, 3, 6);
			System.out.println("copy -> " + Arrays.toString(data4));
			
	}

	public static void main(String[] args) {
			new ArraysTest();
	}

}
