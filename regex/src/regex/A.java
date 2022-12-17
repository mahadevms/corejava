package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A{

public static void main(String[]args){
Pattern p=Pattern.compile("");
Matcher m=p.matcher("A a 6Bb K8JJ 897 #$63 %5^ 8% @1*");
while(m.find()){
System.out.println(m.start()+".."+m.group());

}


}
}