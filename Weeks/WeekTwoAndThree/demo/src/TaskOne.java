import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class TaskOne {

    // Task 1 -> calculate First Occurrence of item in array if position less than 5 skip it

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


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
            bw.write("First Occurrence Of Item equal to - " + array[i] + " -- appear in this position - " + i);
            bw.newLine();
        }
    }
}
