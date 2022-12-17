package logical;

public class RevesingOfSpecificWord {
public static void main(String[] args) {
	String s1="hello this is mahadev";
	String key="mahadev";
	String[] s3 = s1.split(" ");
	String temp="";
	for (int i = 0; i < s3.length; i++) {
		if (s3[i].equals(key)) {
			for (int j =s3[i].length()-1; j >=0 ; j--) {
				temp=temp+s3[i].charAt(j);
			}
		}
	}
	s3[3]=temp;
	//System.out.println(s3[1]+" "+s3[2]+" "+s3[3]+" ");
	for (String s : s3) {
		System.out.print(s+" ");
	}
	}
}

