package Lab8.Map;

import java.util.*;

public class EqualArrays {
	
	public static boolean compareArray(ArrayList<Integer> l1 ,ArrayList<Integer> l2) {
		if(l1.size() != l2.size())
			return false;
		Map<Integer,Integer> count= new HashMap<Integer,Integer>();
		for(int i : l1) {
			if(count.containsKey(i)) {
				count.put(i,count.get(i)+1);
			}
			else {
				count.put(i,1);
			}
		}
		System.out.println(count);
		for(int i : l2) {
			if(!count.containsKey(i))
				return false;
			else if(count.get(i)== 0)
				return false;
			else {
				count.put(i,count.get(i)-1);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(3, 5, 2, 5, 2));
		ArrayList<Integer> arr2=new ArrayList<>(Arrays.asList(2, 3, 5, 5, 2));
		boolean ans=compareArray(arr1,arr2);
		System.out.println(ans);
		

	}

}
