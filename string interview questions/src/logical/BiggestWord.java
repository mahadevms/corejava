package logical;

public class BiggestWord {
public static void main(String[] args) {
	String s1="hey i am  for you ";
	String[] s2 = s1.split(" ");
     String temp="";
     String temp2="";
     System.out.println("equal words:");
	for (int i = 0; i < s2.length; i++) {
		if (s2[i].length()>temp.length()) {
			temp=s2[i];
		}else if (s2[i].length()==temp.length()) {
			temp2=s2[i];
			System.out.println(temp2);
		}else {
			temp2="null";
		}
	
	}
	System.out.println("biggest word="+temp);
	System.out.println();
	
	
}


}
