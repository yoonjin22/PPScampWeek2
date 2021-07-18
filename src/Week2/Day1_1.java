package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Day1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //키보드로 N입력받는다
		ArrayList <Integer> arr = new ArrayList(N); //배열 생성
		for(int i=0; i<N; i++) {
			arr.add(i, i+1);
		}
		
		make(arr);
		System.out.println(make(arr));
		//method만들기
		//맨앞에 있는 값 버리기 & 맨앞값이랑 맨 뒷값 교환
		
	}
	static int make(ArrayList Arr) { //하나 남아있는 값을 리턴해주는 함수

	 
		while(Arr.get(0)!=null) {
			Arr.remove(0); //맨앞원소 삭제
			int s = Arr.size();//배열리스트 저장
			int last = (int) Arr.get(s-1);
			Arr.set(s-1, Arr.get(0));//끝자리에 첫번째원소
			Arr.add(0,last);//맨앞에 끝자리에 있던거추가
			
			if(Arr.get(0)==null)
				break;
		}
			return (int) Arr.get(0);
	}
}
