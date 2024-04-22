import java.io.*;
import java.util.StringTokenizer;

public class TaskTwo {

    // Task 2 -> calculate average of an array
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // Task 1 -> calculate First Occurrence of item in array
        int sizeOfArray = Integer.parseInt(br.readLine());

        int [] array = new int [sizeOfArray];

        st =  new StringTokenizer(br.readLine());

        for(int i=0;i < sizeOfArray;i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        bw.write("average of an elements in array - " + Average(array));

        br.close();
        bw.close();

    }

    public static double Average(int [] array){

        long sum = 0;
        for (int j : array) {
            sum += j;
        }

        return (double) (sum / array.length);

    }
}