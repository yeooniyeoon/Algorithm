import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        List<Integer> numsList = new ArrayList<>();

        for (int i = 0; i < n; i++)
            numsList.add(Integer.parseInt(nums[i]));

        bw.write(Collections.min(numsList) + " " + Collections.max(numsList));
        bw.flush();
    }
}