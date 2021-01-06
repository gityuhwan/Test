import java.util.LinkedList;

public class LinkedListTest {

	public LinkedListTest() {
		//List,
		//Queue : 객체를 한쪽에서 추가 다른쪽에서 제거
		//Deque :
		// 객체를 get()하면 컬렉션에서 객체가 지워진다.
		
		//데이터 추가
		LinkedList<String> ll = new LinkedList<String>();
		ll.offer("홍홍");
		ll.offer("세종대앙");
		ll.offer("이술신");
		ll.offer("정희킴");
		ll.offerFirst("Hong");
		ll.push("홍홍홍홍");
		
		System.out.println(ll.toArray().toString());
		
		
		//제일 마지막 객체를 pop
		System.out.println(ll.pollLast());
		System.out.println(ll.get(1)); //객체안지워짐
//		System.out.println(ll.getLast());
		
		while(!ll.isEmpty()) { //컬렉션 비어있는지 확인후 true false
			System.out.println(ll.pop());
			System.out.println("size() ->" + ll.size());
		}
		
		//객체수
		
	}

	public static void main(String[] args) {
		new LinkedListTest();
	}

}
