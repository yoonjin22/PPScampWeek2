package Week2;


/*
 * Given an array of integers nums which is sorted in ascending order,
 *  and an integer target, 
 * write a function to search target in nums. 
 * If target exists, then return its index. Otherwise, return -1.
 * 
 */
public class Day8_5 {
	
	public static void main(String[] args) {
	
		int num[] = {1,0,3,5,9,12};
		int target = 2;
		
		int n = search(num, target);
		System.out.println(n);
	}
	
	
	public static int search(int[] nums, int target) {
    
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		
		return -1;
	}
}
