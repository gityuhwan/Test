import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	Scanner scan = new Scanner(System.in);
	
	Random ran = new Random();
	
	public Lotto() {
		
	}

	public void start() {
		
		do {
			System.out.println("게임수=");
			int game = scan.nextInt();
			//입력받은 게임수 만큼 로또 번호 처리
			for(int cnt =1 ; cnt <= game; cnt++) {
				System.out.print(cnt + "게임 [ ");
				
				//1게임을 저장할 배열생성
				int lotto[] = new int[7];
					//난수만들기
					for(int i = 0 ; i<lotto.length; i++) {
					lotto[i] = ran.nextInt(45)+1;// 1 ~ 45
					//중복검사
					for(int check = 0; check<i; check++) {
						if(lotto[check] == lotto[i]) {
							i--;
						}
					}
				}
				
				//5번 반복 정렬
				for(int j = 0 ; j < lotto.length-2 ; j++) {
					for(int i = 0; i < lotto.length-2-j ; i++) {//회전수 빠르게
							if(lotto[i]>lotto[i+1]) {
								int temp = lotto[i]; //교환
								lotto[i] = lotto[i+1];
								lotto[i+1] = temp;
							}
					}
				}
//				System.out.println("----->" + Arrays.toString(lotto));
				//출력
				for(int i = 0; i < lotto.length-1 ; i ++) {
					System.out.print(lotto[i]);
					if(i==5) {
						System.out.print(" ], ");
					}else {
						System.out.print(", ");
					}
				
				}
				//보너스
				System.out.println("bonus = " + lotto[lotto.length -1]);
			}
			//계속 여부 확인
				System.out.println("계속하시겠습니까 (1,2)");
				int que = scan.nextInt();
				if(que == 2) break;//반복문 중지
				
			}while(true);
		System.out.println("프로그램이 종료되었습니다");
		
	}
	
	public static void main(String[] args) {
		new Lotto().start();
		
		
	}

}
