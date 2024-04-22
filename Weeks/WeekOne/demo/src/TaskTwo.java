import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Double.NaN;

public class TaskTwo {

    // Task 2 -> take two numbers and do operations on it
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());

        bw.write("sum of two numbers a and b equal to - " + Add(num1 , num2) + "\n");
        bw.write("Subtract of two numbers a and b equal to - " + Subtract(num1 , num2) + "\n");
        bw.write("Multiple of two numbers a and b equal to - " + Multiple(num1 , num2) + "\n");
        bw.write("Division of two numbers a and b equal to - " + Division(num1 , num2) + "\n");


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