import java.util.Scanner;

public class Main {
		static int answer = 0;
    public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in); // 입력값이 많지 않아서 Scanner
		    String exam = sc.nextLine();
		    String[] str = exam.split("-"); // - 기준으로 나눠서 배열에 삽입
		    
		    for (int i=0; i < str.length; i++) { // str을 돌며 
				    int temp = mySum(str[i]); 
				    if (i == 0) answer = answer + temp;
				    else answer = answer - temp;
		    }
		    
		    System.out.println(answer);
    }
    
    private static int mySum(String a) { // 괄호 안 숫자들의 합을 더하는 메서드
		    int sum = 0; 
		    String[] temp = a.split("[+]"); // +를 기준으로 split
		    // +는 시스템에서 잘 안읽히는 경우가 많아서 양 옆에 []괄호
		    for(int i = 0; i < temp.length; i++) {
				    sum += Integer.parseInt(temp[i]); 
		    }
		    
		    return sum; // 다음 -가 나오기 전까지의 괄호안 숫자들의 합
    }
    
}