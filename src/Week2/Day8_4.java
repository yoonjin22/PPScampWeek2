package Week2;

import java.util.ArrayList;

// 중복되는 원소 배열에서 삭제

public class Day8_4 {
	public static void main(String[] args) {
	int[] nums = {1,2,3,4,4,1}; // Input array

	int k = removeDuplicates(nums); // Calls your implementation
	System.out.println(k);
	}
	
	
	
	public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int previous = nums[0];
        int lastIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == previous)
                continue;
            nums[lastIndex + 1] = nums[i];
            previous = nums[i];
            lastIndex++;
        }
        return lastIndex + 1;
    }
}
