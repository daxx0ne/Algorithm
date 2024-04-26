import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 상근: SK, 창영: CY
        // 상근이가 게임을 먼저 시작함
        // 한 턴이 돌면 무조건 짝수.. 즉 돌이 홀수면 상근이가 이기고, 짝수면 창영이가 이김
        if (n % 2 != 0) System.out.println("SK");
        else System.out.println("CY");
    }
}