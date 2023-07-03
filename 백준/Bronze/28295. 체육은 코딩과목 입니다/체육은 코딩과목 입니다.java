import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int direction = 0;
		for (int i = 0; i < 10; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				direction += 90;
			} else if (t == 2) {
				direction += 180;
			} else if (t == 3) {
				direction -= 90;
			}
		}
		direction = direction % 360;
		if (direction == 0) {
			System.out.println("N");
		}
		else if (direction == 90 || direction == -270) {
			System.out.println("E");
		}
		else if (direction == 180 || direction == -180) {
			System.out.println("S");
		}
		else if (direction == 270 || direction == -90) {
			System.out.println("W");
		}
	}
}