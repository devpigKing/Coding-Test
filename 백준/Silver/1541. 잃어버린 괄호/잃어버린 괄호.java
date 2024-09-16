import java.util.Scanner;

public class Main {
		static int answer = 0;
    public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);
		    String exam = sc.nextLine();
		    String[] str = exam.split("-"); // -기준으로 나눠서 배열에
		    
		    for (int i=0; i < str.length; i++) {
				    int temp = mySum(str[i]);
				    if (i == 0) answer = answer + temp;
				    else answer = answer - temp;
		    }
		    
		    System.out.println(answer);
    }
    
    private static int mySum(String a) {
		    int sum = 0;
		    String[] temp = a.split("[+]");
		    
		    for(int i = 0; i < temp.length; i++) {
				    sum += Integer.parseInt(temp[i]);
		    }
		    
		    return sum;
    }
    
}