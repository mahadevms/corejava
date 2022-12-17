package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobNoValid{
public static void main(String[]args){
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter your mob number:");
String str=sc.next();
Pattern p=Pattern.compile("[6-9][0-9]{9}");
Matcher m=p.matcher(str);
while(m.find()){
count++;
}
if(count!=0 && str.length()==10){
System.out.println("accepted");
}else{
System.out.println("invalid");
}
}
}