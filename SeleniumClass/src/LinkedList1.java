import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class LinkedList1 {

	public static void main(String[] args) {
		List li;
		li=new ArrayList<>();
		li.add(1000);
		li.add("Raghu");
		li.add(true);
		li.add(1000);
		li.add("Raghu");
		li.add(true);
		System.out.println(li);
		li = new LinkedList<>();
		li.add(2000);
		li.add("Rami");
		li.add(false);
		li.add(2000);
		li.add("Rami");
		li.add(false);
		System.out.println(li);
		
		li=new Vector<>();
		li.add(3000);
		li.add("Reddy");
		li.add(true);
		li.add(3000);
		li.add("Reddy");
		li.add(true);
		System.out.println(li);
		
		Set set;
		set = new HashSet<>();
		set.add(1000);
		set.add(3000);
		set.add(500);
		set.add(5000);
		set.add(1000);
		set.add(3000);
		set.add(500);
		set.add(5000);
System.out.println(set);		
		
		set = new LinkedHashSet<>();
		set.add(1000);
		set.add(3000);
		set.add(500);
		set.add(5000);
		
		System.out.println(set);		
		set = new TreeSet<>();
		set.add(1000);
		set.add(3000);
		set.add(500);
		set.add(5000);
		System.out.println(set);	
	}

}
