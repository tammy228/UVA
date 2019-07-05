import java.util.*;
public class no_11264{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i=0; i<cases; i++){
			int ans = 1;
			int num = sc.nextInt();
			int[] value = new int[num];
			for(int j=0; j<num; j++){
				value[j] = sc.nextInt();
			}
			int money = value[num-1] - 1;
			for(int l=num-2; l>=0; l--){
				if(money >= value[l]){
					money -= value[l];
					ans++;		
				}
			}
			System.out.println(ans);
		}
	}
}
