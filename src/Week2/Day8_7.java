package Week2;

import java.util.Arrays;
import java.util.Scanner;

//N���� ���� A[1], A[2], ��, A[N]�� �־��� ���� ��, �� �ȿ� X��� ������ �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
public class Day8_7 {
	public static void main(String[] args) {
		String a;
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextLine();
		String[] array = a.split(" ");
		 int[] nums = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();
		 int target =scanner.nextInt();
		 int n=check(nums, target);
		 
		 System.out.println(n);
	}
	
	static int check(int[] nums, int target) {
		
	 for(int i=0; i<nums.length; i++) {
		 if(nums[i]==target) {
			 return 1;
		 }
	 }
	 return 0;
		
	}
}
