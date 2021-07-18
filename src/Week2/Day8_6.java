package Week2;

//들어갈 위치 찾기 또는 이미값이 존재하는 경우 인덱스 반환
public class Day8_6 {
	
	public static void main(String[] args) {
	
		
	int[] nums = {1};
	int target = 0; //이ㅣ경우를 만족한느 코드 작성하기
	
	int n = searchInsert(nums, target);
	
	System.out.println(n);
		
	}
	
	public static int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++) {
        	if(nums[i]==target) {
        		return i;
        	}
        	else if((nums[i+1]<target) && (nums[i]>target)) {
        		return i;
        	}
        	else if(target<nums[i]) {
        		return 0;
        	}
        	
        	
        }
        //insert위치 반환하기

        return nums.length;
		
		
		
    }

}
