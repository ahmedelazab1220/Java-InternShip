import java.io.*;

public class Task2 {

    static BufferedReader br;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String filePath = "path/to/your/Lincoln.txt";
        int wordCount = countOccurrences(filePath);
        bw.write("Number Of Words -> " + wordCount);
        closeResources();
    }

    private static int countOccurrences(String filePath) {
        int wordCount = 0;
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.trim().equals("--") && !word.isEmpty() && !isNumeric(word)) {
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches("-?\\d+(\\.\\d+)?");
    }

    private static void closeResources() {
        try {
            if (br != null) br.close();
            if (bw != null) bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
