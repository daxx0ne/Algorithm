import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine();
        String search = sc.nextLine();
        int count = 0; // 중복되지 않고 검색하고 싶은 단어가 등장할 수 있는 최대 횟수
        for (int i = 0; i < document.length() - search.length() + 1; i++) {
            if (document.startsWith(search, i)) { // i 인덱스부터 시작하는 문자열이 검색하고 싶은 문자열로 시작하는지 검사
                count++;
                i += search.length() - 1; // i 인덱스와 검색할 문자열 길이를 더해준 다음 그 위치에서 부터 다시 검사
            }
        }
        System.out.println(count);
    }
}