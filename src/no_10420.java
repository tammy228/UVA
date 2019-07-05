import java.util.*;
public class no_10420{		//TreeMap ��HashSet ���|�ۤv�Ƨ�
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Set<String> set = new HashSet<String>();
		String[] st = new String[num];
		for(int i = 0; i< num; i++){
			st[i] = sc.next();
			set.add(st[i]);	//set���s�ۦP���F��,���O�|��null��,���Oset.size()���|�Ҽ{null��
			sc.nextLine();	//�᭱���W�r���κ�
		}
		String[] noDuplicateCountry = set.toArray(new String[num]);		//���F�b�U����equals(),�ҥH�নarray
		int count = 0;
		for(int i=0; i<set.size(); i++){	//�]�����j��,�]���array,
			for(int j=0; j<num; j++){
				if(noDuplicateCountry[i].equals(st[j]))	count++;
				
			}
			System.out.println(noDuplicateCountry[i] + " " + count);
			count = 0;
		}
	}
}

/*	//TreeMap version
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
 
public class u10420 {
 
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
   
  while(input.hasNext()){
   int n = input.nextInt();
    
   Map<String, Integer> conquerList = new TreeMap<String, Integer>();
    
   input.nextLine();// eat change line
    
   while(n > 0){
    String country = input.next();
    String name = input.nextLine();
     
    if(conquerList.containsKey(country)){
     int numOfPeople = conquerList.get(country);
     ++numOfPeople;
     conquerList.put(country, numOfPeople);
    }
    else{
     conquerList.put(country, 1);
    }
     
    --n;
   }
    
   for(Map.Entry<String, Integer> record: conquerList.entrySet()){
    String country = record.getKey();
    int numOfPeople = record.getValue();
     
    System.out.println(country + " " + numOfPeople);
   }
  }
 }
 
} 
*/