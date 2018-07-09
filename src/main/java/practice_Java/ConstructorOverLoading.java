package practice_Java;

public class ConstructorOverLoading {
	int aNum = 100;
	String aName = "Subhra";

	protected ConstructorOverLoading() {

		System.out.println("Constructor is created");
		System.out.println("Default Value is:" + aNum + "  " + aName);

	}

	protected ConstructorOverLoading(int a, String b, Float c) {
		System.out.println("Given Value:" + a + " " + b + " " + c);

	}

	/*private ConstructorOverLoading(int a) {
		System.out.println("Given Value:" + a);

	}

	private ConstructorOverLoading(String a) {
		System.out.println("Given Value:" + a);

	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverLoading co = new ConstructorOverLoading();

	}

}
