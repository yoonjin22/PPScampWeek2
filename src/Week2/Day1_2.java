package Week2;

import java.util.ArrayList;
import java.util.Scanner;

//�似Ǫ�� ����
//1������ N������ N���� ����� ���� �̷�鼭 �ɾ��ְ�,���� ������� K��° ����� ����
//������ ������� ���ŵǴ� ������ (N, K)-�似Ǫ�� ����
public class Day1_2 {
	public static void main(String[] args) {
		int N ;
		Scanner sc= new Scanner(System.in);
		//1. N�� K�� �Է¹޴´�
		N = sc.nextInt();
		int K = sc.nextInt();
	
		ArrayList<Integer> list = new ArrayList<>(N);
		//2. �迭 ����, 1���� N������ ���� add��
		for(int i=0; i<N; i++) {
			list.add(i+1);
		}
		
		ArrayList<Integer> removeArr = new ArrayList<>(); //�����Ѱ� ���� �迭����Ʈ ����
		
		
		//3. ť/���ø� ��� �Ǿպ��� �������� ����Ʈ�� �ڿ��� ���� �ٽó��� k��°�� ���� ������ �ϵ���
		while(true) {
		for(int i=0; i<K-1; i++) {
			int num = list.get(0);
			list.remove(0);
			list.add(num);	 
		}
		removeArr.add(list.get(0));
		list.remove(0);
		System.out.println(removeArr);
		}
		

		//4. k��° ������ ���� ����Ʈ�� ����ֱ�
		//5. ���� 3�� �ൿ �ݺ�
		//6. ������ ������ �� (�ռ� ��Ƴ��� ����Ʈ �����س���) ����Ʈ�� �ִ´�. 
	}
}
