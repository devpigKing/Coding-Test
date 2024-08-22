import java.util.Scanner;

public class Main{

    public static void main(String[] args){
    
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		long[] dist = new long[N-1]; // 도시간 거리
		long[] cost = new long[N]; // 도시별 리터 당 기름 비용
		
		// 거리
		for (int i = 0; i < N-1; i++) {
				dist[i] = sc.nextLong();
		}
		
		// 도시별 리터 당 기름 비용
		for (int i = 0; i < N; i++) {
				cost[i] = sc.nextLong();
		}
		
		long sum = 0;
		long minimun = cost[0]; 
		
		for (int i = 0; i < N-1; i++) {
				if (cost[i] < minimun ) {
						minimun = cost[i];
				}
			  sum += (minimun *dist[i]); 
		}
		
		System.out.println(sum);
		}
}