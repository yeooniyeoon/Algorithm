import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        Queue<Integer> matrixA = new LinkedList<>();
        Queue<Integer> matrixB = new LinkedList<>();

        for (int i = 0; i < row * col; i++)
            matrixA.add(sc.nextInt());
        for (int i = 0; i < row * col; i++)
            matrixB.add(sc.nextInt());

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrixA.poll() + matrixB.poll() + " ");
            }
            System.out.println();
        }
    }
}