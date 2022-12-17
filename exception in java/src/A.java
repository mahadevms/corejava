//Exception class hierarchy
//super most class=Throwable
//under throwable we have  sub classes=1.Error,2.Exception
//in Exception:1.run time exception/unchecked exception=(Arithmetic,NullPointer,NumberFormat,ArrayIndexBounds,ClassCast)
//In exception 2.CompileTime exception/checked exception(FileNotFound,SQL,IO,ClassNotFound,CloneNotSupported)
public class A {
	  static A a2;
	int x=25;
	public static void main(String[] args) {
	
		try {
			System.out.println(a2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
