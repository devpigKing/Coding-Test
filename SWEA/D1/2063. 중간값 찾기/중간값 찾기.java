import java.util.Scanner;
import java.util.Arrays;

class Solution {
		public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int N = sc.nextInt();
				int[] A = new int[N];

				for ( int i = 0; i < N; i++) {
						A[i] = sc.nextInt();
				} 
				Arrays.sort(A);

				int mid = N/2;
				System.out.println(A[mid]);

		}
}