package Week2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Day6_3 {
//N개의 숫자 주어지고
	//두번째 줄에는 N개의 숫자 입력
	//중복된거 제외하고 작은수부터 차례로 정렬 (오름차순 정렬_ & 출력한다)
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt(); //N개의 숫자 입력할 것인데, N 입력받기
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); //배열리스트 선언
		
		arr.add(sc.nextInt()); //첫번째 값 넣어주기
		
		for (int i = 0; i < N-1; i++) { //N개의 배열 멤버중에 1개를 이미 입력받았으므로! N-1개 입력받는다
			int num = sc.nextInt();//입력받을 정수 값 num
			
			for (int j = 0; j < arr.size(); j++) {//num의 값을 이제 추가할 것인지 아니면 그냥 넘길것인지 결정하는 for문
				if (arr.get(j)==num) {//배열에 이미 num값이 있으면 for문 탈출 하여 새로운 num값 입력받기
					break;
				}
				if (j==arr.size()-1) {//해당되는게 없어서 배열의 끝값까지 온경우 num 값을 배열에 추가한다!
					arr.add(num);
					break;
				}
			}
		}
		
		arr.sort(Comparator.naturalOrder()); //배열을 오름차순으로 정렬한다
		for (Integer integer : arr) { //arr배열 integer앞쪽부터 차례로 하면
			System.out.print(integer+" ");//그 integer값을 출력하면
		}
		
	}
}
