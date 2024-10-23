import java.io.*;
import java.util.*;

class Member {
    int age;
    String name;

    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Member mem = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
            members.add(mem);
        }

        members.sort(Comparator.comparingInt(a -> a.age));

        for (Member mem : members)
            System.out.println(mem.age + " " + mem.name);
    }
}