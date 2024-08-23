import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float creditSum = 0;
        float gradeSum = 0;
        Map<String, Double> grades = new HashMap<>() {{
            put("A+", 4.5); put("A0", 4.0); put("B+", 3.5); put("B0", 3.0);
            put("C+", 2.5); put("C0", 2.0); put("D+", 1.5); put("D0", 1.0); put("F", 0.0);
        }};

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            if (grades.containsKey(input[2])) {
                creditSum += Float.parseFloat(input[1]);
                gradeSum += grades.get(input[2]) * Float.parseFloat(input[1]);
            }
        }
        System.out.println(gradeSum / creditSum);
    }
}