package Week2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day8_2 {
//K 개 과목을 골랐을 때 정우가 받을 수 있는 "최대 합계 점수"를 구하는 프로그램을 작성
	//N개 과목 시험 진행 
	//그중 k개만 골라서 시험보는거 가능
	//
	static int Answer;

    public static void main(String args[]) throws Exception	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int test_case = 0; test_case < T; test_case++) {
            Answer = 0;

            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int score[] = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                score[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(score);

            for (int i = 0; i < K; i++) {
                Answer += score[N - i - 1];
            }
            System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
        }
    }
}
