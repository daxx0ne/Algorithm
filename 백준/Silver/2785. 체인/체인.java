import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt(); // 체인의 개수
        int min = 0; // 최소한의 고리 수
        for (int i = 0; i < n; i++) {
            int length = sc.nextInt();
            list.add(length);
        }
        Collections.sort(list);
        while (list.size() > 1) {
            list.set(0, list.get(0) - 1);
            list.remove(list.size() - 1);
            if (list.get(0) == 0)
                list.remove(0);
            min++;
        }
        System.out.println(min);
    }
}