package Week2;
import java.util.Arrays;



//�ִ밪 �̾Ƴ��� �޼ҵ� �߰�!�ʿ�
public class Day8_1 {
	
	public static void main(String[] args) {
		
	 
     int[] cookie = {1,1,2,3};
     System.out.println(Arrays.toString(cookie));
     int N = cookie.length;
     
     solution(cookie,N); 
	int a = solution(cookie, N);
	System.out.println(a);

	
	}
	
	 public static int solution(int[] cookie,int size) {
		 int answer = 0;
		 //l���� m����, m+1���� r����
		 //�׶��� �迭���� ���Ұ��� ���� ���� ���ƾ���
		 //m�� �迭���� ����ؼ� -1�� ���� ����,
		 //m+1�� �迭���� ����ؼ� +1�� ������ ����
		 int m = 1;
		 int maxSum =0;
		 
		 for(m=0; m<size-1;m++) {
			 int sum1 = 0;
			 int sum2 = 0;
			 for(int i=0;m-i>=0;i++) {
				 sum1 +=cookie[m-i];
				 for(int k=1; m+k<size; k++) {
					 sum2+=cookie[m+k];
					 	if(sum1==sum2)
					 		maxSum =sum1;
					 		
				 }
				 
			 }	 
		 }
	        
	        
	        
		 return maxSum;
	        
	       
	        
	  }	 
	 

	 
	 
 }

