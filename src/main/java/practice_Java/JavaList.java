package practice_Java;


import java.util.ArrayList;
import java.util.List;

public class JavaList {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> records = new ArrayList<String>();
		
		records.add("arshi");
		records.add("subhro");
		records.add("rohit");
		records.add("maaz");
		
		for (int i =0 ; i< records.size() ; i++ ) {
			System.out.println(records.get(i));
			
			
		}
		System.out.println(records.size());
		


	}

}
