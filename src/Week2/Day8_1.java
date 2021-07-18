package Week2;
import java.util.Arrays;



//최대값 뽑아내는 메소드 추가!필요
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
		 //l에서 m까지, m+1에서 r까지
		 //그때의 배열안의 원소값의 합이 서로 같아야함
		 //m번 배열에서 출발해서 -1씩 왼쪽 방향,
		 //m+1번 배열에서 출발해서 +1씩 오른쪽 방향
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

