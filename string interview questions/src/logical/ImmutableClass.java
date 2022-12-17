package logical;

final public class ImmutableClass {
private final String s;
private final int i;
public ImmutableClass(String s,int i) {
	this.s = s;
     this.i=i;
}
public String getS() {
	return s;
}
public int getI() {
	return i;
}

}
