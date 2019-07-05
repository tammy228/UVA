import java.util.*;
public class no_10222 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int temp=0;
		char space = ' ';
		char alpha;
		String st="";
		String rule = "qwertyuiop[]asdfghjkl;'zxcvbnm,.";	//自訂鍵盤的rule
		while(sc.hasNext()){
			st = sc.nextLine();
			
			for(int i=0; i<st.length(); i++){		//開始判斷一行字串
				alpha = st.charAt(i);
				if(alpha>= 65 && alpha<=90)	alpha =(char)(alpha + 32);	//不知道為甚麼用st.charAt()無法用強制轉型,所以只好設alpha來代替(大寫換成小寫)
				
				for(int j=0; j<32; j++){		//跑全部的規則
					if(rule.charAt(j) == alpha){	
						System.out.print(rule.charAt(j-2));
					}
					if(alpha == space && temp == 0){	//多設一個temp是因為不要一直印出空白,印過一次就不要再印了	
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
