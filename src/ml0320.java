import java.util.*;
public class ml0320 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
	    int i, j;
	    for (i = 1; i <= size; i++) { // �L�X��i�C
	        for (j = 1; j <= size-i; j++) { // ��i�C ��size-i�ӪŮ�
	            System.out.printf(" ");
	        }
	        for (j = 1; j <= 2 * i - 1; j++) { // �H��2*i-1��*
	            System.out.printf("*");
	        }
	        System.out.printf("\n");
	    }
	}
}
