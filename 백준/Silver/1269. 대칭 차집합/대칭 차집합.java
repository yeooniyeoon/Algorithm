import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        HashSet<Integer> aSet = new HashSet<>();
        for (int i = 0; i < a; i++) {
            aSet.add(sc.nextInt());
        }

        HashSet<Integer> bSet = new HashSet<>();
        for (int i = 0; i < b; i++) {
            bSet.add(sc.nextInt());
        }

        int count = 0;
        for (int i : aSet) {
            if (!bSet.contains(i)) {
                count++;
                bSet.add(i);
            }
        }

        for (int i : bSet) {
            if (!aSet.contains(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
}