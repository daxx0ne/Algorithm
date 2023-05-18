import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] trains = new int[n][20];
        for (int i = 0; i < m; i++) {
            int command = sc.nextInt();
            int trainIndex = sc.nextInt() - 1;
            if (command == 1) { // 탑승
                int seatPosition = sc.nextInt() - 1;
                trains[trainIndex][seatPosition] = 1;
            }
            if (command == 2) { // 하차
                int seatPosition = sc.nextInt() - 1;
                trains[trainIndex][seatPosition] = 0;
            }
            if (command == 3) { // 뒤로 한칸씩
                System.arraycopy(trains[trainIndex], 0, trains[trainIndex], 1, trains[trainIndex].length - 1);
                trains[trainIndex][0] = 0;
            }
            if (command == 4) { // 앞으로 한칸씩
                System.arraycopy(trains[trainIndex], 1, trains[trainIndex], 0, trains[trainIndex].length - 1);
                trains[trainIndex][trains[trainIndex].length - 1] = 0;
            }
        }

        Set<String> uniqueTrains = new HashSet<>();
        for (int[] train : trains) {
            uniqueTrains.add(Arrays.toString(train));
        }
        System.out.println(uniqueTrains.size());
    }
}