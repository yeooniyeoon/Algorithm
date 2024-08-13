import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input1 = sc.next().toCharArray();
        char[] input2 = sc.next().toCharArray();

        int num1 = charArrToInt(input1);
        int num2 = charArrToInt(input2);

        System.out.println(num1 > num2 ? num1 : num2);
    }

    public static int charArrToInt(char[] charArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = charArr.length - 1; i >= 0; i--)
            sb.append(charArr[i]);

        return Integer.parseInt(sb.toString());
    }
}
