package regex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class NameValidator{
public static void main(String[]args){
int count=0;
try (Scanner sc = new Scanner(System.in)) {
	System.out.println("enter your name:");
	String str=sc.next();
	Pattern p=Pattern.compile("[^a-zA-Z]");
	Matcher m=p.matcher(str);
	while(m.find()){
	count++;
	}
}
if(count!=0){
System.out.println("invalid name");
}else{
System.out.println("input accepted");
}




}








}