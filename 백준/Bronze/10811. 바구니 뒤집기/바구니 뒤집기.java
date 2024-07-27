import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt() + 1];
        int swapCount = sc.nextInt();

        for (int i = 1; i < arr.length; i++)
            arr[i] = i;

        for (int i = 0; i < swapCount; i++) {
            int startIdx = sc.nextInt();
            int endIdx = sc.nextInt();
            while (startIdx < endIdx){
                int tmp = arr[startIdx];
                arr[startIdx++] = arr[endIdx];
                arr[endIdx--] = tmp;
            }
        }

        for (int i = 1; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}