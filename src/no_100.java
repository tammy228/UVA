import java.util.*;
public class no_100{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 1,temp3 = 0;
		while(sc.hasNext()){
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int temp1 = num1;	//temp1 �� temp2 �Ψӷ�@�̫᪺�C�L, ����num2��num1�p
			int temp2 = num2;
			List<Integer> array = new ArrayList();	//�º�Q�q,�i�H��int�N��,�ϥ�max�C����j���ȴN�s�i�h
			if(num1 > num2){	temp3 = num1; num1 = num2; num2 = temp3;}
			for(; num1<=num2; num1++){	//��Xnum1 ~ num2 ���Ҧ���
				int temp = num1;
				count = 1;
				while(temp != 1){	//�D�ص����Ѫk
					if(temp % 2 != 0)	temp = (3*temp)+1;
					else temp /= 2;
					count ++;
				}
				array.add(count);	//arraylist���n�B�O���ΨM�w�}�C���פj�p
			}
			array.sort(null);	//sort()�̭��� null�N�O�Ѥj�ƨ�p
			System.out.println(temp1 + " " + temp2 + " " + array.get(array.size() - 1));	//��arraylist ���ȭn��get()
		}
	}
}

