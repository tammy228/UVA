import java.util.Arrays;
import java.util.Scanner;
public class no_11364 {
	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		int t = sc.nextInt();	//���X�Ӵ���
		for(int i = 0; i < t; i++){
			int store = sc.nextInt();	//�n�}�X����
			int arr[] = new int[store];
			for(int j = 0; j < store; i++)
				arr[j] = sc.nextInt();
			Arrays.sort(arr);
			System.out.println(2*(arr[store - 1] - arr[0]));
		}
	}
}
