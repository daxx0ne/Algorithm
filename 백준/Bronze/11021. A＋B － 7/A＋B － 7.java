import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t]; // t만큼 배열의 크기를 지정
        int i = 0;
        while (i < t) { // t만큼 반복
            int a = sc.nextInt();
            int b = sc.nextInt(); // a, b를 입력받아서
            arr[i] = a + b; // 더한 것을 배열에 차곡차곡 저장
            i++;
        }
        sc.close();

        int number = 1;
        for (int k : arr) { // 배열의 요소를 하나씩 출력
            System.out.printf("Case #%d: "+ k + "\n", number);
            number++;
        }
    }
}