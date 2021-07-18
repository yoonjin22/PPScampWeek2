package Week2;

public class Day10_5 {
	 public String solution(int a, int b) {
         String answer = "";
         
         String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
         String[] year = new String[366];
         int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
         int want_day = 0;
         
         //1�� 1���� �ݿ����̱⿡ (i+5)�� �Ͽ� �ݿ����� �������� �������.
         for(int i=0; i<year.length; i++) {
             year[i] =  day[(i+5)%7];
         }
         
         for(int i=0; i<a-1; i++) {
             want_day += month[i]; 
         }
         
         //1�� 1�ϵ� �Ϸ� ���� ������ �Ǿ -1�� �ؾ��Ѵ�!
         want_day += b-1;
         
         answer = year[want_day];
         
         return answer;
     }
}
