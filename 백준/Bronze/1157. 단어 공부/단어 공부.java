import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            int num = word.charAt(i) - 'A'; // A를 빼주면, A부터 아스키 코드는 0이 된다!
            count[num]++;
        }
        int max = -1;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = (char)(i+'A'); // 배열의 인덱스에 A를 더해주고 문자형으로 변환하면 알파벳이 나온다!
            }
            else if (max == count[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}