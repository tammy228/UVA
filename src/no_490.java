import java.util.*;
public class no_490 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String st;
		int count=0,maxLength=0,lineNumber=0;
		int[] Length = new int[100];
		char[][] alpha = new char[100][100];		
		while(sc.hasNext()){	//���Y�i�Ҧ����r
			st = sc.nextLine();
			Length[lineNumber] = st.length();	//��C���`�@�X�Ӧr�O���U��
			if(st.length() > maxLength)		maxLength = st.length();	//��X�̪�������
			alpha[count] = st.toCharArray();	//�s�icharArray�̭�
			count++;
			lineNumber ++;
			
		}
		int temp=0;
		for(int i=0; i<maxLength ;i++){		//�̷��D�خ榡��X
			temp = 0;						//�n��l��,�_�h�|�Ψ�W�Ӱj�骺�F��
			for(int j=count-1; j>=0; j--){
				if(!(i>=Length[j])){ 		//��Y��r�굲���ɡA���A�L�X�r
					while(temp>0){			//�L�X�һݪ�0
						System.out.print(" ");
						temp--;
					}
					System.out.print(alpha[j][i]); //�L�X�r
					temp=0;
				}else	temp++; 	//�p��ݭn�h�֪ťչ����榡
			}
			System.out.println();
		}
	}
}

/*
import java.util.*;

public class UVA490 {

	public static void main(String[] args) {

ArrayList<String> AS = new ArrayList<String>();

Scanner sc = new Scanner(System.in);

int maxLen = 0;

while (sc.hasNext()) {

//for(int i =0;i<3;i++){

AS.add(sc.nextLine());

if (maxLen < AS.get(AS.size() - 1).length()) {

maxLen = AS.get(AS.size() - 1).length();
}

}


for (int j = 0; j < maxLen; ++j) {

for (int i = AS.size() - 1; i >= 0; --i) {

if (j < AS.get(i).length()) 
System.out.print(AS.get(i).charAt(j));

else 
System.out.print(" ");
}

}

sc.close();
}

}
*/