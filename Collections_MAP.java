import java.util.*;
import java.util.Map;
public class Collections_MAP {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a1234", "Steve Jobs");
		map.put("a1235", "Scott McNealy");
		map.put("a1236", "Jeff Bezos");
		map.put("a1237", "Larry Ellison");
		map.put("a1238", "Bill Gates");
		System.out.println(map.values());
		map.replace("a1234", "Josh");
		System.out.println(map.values());
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext())
		{
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}

}
