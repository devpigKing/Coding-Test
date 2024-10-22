import java.util.Scanner;
import java.util.HashMap;

class Solution {
		public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				int T = sc.nextInt();
				for (int tc = 1; tc <= T; tc++) {
						int N = sc.nextInt();
						HashMap<Integer, Integer> map = new HashMap<>();
						
						for (int i = 2; i <= 9; i++) {
								map.put(i, 4);
						}
						
						map.put(11, 4);
						map.put(10, 16);
						
						int total = 52 - N;
						int sum = 0;
						
						for (int i = 0; i < N; i++) {
								int value = sc.nextInt();
								sum += value;
								map.put(value, map.get(value) - 1); 
						}
						
						int lower = 0;
						int upper = 0;
						
						
						for (int cardValue : map.keySet()) {
								int remainCnt = map.get(cardValue);
								if ( remainCnt > 0 ) {
										if (sum + cardValue > 21) {
												upper += remainCnt;
										} else {
												lower += remainCnt;
										}
								}
						}
						
						if ( upper >= lower ) {
								System.out.println("#" + tc + " " + "STOP");
						} else { 
								System.out.println("#" + tc + " " + "GAZUA");
						}
						
				}
				
		}
}