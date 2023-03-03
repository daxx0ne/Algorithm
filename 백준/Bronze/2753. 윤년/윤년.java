import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt(); // 연도를 입력받음
        if(year % 4 == 0 && year % 100 != 0){ // 4의 배수이고 100의 배수가 아닐 때
            System.out.println("1");
        }
        else if(year % 400 == 0){ // 400의 배수일 때
            System.out.println("1"); 
        }
        else {
            System.out.println("0");
        }
    }
}