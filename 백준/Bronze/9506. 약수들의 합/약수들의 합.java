import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input;
        while ((input = Integer.parseInt(br.readLine())) != -1) {
            List<Integer> divisor = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < input; i++) {
                if (input % i == 0) {
                    divisor.add(i);
                    sum += i;
                }
            }

            if (sum == input) {
                System.out.print(input + " = ");
                for (int i = 0; i < divisor.size(); i++) {
                    System.out.print(divisor.get(i));
                    if (i != divisor.size() -1)
                        System.out.print(" + ");
                }
                System.out.println();
            }
            else
                System.out.println(input + " is NOT perfect.");
        }
    }
}