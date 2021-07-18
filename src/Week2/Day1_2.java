package Week2;

import java.util.ArrayList;
import java.util.Scanner;

//요세푸스 순열
//1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고,이제 순서대로 K번째 사람을 제거
//원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열
public class Day1_2 {
	public static void main(String[] args) {
		int N ;
		Scanner sc= new Scanner(System.in);
		//1. N과 K를 입력받는다
		N = sc.nextInt();
		int K = sc.nextInt();
	
		ArrayList<Integer> list = new ArrayList<>(N);
		//2. 배열 생성, 1부터 N까지의 값을 add함
		for(int i=0; i<N; i++) {
			list.add(i+1);
		}
		
		ArrayList<Integer> removeArr = new ArrayList<>(); //삭제한값 넣을 배열리스트 생성
		
		
		//3. 큐/스택를 사용 맨앞부터 꺼낸다음 리스트에 뒤에서 부터 다시넣음 k번째의 값만 삭제를 하도록
		while(true) {
		for(int i=0; i<K-1; i++) {
			int num = list.get(0);
			list.remove(0);
			list.add(num);	 
		}
		removeArr.add(list.get(0));
		list.remove(0);
		System.out.println(removeArr);
		}
		

		//4. k번째 삭제한 값을 리스트에 집어넣기
		//5. 위의 3번 행동 반복
		//6. 삭제한 값들을 다 (앞서 모아놓을 리스트 생성해놓기) 리스트에 넣는다. 
	}
}
