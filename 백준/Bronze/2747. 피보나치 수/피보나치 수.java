import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int temp = 0;
        int temp1 = 1;
        int temp2 = 1;

        for (int i = 2; i <= N; i++) {
            temp2 = temp + temp1;
            temp = temp1;
            temp1 = temp2;
        }
        System.out.println(temp2);


    }
}
