import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (true) {
            input = br.readLine();
            if (input.equals("end")) break;

            boolean mFlag = false; // 첫번째 조건
            boolean jmFlag = true; // 두번째 조건
            boolean eoFlag = true; // 세번째 조건
            int mCnt = 0; // 모음 개수
            int jCnt = 0; // 자음 개수

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                    mFlag = true; // 1. 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
                    mCnt++;
                    jCnt = 0;
                    if (mCnt >= 3) { // 2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
                        jmFlag = false;
                        break;
                    }
                } else {
                    jCnt++;
                    mCnt = 0;
                    if (jCnt >= 3) {
                        jmFlag = false;
                        break;
                    }
                }
                if (i >= 1) {
                    if (input.charAt(i) != 'e' && input.charAt(i) != 'o') { // 3. 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
                        if (input.charAt(i) == input.charAt(i - 1)) eoFlag = false;
                    }
                }
            }
            if (jmFlag && eoFlag && mFlag) {
                System.out.println("<" + input + "> is acceptable.");
            } else {
                System.out.println("<" + input + "> is not acceptable.");
            }
        }
    }
}