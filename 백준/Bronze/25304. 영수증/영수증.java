import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 영수증에 적힌 총 금액 입력받기
        int n = sc.nextInt(); // 영수증에 적힌 구매한 물건 종류 수 입력받기
        int[] arr = new int[n];
        int answer = 0;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt(); // 물건의 가격 입력받기
            int b = sc.nextInt(); // 개수 입력받기
            arr[i] = a * b; // 가격 * 개수의 값을 배열에 담기
            answer += arr[i]; // 배열의 요소를 모두 더한 것을 answer에 담기
        }
        sc.close();
        if(answer == x){ // answer의 값이 총 금액과 같을 때
            System.out.println("Yes");
        }
        else{ // 다를 때
            System.out.println("No");
        }
    }
}