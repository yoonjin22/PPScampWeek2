package Week2;

import java.util.Arrays;
import java.util.Scanner;



public class Day7_2 {
//���ڸ� �о����� ������ ����
	static String[] english = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
       
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt(); //M���� �����ϴ� ����
		int N = scanner.nextInt();//N������ ����
		
		char[] temp = new char[2];
		int size = N-M+1;
		int[]arr = new int [size];
		String strTemp="";
		
		for(int i=0; i<N-M+1; i++) {
			arr[i] = i+M; //�迭�� ���� �ֱ�
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		Change(arr);
		System.out.println(Arrays.toString(Change(arr)));
	}
	//���ڸ� ����� ��ȯ�����ִ� �޼ҵ�
	public static String[] Change(int[] arr) {
		int size = arr.length;
		String[] chArr=new String[size];
		
	
		
		return chArr;
	}
	
	//����� ��ȯ�� �迭�� ���������� �����ϴ� �޼ҵ�
//	public String[] goArr(String[] arr) {
//		
//		
//		
//	}
//	
	 
}
