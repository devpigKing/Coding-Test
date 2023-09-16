import java.util.Scanner;
 
public class Main {
 
	static Integer A[];
	static int arr[];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		A = new Integer[N + 1];
		arr = new int[N + 1];
		
		for(int i = 1; i <= N; i++) {
			arr[i] = in.nextInt();
		}
		
		A[0] = arr[0];	
		A[1] = arr[1];
		
		if(N >= 2) {
			A[2] = arr[1] + arr[2];
		}
		
		System.out.println(find(N));
		
	}
	
	static int find(int N) {
		
		if(A[N] == null) {
			A[N] = Math.max(find(N - 2), find(N - 3) + arr[N - 1]) + arr[N];
		}
		
		return A[N];
	}
	
}