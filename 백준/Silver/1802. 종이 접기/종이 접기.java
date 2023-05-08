import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<String>();
        int t = sc.nextInt(); // 테스트 케이스의 개수
        for (int i = 0; i < t; i++) {
            String paper = sc.next(); // 종이의 정보
            if (paper.length() == 1) { // 길이가 1이면 무조건 YES
                result.add("YES");
                continue;
            }
            int length = paper.length();
            int index = length / 2;
            boolean stop = false;
            while (index != 0) {
                for (int j = 0, k = length - 1; j < index; j++, k--) {
                    if (paper.charAt(j) == paper.charAt(k)) {
                        stop = true;
                        break;
                    }
                }
                if (stop) break;
                length /= 2;
                index /= 2;
            }
            if (stop) result.add("NO");
            else result.add("YES");
        }
        for (String s : result) System.out.println(s);
    }
}