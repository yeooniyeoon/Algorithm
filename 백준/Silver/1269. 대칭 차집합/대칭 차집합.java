import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        HashSet<Integer> aSet = new HashSet<>();
        for (int i = 0; i < a; i++) {
            aSet.add(sc.nextInt());
        }

        HashSet<Integer> bSet = new HashSet<>();
        for (int i = 0; i < b; i++) {
            bSet.add(sc.nextInt());
        }

        HashSet<Integer> diffAB = new HashSet<>(aSet);
        diffAB.removeAll(bSet);

        HashSet<Integer> diffBA = new HashSet<>(bSet);
        diffBA.removeAll(aSet);

        System.out.println(diffAB.size() + diffBA.size());
    }
}