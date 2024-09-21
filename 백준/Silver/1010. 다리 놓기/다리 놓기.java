import java.io.*;
import java.util.*;

class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < count; i++){
            String s = bufferedReader.readLine();
            String[] arr = s.split(" ");

            int n = Integer.parseInt(arr[1]);
            int r = Integer.parseInt(arr[0]);
            double answer = 0;

            if (n-r == 0) {
                bufferedWriter.write(1 + "\n");
            }

            else {
                double up = fac(n);
                double down2 = fac(r);
                double down1 = fac((n - r));

                answer =  (up / (down1 * down2));
                answer = Math.round(answer);
                long result = (long)answer;
                bufferedWriter.write(result + "\n");
            }
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }

    private static double fac(double n) {
        if (n <= 1){
            return n;
        }
        else {
            return fac(n-1) * n;
        }
    }
}