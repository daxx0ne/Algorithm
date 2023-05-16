import java.util.*;

public class Main {
    static int n;
    static int[][] ability;
    static boolean[] visited;
    static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ability = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ability[i][j] = sc.nextInt();
            }
        }

        dfs(0, 0);
        System.out.println(minDiff);
    }

    public static void dfs(int index, int depth) {
        if (depth == n / 2) {
            int startTeam = 0;
            int linkTeam = 0;

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (visited[i] && visited[j]) {
                        startTeam += ability[i][j] + ability[j][i]; // 스타트 팀의 능력치
                    } else if (!visited[i] && !visited[j]) {
                        linkTeam += ability[i][j] + ability[j][i]; // 링크 팀의 능력치
                    }
                }
            }

            int diff = Math.abs(startTeam - linkTeam);
            if (diff == 0) {
                System.out.println(diff);
                System.exit(0);
            }

            minDiff = Math.min(diff, minDiff); // 능력치 차이의 최소값
            return;
        }

        for (int i = index; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }
}