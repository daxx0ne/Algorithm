import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 물웅덩이 개수
        int l = sc.nextInt(); // 널빤지 길이
        int minPlank = 0; // 널빤지들의 최소 개수
        int x = 0; // 이전에 놓은 널빤지의 끝 위치
        int[][] puddle = new int[n][2]; // 물웅덩이의 시작 위치와 끝 위치를 저장하는 배열

        // 물웅덩이 시작 위치와 끝 위치 입력 받기
        for (int i = 0; i < n; i++) {
            puddle[i][0] = sc.nextInt();
            puddle[i][1] = sc.nextInt();
        }

        // 물웅덩이 시작 위치를 기준으로 오름차순 정렬
        Arrays.sort(puddle, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return Integer.compare(o1[1], o2[1]);
                }
                return Integer.compare(o1[0], o2[0]);
            }
        });

        // 각 물웅덩이를 덮기 위해 필요한 널빤지 개수 계산
        for (int i = 0; i < n; i++) {
            if (puddle[i][0] > x) { // 시작위치가 범위보다 클 경우
                x = puddle[i][0];
            }
            if (puddle[i][1] >= x) { // 끝위치가 범위보다 클 경우
                while (puddle[i][1] > x) {
                    x += l;
                    minPlank++;
                }
            }
        }

        System.out.println(minPlank);
    }
}