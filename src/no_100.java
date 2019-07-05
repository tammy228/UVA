import java.util.*;
public class no_100{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 1,temp3 = 0;
		while(sc.hasNext()){
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int temp1 = num1;	//temp1 跟 temp2 用來當作最後的列印, 防止num2比num1小
			int temp2 = num2;
			List<Integer> array = new ArrayList();	//純粹想秀,可以用int代替,使用max每找到更大的值就存進去
			if(num1 > num2){	temp3 = num1; num1 = num2; num2 = temp3;}
			for(; num1<=num2; num1++){	//找出num1 ~ num2 的所有解
				int temp = num1;
				count = 1;
				while(temp != 1){	//題目給的解法
					if(temp % 2 != 0)	temp = (3*temp)+1;
					else temp /= 2;
					count ++;
				}
				array.add(count);	//arraylist的好處是不用決定陣列長度大小
			}
			array.sort(null);	//sort()裡面放 null就是由大排到小
			System.out.println(temp1 + " " + temp2 + " " + array.get(array.size() - 1));	//取arraylist 的值要用get()
		}
	}
}

