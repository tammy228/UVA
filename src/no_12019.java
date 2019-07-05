import java.util.*;
public class no_12019 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int num1,num2,totalDays=0;
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] week = {"Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday"};	
		for(int i=0; i<cases; i++){
			totalDays = 0;
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			for(int j=0; j<=num1-2; j++)	totalDays += month[j];
			totalDays += num2;
			System.out.println(totalDays);
			System.out.println(week[totalDays%7]);
		}
	}
}
