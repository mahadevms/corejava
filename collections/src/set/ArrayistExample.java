package set;

import java.util.ArrayList;

public class ArrayistExample {
public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<>();
	al.add(10);
	al.add(5);
	al.add(20);
	al.add(30);
	al.add(40);
	System.out.println(al);
	long ct1 = System.currentTimeMillis();
	al.contains(5);
	al.contains(30);
	al.add(2,50);
	al.contains(40);
	al.remove(5);
	System.out.println(al);
	
	long ct2 = System.currentTimeMillis();
	System.out.println(ct2-ct1);
}
}
