package logical;

public class RemovingPerticularChar {
public static void main(String[] args) {
	String s1="my country is india";
	String s2="";
	for (int i = 0; i <s1.length(); i++) {
		if (s1.charAt(i)!='i') {
			s2=s2+s1.charAt(i);
		} 
	}
	System.out.println(s2);
}
}
