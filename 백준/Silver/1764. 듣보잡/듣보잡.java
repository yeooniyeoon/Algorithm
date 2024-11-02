import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        HashSet<String> nList = new HashSet<>();
        for (int i = 0; i < n; i++) {
            nList.add(sc.nextLine());
        }

        int count = 0;
        List<String> dupList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String input = sc.nextLine();
            if (nList.contains(input)) {
                dupList.add(input);
                count++;
            }
        }
        
        Collections.sort(dupList);

        System.out.println(count);
        for (String str : dupList) {
            System.out.println(str);
        }
        
    }
}