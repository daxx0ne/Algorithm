import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] game = br.readLine().split(" ");
        int player = 0;
        switch (game[1]) {
            case "Y" -> player = 2;
            case "F" -> player = 3;
            case "O" -> player = 4;
        }
        HashSet<String> id = new HashSet<>();
        for(int i = 0; i < Integer.parseInt(game[0]); i++) {
            id.add(br.readLine());
        }
        System.out.print(id.size() / (player - 1));
    }
}