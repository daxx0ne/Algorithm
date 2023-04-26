import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong(); // 집의 위치 x좌표
        long y = sc.nextLong(); // 집의 위치 y좌표
        long w = sc.nextLong(); // 걸어서 한 블록 가는데 걸리는 시간 (평행 이동)
        long s = sc.nextLong(); // 대각선으로 한 블록을 가로지르는 시간

        long case1 = (x + y) * w; // case1: 평행 이동만 해서 가는 경우
        long case2; // case2: 대각선으로 가는 경우
        if((x + y) % 2 != 0) { // (x + y)가 홀수일 때 -> 둘 중 큰 수에서 1 빼준 만큼 대각선으로 가고, 평행 이동은 한번
            case2 = (Math.max(x, y) - 1) * s + w;
        }
        else { // (x + y)가 짝수일 때 -> 둘 중 큰 수만큼 대각선으로 감
            case2 = Math.max(x, y) * s;
        }
        long case3 = (Math.min(x, y) * s) + (Math.abs(x - y) * w); // case3: 대각선 + 평행 이동 둘다 해서 가는 경우
        // x, y 값 중 작은 값 만큼만 대각선으로, 나머지(절대값)만큼 평행 이동

        long min = Math.min(Math.min(case1, case2), case3); // case들 중 가장 작은 수가 최소 시간

        System.out.println(min);
    }
}