import java.util.*;
public class no_10222 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int temp=0;
		char space = ' ';
		char alpha;
		String st="";
		String rule = "qwertyuiop[]asdfghjkl;'zxcvbnm,.";	//�ۭq��L��rule
		while(sc.hasNext()){
			st = sc.nextLine();
			
			for(int i=0; i<st.length(); i++){		//�}�l�P�_�@��r��
				alpha = st.charAt(i);
				if(alpha>= 65 && alpha<=90)	alpha =(char)(alpha + 32);	//�����D���ƻ��st.charAt()�L�k�αj���૬,�ҥH�u�n�]alpha�ӥN��(�j�g�����p�g)
				
				for(int j=0; j<32; j++){		//�]�������W�h
					if(rule.charAt(j) == alpha){	
						System.out.print(rule.charAt(j-2));
					}
					if(alpha == space && temp == 0){	//�h�]�@��temp�O�]�����n�@���L�X�ť�,�L�L�@���N���n�A�L�F	
					System.out.print(" ");
					temp = 1;
					}
				}
				temp = 0;
			}
			System.out.println();
		}
	}
}
