import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        HashMap<Integer, String> numIsKey = new HashMap<>();
        HashMap<String, Integer> nameIsKey = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = sc.nextLine();
            numIsKey.put(i, name);
            nameIsKey.put(name, i);
        }

        for (int i = 0; i < m; i++) {
            String input = sc.nextLine();
            if (isInteger(input)) {
                int num = Integer.parseInt(input);
                System.out.println(numIsKey.get(num));
            }
            else {
                System.out.println(nameIsKey.get(input));
            }
        }
    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}