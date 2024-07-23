import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min >= 45)
            min -= 45;
        else if(min < 45) {
            if (hour == 0)
                hour = 23;
            else hour--;
            min = 60 - (45 - min);
        }
        System.out.println(hour + " " + min);

    }
}