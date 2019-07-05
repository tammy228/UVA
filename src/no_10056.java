import java.util.*;
public class no_10056{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int people,target;
		double round = 100000;
		double p,ans,q;
		for(int i=0; i<cases; i++){
			people = sc.nextInt();
			p = sc.nextDouble();
			target = sc.nextInt();
			if(p == 0.0){	
				System.out.println("0.0000");
				continue;
			}
			q = 1 - p;
			ans = Math.pow(q, target-1)*p*(1 - Math.pow(Math.pow(q,people),round))/( 1-Math.pow(q,people));
			System.out.printf("%.4f",ans);
			System.out.println();
		}
	}
}