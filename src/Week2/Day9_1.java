package Week2;
//전위 순회한 결과가 주어지면 후위순회한 결과 출력하는 자바 프로그램 만들기

import java.io.IOException;
import java.util.Scanner;


//bst트리

public class Day9_1 {
	static int arr[] = new int[10001];
	public static void main(String[] args) throws NumberFormatException,IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N으로 정수값을 입력받는다
		Node root = new Node(N); //root node를 생성, 스캐너로 입력받은 N집어넣음
		//N의 값을 root node에 집어넣는다
		while(sc.hasNext()) { //스캐너 객체로 데이터가 들어왔는지 여부를 반환하는 함수
			try {
				N = sc.nextInt();
				root = insertNode(root,N);//N의값을 삽입
				} catch(Exception e) {
					break;
				}
			
		}
		postOrder(root);
	}
	
	public static class Node{ //노드 클래스 생성
		Node left;
		Node right;
		int val;
		public Node(int v) {
			this.val = v;
		}
	}
	
	public static Node insertNode(Node node, int N) {
		Node current = null;
		if(node ==null) {//이전 노드 비어있다면 그냥 노드 N으로 시작?
			return new Node(N);
		}
		
		if(node.val > N) {//이전 노드가 N값보다 크다면
			current = insertNode(node.left, N);//이전노드의 왼쪽에 삽입
			node.left = current;
			
		}else {//입력된 N값이 이전 노드의 값보다 크다면 이전 노드의 오른쪽에 N을 삽입
			current = insertNode(node.right, N);
			node.right = current;
		}
		return node;
		
	}
	
	//이해가 좀더 필요한 메소드
	public static void postOrder(Node node) { //노드의 삽입이 다 끝나면 이제 후위 선회하는 메소드 실행이 됨
		if(node!=null) {//노드가 안비어있으면
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.val);
			
		}
	}
}
	

