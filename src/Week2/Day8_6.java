package Week2;

//�� ��ġ ã�� �Ǵ� �̹̰��� �����ϴ� ��� �ε��� ��ȯ
public class Day8_6 {
	
	public static void main(String[] args) {
	
		
	int[] nums = {1};
	int target = 0; //�̤Ӱ�츦 �����Ѵ� �ڵ� �ۼ��ϱ�
	
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
        //insert��ġ ��ȯ�ϱ�

        return nums.length;
		
		
		
    }

}
