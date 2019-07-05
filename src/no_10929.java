import java.math.BigInteger;
import java.util.*;
public class no_10929 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger bg = sc.nextBigInteger();	//有1000位數要用BigInteger存
		BigInteger eleven = new BigInteger("11");
		while(bg.intValue() != 0){
			if(bg.mod(eleven).intValue() == 0) System.out.println(bg + " is a multiple of 11.");	//加減乘除都要用BigInteger的方法去算
			else System.out.println(bg + " is not a multiple of 11.");
			bg =sc.nextBigInteger();
		}
	}
}
