package Week2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Day6_3 {
//N���� ���� �־�����
	//�ι�° �ٿ��� N���� ���� �Է�
	//�ߺ��Ȱ� �����ϰ� ���������� ���ʷ� ���� (�������� ����_ & ����Ѵ�)
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt(); //N���� ���� �Է��� ���ε�, N �Է¹ޱ�
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); //�迭����Ʈ ����
		
		arr.add(sc.nextInt()); //ù��° �� �־��ֱ�
		
		for (int i = 0; i < N-1; i++) { //N���� �迭 ����߿� 1���� �̹� �Է¹޾����Ƿ�! N-1�� �Է¹޴´�
			int num = sc.nextInt();//�Է¹��� ���� �� num
			
			for (int j = 0; j < arr.size(); j++) {//num�� ���� ���� �߰��� ������ �ƴϸ� �׳� �ѱ������ �����ϴ� for��
				if (arr.get(j)==num) {//�迭�� �̹� num���� ������ for�� Ż�� �Ͽ� ���ο� num�� �Է¹ޱ�
					break;
				}
				if (j==arr.size()-1) {//�ش�Ǵ°� ��� �迭�� �������� �°�� num ���� �迭�� �߰��Ѵ�!
					arr.add(num);
					break;
				}
			}
		}
		
		arr.sort(Comparator.naturalOrder()); //�迭�� ������������ �����Ѵ�
		for (Integer integer : arr) { //arr�迭 integer���ʺ��� ���ʷ� �ϸ�
			System.out.print(integer+" ");//�� integer���� ����ϸ�
		}
		
	}
}
