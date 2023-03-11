import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine()," "); // 문자열 분리 및 입력받기
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        } // String을 int형으로 변환 후 더해준 값을 BufferdWriter로 출력

        br.close();
        bw.flush(); // 버퍼 비우기
        bw.close(); // 버퍼 닫기
    }
}