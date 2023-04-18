import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine().trim();
        if(t.equals("")){
            System.out.println("0");
        }
        else{
            String[] arr = t.split(" ");
            System.out.println(arr.length);
        }
    }
}