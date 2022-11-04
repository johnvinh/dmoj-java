import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ECOOTakeANumber {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int nextNumber = Integer.parseInt(in.readLine());
        int numWaiting = 0;
        int numStudents = 0;
        String line;
        while (!((line = in.readLine()).equals("EOF"))) {
            if (line.equals("TAKE")) {
                numWaiting++;
                numStudents++;
                if ((nextNumber + 1) > 999) {
                    nextNumber = 1;
                } else {
                    nextNumber++;
                }
            } else if (line.equals("SERVE")) {
                numWaiting--;
            } else if (line.equals("CLOSE")) {
                System.out.printf("%d %d %d%n", numStudents, numWaiting, nextNumber);
                numWaiting = 0;
                numStudents = 0;
            }
        }
        in.close();
    }
}
