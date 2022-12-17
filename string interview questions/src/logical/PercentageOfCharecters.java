package logical;

public class PercentageOfCharecters {
public static void main(String[] args) {
	String s1="helloA A AF this125 is mahadev";
	Float lower=(float) 0.0;
	Float upper=(float) 0.0;
	Float digits=(float) 0.0;
	Float remaining=(float) 0.0;
	for (int i = 0; i < s1.length(); i++) {
		char ch = s1.charAt(i);
		if (Character.isUpperCase(ch)) {
			 upper++;
		}else if (Character.isLowerCase(ch)) {
			lower++;
		}else if(Character.isDigit(ch)) {
			digits++;
		}else {
			
			remaining++;
		}
	}
	System.out.println("% of uppercase="+upper*100/s1.length());
	System.out.println("% of lowercase="+lower*100/s1.length());
	System.out.println("% of digits="+digits*100/s1.length());
	System.out.println("% of remaining="+remaining*100/s1.length());


}
		
	
}

