package fail;

import java.util.HashMap;
import java.util.Iterator;

public class FailFast {
public static void main(String[] args) {
	HashMap<Integer, String>student=new HashMap<>();
	student.put(101, "ruby");
	student.put(105, "saram");
	student.put(228, "saram");
	student.put(104, "hello");
	student.put(102, "hello");
	System.out.println(student);
 Iterator<Integer> it = student.keySet().iterator();
 while (it.hasNext()) {
	System.out.println(student.get(it.next()));
	student.put(108, "kasliwal");
	
}
}
}
