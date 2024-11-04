import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i <= input.length() - 1; i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                hashSet.add(input.substring(i, j));
            }
        }

        System.out.println(hashSet.size());
    }
}