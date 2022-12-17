package logical;

import java.util.Scanner;

public class Frequency {

@SuppressWarnings("unused")
public static void main(String[] args) {
	int x=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of strings");
	int count=sc.nextInt();
String[] s1=new String[count];
Scanner sc2=new Scanner(System.in);
System.out.println("enter name of strings");
for (String s : s1) {
	s1[x++]=sc2.next();
}
for (int i = 0; i < s1.length; i++) {
	
	for (int j = 0; j < s1.length-1; j++) {
		if ((s1[j].compareTo(s1[j+1])>0)) {
			String temp=s1[j];
			s1[j]=s1[j+1];
			s1[j+1]=temp;
		}
	}
	
}
for (String string : s1) {
	System.out.println(string);
}
sc.close();
sc2.close();
	}

}
