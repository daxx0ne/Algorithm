import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 과목 수
        int m = sc.nextInt(); // 주어진 마일리지
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(); // 과목을 신청한 사람 수
            int l = sc.nextInt(); // 과목의 수강인원
            int[] mileage = new int[p]; // 각 사람이 넣은 마일리지
            for (int j = 0; j < p; j++) {
                mileage[j] = sc.nextInt();
            }
            if (p < l) { // 과목의 수강인원보다 신청자가 적을 때
                arr[i] = 1; // 내가 사용할 마일리지
            } else {
                Arrays.sort(mileage);
                arr[i] = mileage[p - l]; // 마일리지가 같으면 성준이에게 우선순위가 있기 때문
            }
        }
        Arrays.sort(arr);
        int maxCount = 0; // 최대로 들을 수 있는 과목 개수
        for (int i = 0; i < n; i++) {
            if (arr[i] > m) { // 어떤 과목 신청에 쓰이는 마일리지가 내게 주어진 마일리지보다 크면 멈춤
                break;
            }
            m -= arr[i]; // 내 마일리지 - 사용한 마일리지
            maxCount++;
        }
        System.out.println(maxCount);
    }
}