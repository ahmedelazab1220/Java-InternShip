import java.io.*;


public class Task3 {

    // Task 3 -> use Loop to print even number from 1 to 20
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 2; i <= 20; i += 2) {
            bw.write("print even number - " + i + "\n");
        }

        br.close();
        bw.close();

    }

}