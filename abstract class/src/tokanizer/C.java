package tokanizer;

public class C {
	
	int hello=400;
	
	@Deprecated
	public void seekById() { 
	System.out.println("i am searching for Id");	
	}
	public void searchById() {
		System.out.println("i am searching for Id");	
		}
public static void main(String[] args) {
	C c1=new C();
	c1.seekById();
	c1.searchById();
	System.out.println(c1.hello);
}

}
