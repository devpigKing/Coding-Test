import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb1 = new StringBuilder();

        for ( int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                StringBuilder sb2 = new StringBuilder(st.nextToken());
                sb1.append(sb2.reverse() + " ");
            }

        }
        System.out.println(sb1);
    }
}
