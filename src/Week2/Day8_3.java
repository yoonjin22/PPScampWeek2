package Week2;

import java.util.ArrayList;

/*
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
 */
public class Day8_3 {
	
	public static void main(String[] args) {
		
		int[] input = {1,2,3,4,5};
		
		
		Return(input);
	}
	//ArrayList<Integer> arr = new ArrayList<Integer>(); //�迭����Ʈ ����
	static ArrayList<Integer> Return(int[] ary) {
		int n = ary.length;
		ArrayList<Integer> list = new ArrayList<Integer>(n); //output ���� arraylist ����.
	
		for(int i=n-1;i>=0;i--) {
			int get = ary[i];
			list.add(get);
			
		
		}
		System.out.println(list);
		return list;
		
	}
	
	
}
