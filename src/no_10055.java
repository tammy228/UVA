import java.util.*;
public class no_10055 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long Hashmet = sc.nextLong();
			long opponent = sc.nextLong();
			System.out.println(Math.abs(opponent - Hashmet));
		}
	}
}
