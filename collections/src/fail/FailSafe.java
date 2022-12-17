package fail;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {
public static void main(String[] args) {
HashMap<Integer,String>students=new HashMap<Integer,String>();
	students.put(100, "ruby");
	students.put(102, "kochi");
	students.put(103, "hakuna");
	students.put(104, "bass");
	
	ConcurrentHashMap<Integer, String>copy=new ConcurrentHashMap<>(students);
	Iterator<Integer> iterator = copy.keySet().iterator();
	while (iterator.hasNext()) {
		System.out.println(copy.get(iterator.next()));
		copy.put(105, "scar");
		copy.putIfAbsent(106, "hello");
	}
}


}
