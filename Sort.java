
import java.util.*; 

public class Sort 
{ 
	public static void main(String[] args) 
	{ 
	 
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		al.add(1); 
		al.add(5); 
		al.add(2); 
		al.add(4); 
		al.add(3); 
		
		Collections.sort(al); 

		System.out.println("List after the use of" + 
						" Collection.sort() :\n" + al); 
	} 
} 
