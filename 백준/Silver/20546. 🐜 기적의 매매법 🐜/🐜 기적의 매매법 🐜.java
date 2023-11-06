import java.io.*;
import java.util.*;
// 210831

public class Main {
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("src/res/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = stoi(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<14; i++) {
            arr[i] = stoi(st.nextToken());
        }

        int jCnt = 0, sCnt = 0, jLeft = N, sLeft = N;

        for(int i=0; i<14; i++) {
            // 준현이
            if (arr[i] <= jLeft) {
                int cnt = jLeft / arr[i];
                jLeft -= cnt * arr[i];
                jCnt += cnt;
            }

            // 성민이
            // 3일 연속 상승 -> 3일째 전량 매도
            if(i<3) continue;
            if(arr[i-3]<arr[i-2]&&arr[i-2]<arr[i-1]&&arr[i-1]<arr[i]&&sCnt>0) {
                sLeft += sCnt * arr[i];
                sCnt = 0;
            }

            // 3일 연속 하락 -> 3일째 전략 매수
            if(arr[i-3]>arr[i-2]&&arr[i-2]>arr[i-1]&&arr[i-1]>arr[i]&&sLeft>0) {
                int cnt = sLeft / arr[i]; // cnt주 산다.
                sLeft -= cnt * arr[i];
                sCnt += cnt;
            }
        }

        // 마지막 날 자산 가격
        jLeft += jCnt*arr[13];
        sLeft += sCnt*arr[13];

        if(jLeft < sLeft) {
            System.out.println("TIMING");
        } else if (jLeft > sLeft) {
            System.out.println("BNP");
        } else {
            System.out.println("SAMESAME");
        }

        br.close();
    }

    static int stoi(String str) {
        return Integer.parseInt(str);
    }
}