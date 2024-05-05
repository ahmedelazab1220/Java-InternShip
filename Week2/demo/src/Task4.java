import java.io.*;

public class Task4 {

    // Task 4 -> take day number and use if else to print name of day
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int dayNumber = Integer.parseInt(br.readLine());

        if (dayNumber == 1) {
            bw.write("Monday" + "\n");
        } else if (dayNumber == 2) {
            bw.write("Tuesday" + "\n");
        } else if (dayNumber == 3) {
            bw.write("Wednesday" + "\n");
        } else if (dayNumber == 4) {
            bw.write("Thursday" + "\n");
        } else if (dayNumber == 5) {
            bw.write("Friday" + "\n");
        } else if (dayNumber == 6) {
            bw.write("Saturday" + "\n");
        } else if (dayNumber == 7) {
            bw.write("Sunday" + "\n");
        } else {
            bw.write("This number is false - There no day with this number \n");
        }

        br.close();
        bw.close();

    }

}