import java.util.*;
public class no_490 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String st;
		int count=0,maxLength=0,lineNumber=0;
		int[] Length = new int[100];
		char[][] alpha = new char[100][100];		
		while(sc.hasNext()){	//先吃進所有的字
			st = sc.nextLine();
			Length[lineNumber] = st.length();	//把每行總共幾個字記錄下來
			if(st.length() > maxLength)		maxLength = st.length();	//找出最長的那行
			alpha[count] = st.toCharArray();	//存進charArray裡面
			count++;
			lineNumber ++;
			
		}
		int temp=0;
		for(int i=0; i<maxLength ;i++){		//依照題目格式輸出
			temp = 0;						//要初始化,否則會用到上個迴圈的東西
			for(int j=count-1; j>=0; j--){
				if(!(i>=Length[j])){ 		//當某行字串結束時，不再印出字
					while(temp>0){			//印出所需的0
						System.out.print(" ");
						temp--;
					}
					System.out.print(alpha[j][i]); //印出字
					temp=0;
				}else	temp++; 	//計算需要多少空白對應格式
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