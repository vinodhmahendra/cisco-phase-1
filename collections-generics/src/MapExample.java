import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		Map<String,HashMap<String, String>> maps = new HashMap<String,HashMap<String, String>>();
		map.put("one", "1st");
//		map.put("second", new Integer(2));
		map.put("third", "3rd");
		
		//overwrites the previous assigment
		map.put("third", "III");
		
		Set keys = map.keySet();
		System.out.println(keys);
		
		Collection values = map.values();
		System.out.println(values);
		
		
		Set entrySet= map.entrySet();
		System.out.println(entrySet);
	}

}
