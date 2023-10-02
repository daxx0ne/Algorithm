import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9];
        int height = 0;
        boolean findRealDwarf = false;
        for (int i = 0; i < 9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
            height += dwarf[i];
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j <= 8; j++) {
                if (dwarf[i] + dwarf[j] == height - 100) {
                    dwarf[i] = 0;
                    dwarf[j] = 0;
                    Arrays.sort(dwarf);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(dwarf[k]);
                    }
                    findRealDwarf = true;
                }
                if (findRealDwarf) {
                    break;
                }
            }
            if (findRealDwarf) {
                break;
            }
        }
    }
}