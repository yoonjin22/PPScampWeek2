package Week2;

import java.util.Arrays;

public class Day7_3 {
//배열에서 많이 나온 원소의 값 출력하기
	//배열 만들기
	//그 배열에서 적어도 하나 나오는 원소 출력
	//그 원소가 몇번나오는지 count하기
	 public int majorityElement(int[] nums) {
	        int maxCount = 0;
	        int count = 0;
	        int element = 0;
	        
	        Arrays.sort(nums);
	        
	        if(nums.length == 1){
	            return nums[0];
	        }
	        
	        for(int i = 0 ; i < nums.length-1 ; i++){
	            if (nums[i] == nums[i+1]){
	                count++;
	                if(count >= nums.length/2){
	                    return nums[i];
	                }
	            }else{
	                if (maxCount < count){
	                    maxCount = count;
	                    count = 1;
	                    element = nums[i];
	                }
	            }
	        }
	        
	        return element;
	    }

	
	
}
