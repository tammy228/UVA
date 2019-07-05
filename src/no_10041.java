import java.util.*;
public class no_10041 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int middle,ans=0;
		int count = sc.nextInt();	//測資個數
		for(int i=0; i<count; i++){
			int number = sc.nextInt();	//幾個親戚
			int[] street= new int[number];	//親戚的門牌號碼
			for(int j=0; j<number; j++){
				street[j] = sc.nextInt();
			}
			Arrays.sort(street);
			for(int j=0;  j<number; j++) {	
				System.out.println(street[j]);
			}
			
			middle = street[number / 2];	//找出中位數
			for(int k=0; k<number; k++){
				ans+=Math.abs(street[k]-middle);	//算出Vito 跟每個親戚的距離
			}
			System.out.println(ans);
			ans = 0;
		}
	}
}
