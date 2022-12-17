package marriage;

public class Son implements male {

	@Override
	public void faceColorStructure() {
		System.out.println("RECIEVER");
	}

	@Override
	public void personalityStaminaLength() {
		System.out.println("DONOR");
	}
public void mating() {
	System.out.println("UJVAL CHILD IS BORN");
}
public static void main(String[] args) {
	Son ujval = new Son();
	ujval.faceColorStructure();
	ujval.personalityStaminaLength();
	ujval.mating();
}
}