import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i < 10; i++)
            nums.add(Integer.parseInt(br.readLine()));

        bw.write(Collections.max(nums) + "\n");
        bw.write(Integer.toString(nums.indexOf(Collections.max(nums)) + 1));
        bw.flush();
    }
}