import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] expectRank = new int[n]; // 예상 등수를 담을 배열
        long disSat = 0; // 최소 불만도의 합
        for (int i = 0; i < n; i++) {
            expectRank[i] = sc.nextInt();
        }
        Arrays.sort(expectRank); // 예상 등수를 오름차순 정렬
        for (int i = 0; i < n; i++) {
            disSat += Math.abs(expectRank[i] - (i+1)); //  (|A - B|) 불만도의 총 합을 최소로 하기
        }
        System.out.println(disSat);
    }
}