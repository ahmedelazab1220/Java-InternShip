import java.io.*;

public class Task1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int number1 = readInteger("Enter the first integer: ");
        int number2 = readInteger("Enter the second integer: ");

        int sum = number1 + number2;

        bw.write("Sum of the two numbers: " + sum + "\n");

        closeResources();
    }

    private static int readInteger(String prompt) throws IOException {

        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                bw.write(prompt);
                bw.flush(); // Ensure prompt is displayed immediately
                number = Integer.parseInt(br.readLine());
                validInput = true;
            } catch (NumberFormatException e) {
                bw.write("Invalid input. Please enter an integer.\n");
            }
        }
        return number;
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