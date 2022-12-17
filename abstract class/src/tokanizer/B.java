package tokanizer;

public class B implements Cloneable {

	public static void main(String[] args) {
		B a1=new B();
		try {
			B a2=(B)a1.clone();
			System.out.println(a2);
			System.out.println(a1);
			System.out.println();
		} catch (CloneNotSupportedException e) {
 			e.printStackTrace();
		}
		
	}
}
