import java.util.*;
public class no_272{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String st;
		int count=0;
		while(sc.hasNext()){
			st = sc.nextLine();
			for(int i=0; i<st.length(); i++){
				if(st.charAt(i) == '\"' && count == 0){
					System.out.print("``");
					count = 1;
				}else if(st.charAt(i) == '\"' && count == 1){
					System.out.print("''");
					count = 0;
				}else	System.out.print(st.charAt(i));
			}
			System.out.println();
		}
	}
}