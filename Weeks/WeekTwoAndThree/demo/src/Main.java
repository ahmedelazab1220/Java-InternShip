import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
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

        Set<Integer> hash_set = new HashSet<>();

        for(int i=5;i < sizeOfArray;i++) {
            if (hash_set.contains(array[i])) {
                continue;
            }
            hash_set.add(array[i]);
            System.out.println("First Occurrence Of Item equal to - " + array[i] + " -- appear in this position - " + i);
        }

        // Task 2 -> calculate average of an array
        System.out.println("average of an elements in array - " + Average(array));

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