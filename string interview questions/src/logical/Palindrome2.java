package logical;

public class Palindrome2 {
public static void main(String[] args) {
	String s1="121";
	String temp="";
	for (int i = s1.length()-1; i >=0; i--) {
		temp=temp+s1.charAt(i);
	}
	if (s1.equals(temp)) {
		System.out.println("palindrome");
	} else {
		System.out.println("not a palindrome");
	}
}
}
