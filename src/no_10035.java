import java.util.*;
public class no_10035{
	public static void main(String[] args){
		boolean a=true;
		int reminder1,reminder2,bigger;
		Scanner sc = new Scanner(System.in);
		while(a){
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int addition = 0,ans = 0;
			if(num1==0 && num2==0)	break;
			if(num1 > num2)	bigger = num1;	//��X�̤j�����, �����ӼƦr���P���
			else bigger = num2;
			for(int i=0; i<Integer.toString(bigger).length(); i++){		//�� mod10 �h��X�C�Ӧ�Ʀ��S���i��
				reminder1 = num1 % 10;
				num1 /= 10;
				reminder2 = num2 % 10;
				num2 /= 10;
				if(addition + reminder1 + reminder2 >= 10) ans++;	//�Y���i��h ans �[1
				if(reminder1 + reminder2 >= 10)addition = 1;	//�p�G���j��10��i��]��1,�]���O�[�k,�̤j�u�|�O1
				else addition = 0;
			}
			if(ans == 0) System.out.println("No carry operation.");
			else if(ans == 1) System.out.println(ans + " carry operation.");
			else System.out.println(ans + " carry operations."); 
		}		  
	}
}
