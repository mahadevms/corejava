package logical;

public class CountWords {

	public static void main(String[] args) {
String str=" pankaj sir academy";//whenever u give space at first it shows wrong length
String[] x = str.split(" ");
System.out.println(x.length);
for (String s : x) {
	System.out.println(s);
}
	}

}
