import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split("");

        for (String str : input) {
            switch (str) {
                case "B" :
                    bw.write("v");
                    break;
                case "E" :
                    bw.write("ye");
                    break;
                case "H" :
                    bw.write("n");
                    break;
                case "P" :
                    bw.write("r");
                    break;
                case "C" :
                    bw.write("s");
                    break;
                case "Y" :
                    bw.write("u");
                    break;
                case "X" :
                    bw.write("h");
                    break;
                default:
                    bw.write(str.toLowerCase());
            }
            bw.flush();
        }
    }
}