import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n + 1][3]; // 국가번호와 메달 개수를 담을 2차원 배열 선언
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            arr[index][0] = gold;
            arr[index][1] = silver;
            arr[index][2] = bronze;
        }
        int rank = 1; // 1등으로 시작
        for (int i = 1; i < n; i++) { // 메달 비교해서 등수를 알고 싶은 국가(k) 보다 비교할 국가(i)의 메달이 더 많으면 등수 + 1
            if (arr[i][0] > arr[k][0]) {
                rank++;
            }
            else if (arr[i][0] == arr[k][0] && arr[i][1] > arr[k][1]) {
                rank++;
            }
            else if (arr[i][0] == arr[k][0] && arr[i][1] == arr[k][1] && arr[i][2] > arr[k][2]) {
                rank++;
            }
        }
        System.out.println(rank);
    }
}