import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            map.put(input[0], input[1]);
        }

        List<String> sortedKeys = new ArrayList<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if ("enter".equals(entry.getValue())) {
                sortedKeys.add(entry.getKey());
            }
        }

        Collections.sort(sortedKeys, Collections.reverseOrder());

        for (String key : sortedKeys) {
            System.out.println(key);
        }
    }
}