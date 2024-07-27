import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        int maxIdx = 0;
        while(!(input = br.readLine()).equals("0 0 0")) {
            String[] inputStr = input.split(" ");
            int[] inputArr = new int[3];
            for (int i = 0; i < 3; i++) {
                inputArr[i] = Integer.parseInt(inputStr[i]);
                if (inputArr[i] > inputArr[maxIdx])
                    maxIdx = i;
            }

            int sum1 = 0;
            double sum2 = 0;
            for (int i = 0; i < 3; i++) {
                if (i == maxIdx)
                    sum2 = Math.pow(inputArr[i], 2);
                else
                    sum1 += Math.pow(inputArr[i], 2);
            }

            if (sum1 == sum2) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}