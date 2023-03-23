import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        String music = "";
        for(int i = 0; i < 8; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }
        if(arr[0] == 1) {
            for (int i = 0; i < 8; i++) {
                if (arr[i] != i + 1) {
                    music = "mixed";
                    break;
                } else if (i == 7) {
                    music = "ascending";
                }
            }
        }
        else {
            for (int i = 0; i < 8; i++) {
                if (arr[i] != 8 - i) {
                    music = "mixed";
                    break;
                } else if (i == 7) {
                    music = "descending";
                }
            }
        }
        System.out.println(music);
    }
}