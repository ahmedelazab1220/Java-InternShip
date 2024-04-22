import java.io.*;

import static java.lang.Double.NaN;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Task 1 -> use data types to declare variable
        int age = 18;
        double height = 200.59;
        boolean rain = true;
        String cityName = "Cairo";

        bw.write("age of person - " + age + "\n");
        bw.write("Height of building - " + height + "\n");
        bw.write("Weather is rain - " + rain + "\n");
        bw.write("City Name - " + cityName + "\n");

        // Task 2 -> take two numbers and do operations on it
        long num1 = Long.parseLong(br.readLine());
        long num2 = Long.parseLong(br.readLine());

        bw.write("sum of two numbers a and b equal to - " + Add(num1 , num2) + "\n");
        bw.write("Subtract of two numbers a and b equal to - " + Subtract(num1 , num2) + "\n");
        bw.write("Multiple of two numbers a and b equal to - " + Multiple(num1 , num2) + "\n");
        bw.write("Division of two numbers a and b equal to - " + Division(num1 , num2) + "\n");


        // Task 3 -> use Loop to print even number from 1 to 20
        for(int i=2;i <= 20;i+=2){
            bw.write("print even number - " + i + "\n");
        }

        // Task 4 -> take day number and use if else to print name of day
        int dayNumber = Integer.parseInt(br.readLine());

        if(dayNumber == 1){
            bw.write("Monday" + "\n");
        }
        else if(dayNumber == 2){
            bw.write("Tuesday" + "\n");
        }
        else if(dayNumber == 3){
            bw.write("Wednesday" + "\n");
        }
        else if(dayNumber == 4){
            bw.write("Thursday" + "\n");
        }
        else if(dayNumber == 5){
            bw.write("Friday" + "\n");
        }
        else if(dayNumber == 6){
            bw.write("Saturday" + "\n");
        }
        else if(dayNumber == 7){
            bw.write("Sunday" + "\n");
        }
        else {
            bw.write("This number is false - There no day with this number \n");
        }

        br.close();
        bw.close();

    }

    public static long Add(long a, long b){
        return a + b;
    }

    public static long Subtract(long a, long b){
        return a - b;
    }

    public static long Multiple(long a, long b){
        return a * b;
    }

    public static double Division(long a, long b){
        if(b == 0){
            return NaN;
        }
        return a*1.0 / b;
    }
}