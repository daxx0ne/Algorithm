import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String num = sc.next();
			if(num.equals("0")) {
				break;
			}
			int answer = num.length() + 1;
			String[] arr = num.split("");
			for (String s : arr) {
				if (s.equals("1")) {
					answer += 2;
				} else if (s.equals("0")) {
					answer += 4;
				} else {
					answer += 3;
				}
			}
			System.out.println(answer);
		}
	}
}