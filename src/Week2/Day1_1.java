package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Day1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //Ű����� N�Է¹޴´�
		ArrayList <Integer> arr = new ArrayList(N); //�迭 ����
		for(int i=0; i<N; i++) {
			arr.add(i, i+1);
		}
		
		make(arr);
		System.out.println(make(arr));
		//method�����
		//�Ǿտ� �ִ� �� ������ & �Ǿհ��̶� �� �ް� ��ȯ
		
	}
	static int make(ArrayList Arr) { //�ϳ� �����ִ� ���� �������ִ� �Լ�

	 
		while(Arr.get(0)!=null) {
			Arr.remove(0); //�Ǿտ��� ����
			int s = Arr.size();//�迭����Ʈ ����
			int last = (int) Arr.get(s-1);
			Arr.set(s-1, Arr.get(0));//���ڸ��� ù��°����
			Arr.add(0,last);//�Ǿտ� ���ڸ��� �ִ����߰�
			
			if(Arr.get(0)==null)
				break;
		}
			return (int) Arr.get(0);
	}
}
