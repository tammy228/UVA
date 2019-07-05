import java.util.*;
public class no_10008 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max=0;
		int num = sc.nextInt();	
		sc.nextLine();		//奔计传︽
		String st = new String();
		int[] counting = new int[26];
		
		for(int i=0; i<num; i++){
			st = sc.nextLine();
			st = st.toUpperCase();		//场锣Θ糶
			for(int j=0; j<st.length(); j++){		//安琌ざA~Zぇ丁碞рウ秈int皚柑
				if(st.charAt(j)>=65 && st.charAt(j)<=90){
					counting[st.charAt(j)-65] ++;		//ノascii暗index锣传
				}
			}
		}
		for(int i=0; i<26; i++){	//тダ瞷程Ω
			if(counting[i] > max) max = counting[i];
		}
		for(int i=max; i>0; i--){		//眖瞷程Ωダ秨﹍
			for(int j=0; j<26; j++){	//皚眖程玡秨﹍禲,┮碞衡瞷Ω计妓,alphabetical order
				if(counting[j] == i)	System.out.println((char)(j+65) + " " + i);		//ノ眏锣ダ
			}
		}
	}
}
