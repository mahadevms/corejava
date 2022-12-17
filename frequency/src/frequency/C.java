package frequency;

public class C {
public static void main(String[] args) {
	
	String s="asmsfjpkghsmasm";
	char[] array = s.toCharArray();
	int[]temp=new int[array.length];
		int flag=-1;
		for (int i = 0; i < temp.length; i++) {
			int count=1;
			for (int j = i+1; j < temp.length; j++) {
				if (array[i]==array[j]) {
					count++;
					temp[j]=flag;
				}
			}
			if (temp[i]!=flag) {
				temp[i]= count;
				System.out.println(array[i]+"----"+temp[i]);
			}
		}
}
}
