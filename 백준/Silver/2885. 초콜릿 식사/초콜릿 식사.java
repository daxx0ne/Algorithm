import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // 먹어야 하는 정사각형 개수

        int cnt = 0; // 최소 쪼개는 횟수
        int min_size = 0; // 최소 초콜릿 크기
        int size = 1;

        while (size < k) { // 초콜릿 크기가 먹어야 하는 정사각형 개수보다 작을 때마다
            size *= 2; // 초콜릿 크기를 2배로 늘리기
            min_size = size;
        }
        while (k > 0) {  // 최소 몇 번 쪼개야 하는지 계산
            if (k >= size) { // k보다 크거나 같으면 K개를 만들 수 있으므로 초콜릿의 크기만큼 감소
                k -= size;
            } else { // k보다 작으면 초콜릿을 쪼개고 횟수 증가
                size /= 2;
                cnt++;
            }
        }

        System.out.println(min_size + " " + cnt);
    }
}