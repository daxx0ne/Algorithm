import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = 0; // 과목평점
        double credit = 0; // 학점
        double sum = 0; // 학점의 총합
        double all = 0; // (학점 × 과목평점)의 합
        double answer = 0;
        for (int i = 0; i < 20; i++) {
            String n = sc.nextLine();
            String[] arr = n.split(" ");
            credit = Double.parseDouble(arr[1]);
            switch (arr[2]) {
                case "A+" -> score = 4.5;
                case "A0" -> score = 4.0;
                case "B+" -> score = 3.5;
                case "B0" -> score = 3.0;
                case "C+" -> score = 2.5;
                case "C0" -> score = 2.0;
                case "D+" -> score = 1.5;
                case "D0" -> score = 1.0;
                case "F" -> score = 0.0;
                case "P" -> credit = 0.0;
            }
            sum += credit;
            all += credit * score;
        }
        answer = all / sum;
        if (all == 0) {
            answer = 0;
        }
        System.out.println(answer);
    }
}