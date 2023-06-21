import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			String word = sc.next();
			System.out.print(word.charAt(0));
			System.out.println(word.charAt(word.length() - 1));
		}
	}
}