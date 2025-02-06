package Lab8.Map;

import java.util.*;
public class Sort_String_LengthWise {
	public static void main(String args[]) {
		ArrayList<String> str=new ArrayList<>(Arrays.asList("Puneet","Appu","Bhushan"));
		//Collections.sort(str);
		Collections.sort(str,Comparator.comparing(s->s.length()));
		System.out.println(str);
		
		
	}

}
