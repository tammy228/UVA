import java.util.*;
public class no_10008 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max=0;
		int num = sc.nextInt();	
		sc.nextLine();		//�Y���Ʀr�᪺����
		String st = new String();
		int[] counting = new int[26];
		
		for(int i=0; i<num; i++){
			st = sc.nextLine();
			st = st.toUpperCase();		//�����ন�j�g
			for(int j=0; j<st.length(); j++){		//���p�O����A~Z�����N�⥦�s�iint�}�C�̭�
				if(st.charAt(j)>=65 && st.charAt(j)<=90){
					counting[st.charAt(j)-65] ++;		//�Q��ascii��index���ഫ
				}
			}
		}
		for(int i=0; i<26; i++){	//��X���Ӧr���X�{�̦h��
			if(counting[i] > max) max = counting[i];
		}
		for(int i=max; i>0; i--){		//�q�X�{�̦h�����r���}�l�L
			for(int j=0; j<26; j++){	//�}�C�q�̫e���}�l�],�ҥH�N��X�{���Ƥ@��,�]�i�H���L�Xalphabetical order
				if(counting[j] == i)	System.out.println((char)(j+65) + " " + i);		//�αj���૬�L�X�r��
			}
		}
	}
}
