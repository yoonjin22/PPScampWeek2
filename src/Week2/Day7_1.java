package Week2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Day7_1 {//나이ㅣ순 정렬
	
	   public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in); //스캐너 변수 생성
			  
			  int N = sc.nextInt(); //입력받을 학생 수 입력
			  
			  String[][] arr = new String[N][2]; // 행이 N개이고 열이 2개인 2차원 String배열 생성
			  
			  
			  for(int i = 0; i<N; i++) {//N개 만큼의 나이-이름 배열멤버 입력받기
				  arr[i][0] = sc.next(); //나이
				  arr[i][1] = sc.next(); //이름
			  }
			
			  
			  Arrays.sort(arr,new Comparator<String[]>() { //입력받은 arr가지고 정렬하기 (오름차순)

				@Override
				public int compare(String[] o1, String[] o2) {
					// TODO Auto-generated method stub
					return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
				}
				  
				  
			  });
			
			  for(int i = 0; i<N; i++) {
					System.out.println(arr[i][0]+" "+arr[i][1]); //정렬된 arr 출력하기
				  }
			  
		   }
}
