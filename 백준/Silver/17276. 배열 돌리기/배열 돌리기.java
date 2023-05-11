import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트케이스 개수
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // n x n 배열의 크기
            int d = Integer.parseInt(st.nextToken()); // 회전
            if (d < 0) // 음수일 때 + 360 하면 시계방향 회전과 같아짐
                d += 360;
            int[][] arr = new int[n][n]; // 회전한 결과를 담을 배열
            int[][] save = new int[n][n]; // 임시로 arr[][]의 요소를 저장해둘 배열
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < n; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                    save[j][k] = arr[j][k];
                }
            }
            while (d >= 45) {
                for (int j = 0; j < n; j++) {
                    save[j][n / 2] = arr[j][j];
                    save[j][j] = arr[n / 2][j];
                    save[n / 2][j] = arr[n - j - 1][j];
                    save[n - j - 1][j] = arr[n - j - 1][n / 2];
                }
                for (int j = 0; j < n; j++) {
                    System.arraycopy(save[j], 0, arr[j], 0, n); // save[][]를 arr[][]에 복사
                }
                d -= 45; // 45도 회전했으니 빼주기
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[j][k] + " ");
                }
                System.out.print("\n");
            }
        }
    }
}