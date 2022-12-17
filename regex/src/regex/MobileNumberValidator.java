package regex;
import java.util.Scanner;
public class MobileNumberValidator{
public static void main(String[]args){
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("enter mobile number:");
String s=sc.next();
String regex="[6-9][0-9]{9}";
if(s.matches(regex)){
System.out.println("valid");
}else{
System.out.println("invalid");
}
}

}
