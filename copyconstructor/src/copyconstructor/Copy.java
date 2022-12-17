package copyconstructor;

public class Copy {
private String name;
private int id;
public Copy(String name,int id) {
	this.id=id;
	this.name=name;
}
Copy(Copy student){
	student.id=this.id;
	student.name=this.name;
}
public void display() {
	System.out.println(this.id);
	System.out.println(this.name);
}
public static void main(String[] args) {
	Copy c1=new Copy("hello",12);
	Copy student=new Copy(c1);
	c1.display();
	student.display();
}
}
