import java.io.*;

public class Task1 {

    // Task 1 -> use data types to declare variable
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int age = 18;
        double height = 200.59;
        boolean rain = true;
        String cityName = "Cairo";

        bw.write("age of person - " + age + "\n");
        bw.write("Height of building - " + height + "\n");
        bw.write("Weather is rain - " + rain + "\n");
        bw.write("City Name - " + cityName + "\n");


        br.close();
        bw.close();

    }

}