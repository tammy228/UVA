import java.util.*;
public class no_10041 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int middle,ans=0;
		int count = sc.nextInt();	//����Ӽ�
		for(int i=0; i<count; i++){
			int number = sc.nextInt();	//�X�ӿ˱�
			int[] street= new int[number];	//�˱������P���X
			for(int j=0; j<number; j++){
				street[j] = sc.nextInt();
			}
			Arrays.sort(street);
			for(int j=0;  j<number; j++) {	
				System.out.println(street[j]);
			}
			
			middle = street[number / 2];	//��X�����
			for(int k=0; k<number; k++){
				ans+=Math.abs(street[k]-middle);	//��XVito ��C�ӿ˱����Z��
			}
			System.out.println(ans);
			ans = 0;
		}
	}
}
