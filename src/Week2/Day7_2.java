package Week2;

import java.util.Arrays;
import java.util.Scanner;



public class Day7_2 {
//숫자를 읽었을때 사전순 정렬
	static String[] english = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
       
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt(); //M부터 시작하는 정수
		int N = scanner.nextInt();//N까지의 정수
		
		char[] temp = new char[2];
		int size = N-M+1;
		int[]arr = new int [size];
		String strTemp="";
		
		for(int i=0; i<N-M+1; i++) {
			arr[i] = i+M; //배열에 숫자 넣기
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		Change(arr);
		System.out.println(Arrays.toString(Change(arr)));
	}
	//숫자를 영어로 전환시켜주는 메소드
	public static String[] Change(int[] arr) {
		int size = arr.length;
		String[] chArr=new String[size];
		
	
		
		return chArr;
	}
	
	//영어로 전환한 배열을 사전순으로 정렬하는 메소드
//	public String[] goArr(String[] arr) {
//		
//		
//		
//	}
//	
	 
}
