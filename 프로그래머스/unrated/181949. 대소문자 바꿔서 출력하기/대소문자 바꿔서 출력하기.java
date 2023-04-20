import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder answer = new StringBuilder();
        for(char k : a.toCharArray()){
            if(Character.isLowerCase(k)){
                answer.append(Character.toUpperCase(k));
            }
            else{
                answer.append(Character.toLowerCase(k));
            }
        }
        System.out.println(answer);
    }
}