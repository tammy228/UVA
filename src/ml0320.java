import java.util.*;
public class ml0320 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
	    int i, j;
	    for (i = 1; i <= size; i++) { // 印出第i列
	        for (j = 1; j <= size-i; j++) { // 第i列 有size-i個空格
	            System.out.printf(" ");
	        }
	        for (j = 1; j <= 2 * i - 1; j++) { // 以及2*i-1個*
	            System.out.printf("*");
	        }
	        System.out.printf("\n");
	    }
	}
}
