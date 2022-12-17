package practice_folder;

public class A {

	int x=10;
	void test() {
		System.out.println("from test");
	}
	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1.x);
		A a1=new A();
		System.out.println(a1.x);
		a1.test();
		System.out.println(B.y);
		B.hi();
	}
	}


