package Week2;
//���� ��ȸ�� ����� �־����� ������ȸ�� ��� ����ϴ� �ڹ� ���α׷� �����

import java.io.IOException;
import java.util.Scanner;


//bstƮ��

public class Day9_1 {
	static int arr[] = new int[10001];
	public static void main(String[] args) throws NumberFormatException,IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N���� �������� �Է¹޴´�
		Node root = new Node(N); //root node�� ����, ��ĳ�ʷ� �Է¹��� N�������
		//N�� ���� root node�� ����ִ´�
		while(sc.hasNext()) { //��ĳ�� ��ü�� �����Ͱ� ���Դ��� ���θ� ��ȯ�ϴ� �Լ�
			try {
				N = sc.nextInt();
				root = insertNode(root,N);//N�ǰ��� ����
				} catch(Exception e) {
					break;
				}
			
		}
		postOrder(root);
	}
	
	public static class Node{ //��� Ŭ���� ����
		Node left;
		Node right;
		int val;
		public Node(int v) {
			this.val = v;
		}
	}
	
	public static Node insertNode(Node node, int N) {
		Node current = null;
		if(node ==null) {//���� ��� ����ִٸ� �׳� ��� N���� ����?
			return new Node(N);
		}
		
		if(node.val > N) {//���� ��尡 N������ ũ�ٸ�
			current = insertNode(node.left, N);//��������� ���ʿ� ����
			node.left = current;
			
		}else {//�Էµ� N���� ���� ����� ������ ũ�ٸ� ���� ����� �����ʿ� N�� ����
			current = insertNode(node.right, N);
			node.right = current;
		}
		return node;
		
	}
	
	//���ذ� ���� �ʿ��� �޼ҵ�
	public static void postOrder(Node node) { //����� ������ �� ������ ���� ���� ��ȸ�ϴ� �޼ҵ� ������ ��
		if(node!=null) {//��尡 �Ⱥ��������
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.val);
			
		}
	}
}
	

