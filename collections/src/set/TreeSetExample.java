package set;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer>ts=new TreeSet<>();
ts.add(10);ts.add(30);ts.add(40);ts.add(5);ts.add(20);ts.add(20);
System.out.println(ts);
	long ct1 = System.currentTimeMillis();
	ts.contains(5);
	ts.contains(10);
	ts.contains(20);
	ts.contains(30);
	ts.remove(40);
	ts.contains(40);
	ts.subSet(10, 40);
	
	long ct2 = System.currentTimeMillis();
	System.out.println(ct2-ct1);
	}
}
