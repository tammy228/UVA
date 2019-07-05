import java.util.*;
public class no_11332{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num != 0){
			reduce(num);
		}
	}
	public static void reduce(int num){
		int digit;
		while(num / 10 >= 1){
			digit = num % 10;
			digit +=digit;
		}
		System.out.println();
	}
}
