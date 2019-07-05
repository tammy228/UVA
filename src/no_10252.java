import java.util.*;
public class no_10252{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String st1,st2;
		int[] alpha1 = new int[26];
		int[] alpha2 = new int[26];
		while(sc.hasNext()){
			st1 = sc.nextLine();
			st2 = sc.nextLine();
			Arrays.fill(alpha1,0);
			Arrays.fill(alpha2,0);
			for(int i=0; i<st1.length(); i++){
				if(st1.charAt(i)>= 97 && st1.charAt(i)<=125)	alpha1[st1.charAt(i)-97]++;
			}
			for(int i=0; i<st2.length(); i++){
					if(st2.charAt(i)>= 97 && st2.charAt(i)<=125)	alpha2[st2.charAt(i)-97]++;
			}
			for(int i=0; i<26; i++){
				int min = Math.min(alpha1[i],alpha2[i]);
				if(min != 0){
					for(int j=0; j<min; j++){
						System.out.print((char)(i+97));
					}
				}
			}
			System.out.println();
		}
	}
}