import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		int[] arr = new int[11];
		Arrays.fill(arr, -1);
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int loc = sc.nextInt();
			if (arr[num] == -1) {
				arr[num] = loc;
			}
			else if (arr[num] != loc) {
				arr[num] = loc;
				answer++;
			}
		}
		System.out.println(answer);
	}
}