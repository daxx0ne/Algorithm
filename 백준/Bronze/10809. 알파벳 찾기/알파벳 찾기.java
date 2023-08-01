import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        for(char i = 'a'; i <= 'z'; i++){
            System.out.println(s.indexOf(i));
        }
    }
}