package work10;

import java.util.Arrays;
import java.util.Iterator;

public class note1 {

	public static void main(String[] args) {
		
		String stu[][] = {
				{ "김유환", "10", "10", "30" },
				{ "김춘향", "100", "100", "90" },
				{ "김길동", "90", "100", "85" },
				{ "김사또", "95", "85", "80" },
		};
		
		int sum[] = new int[stu.length];
		int i;
		for( i = 0 ; i < stu.length; i++) {
			for( int j = 1 ; j < stu[i].length; j++) {
					sum[i] = sum[i] + Integer.parseInt(stu[i][j]);
			}
		}
		
		System.out.println(Arrays.toString(sum));
		System.out.println("배열 총값");
		int min = sum[0];
		int flag = 0;
		for (int j = 0; j < sum.length; j++) {
			
			if(min > sum[j]) {
				min = sum[j];
				flag = j;
			}
		}	
		System.out.println(min);
		System.out.println("전체 꼴등 " + stu[flag][0] + " 분발하세요");
		
	}

}
