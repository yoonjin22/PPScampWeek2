package Week2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Day7_1 {//���̤Ӽ� ����
	
	   public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in); //��ĳ�� ���� ����
			  
			  int N = sc.nextInt(); //�Է¹��� �л� �� �Է�
			  
			  String[][] arr = new String[N][2]; // ���� N���̰� ���� 2���� 2���� String�迭 ����
			  
			  
			  for(int i = 0; i<N; i++) {//N�� ��ŭ�� ����-�̸� �迭��� �Է¹ޱ�
				  arr[i][0] = sc.next(); //����
				  arr[i][1] = sc.next(); //�̸�
			  }
			
			  
			  Arrays.sort(arr,new Comparator<String[]>() { //�Է¹��� arr������ �����ϱ� (��������)

				@Override
				public int compare(String[] o1, String[] o2) {
					// TODO Auto-generated method stub
					return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
				}
				  
				  
			  });
			
			  for(int i = 0; i<N; i++) {
					System.out.println(arr[i][0]+" "+arr[i][1]); //���ĵ� arr ����ϱ�
				  }
			  
		   }
}
