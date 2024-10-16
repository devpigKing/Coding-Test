import java.util.*;
import java.io.*;

class Solution {
		public static void main(String[] args) {
				String[] grade = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
				Scanner sc = new Scanner(System.in);
				
				int T = sc.nextInt();
				for (int tc = 1; tc <= T; tc++) {
						int N = sc.nextInt();
						int K = sc.nextInt();
						double[] scores = new double[N];
						
						for (int i = 0; i < N; i++) {
								int mid = sc.nextInt();
								int last = sc.nextInt();
								int hw = sc.nextInt();
								scores[i] = mid*0.35 + last*0.45 + hw*0.20;
						}
						
						double targetScore = scores[K - 1];
						Arrays.sort(scores);
						for (int i = 0; i < N; i++) {
								if (scores[i] == targetScore) {
										System.out.println("#" + tc + " " + grade[i / (N / 10)]);
								}
						}
				}
		}
}