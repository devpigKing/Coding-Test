import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] A = new int[n];
        
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        long answer = 0;
        
        answer += n;
        
        for ( int i = 0 ; i < n; i++) {
            A[i] -= b;
            if (A[i] <= 0) continue;
            answer += A[i]/c;
            if (A[i]%c != 0 ) {
                answer++;
            }
            
        }
        System.out.println(answer);
    }
}
