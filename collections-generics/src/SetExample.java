import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("second");
		set.add("3rd");
//		set.add(new Integer(4));
//		set.add(new Float(3.4F));
		
		set.add("second"); // duplicate , not added
//		set.add(new Integer(4)); // duplicate , not added
		
		System.out.println(set);
	}

}
