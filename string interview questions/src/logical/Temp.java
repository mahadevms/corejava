package logical;

public class Temp {
public static void main(String[] args) {
	String s="PANKAJ SIR ACADEMY";
	String[] s2 = s.split(" ");
	for (String w : s2) {
		for (int i =w.length()-1; i >=0; i--) {
			System.out.print(w.charAt(i));
		}
		System.out.print(" ");
	}
}
}
