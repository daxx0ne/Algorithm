import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        List stack = new LinkedList<String>();

        for (int start = 0; start < N; start++) {
            String[] X = reader.readLine().split(" ");
            String comm = X[0];

            if (comm.equals("push")) {
                stack.add(X[1]);
            } else if (comm.equals("pop")) {
                System.out.println(stack.size() != 0 ? String.valueOf(stack.remove(stack.size() - 1)) : -1);
            } else if (comm.equals("size")) {
                System.out.println(stack.size());
            } else if (comm.equals("empty")) {
                System.out.println(stack.size() != 0 ? 0 : 1);
            } else if (comm.equals("top")) {
                System.out.println(stack.size() != 0 ? stack.get(stack.size() - 1) : -1);
            }
        }
    }
}