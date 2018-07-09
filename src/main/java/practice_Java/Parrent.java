package practice_Java;

public class Parrent {
	int aNum=10;
	String aName="SU";
	void Display() {
		System.out.println(aName+" "+aNum);
		
	}
	public static void reverse() {
		String str = "I use selenium webdriver. selenium is a tool for web applications.";
		int i = str.length();
		StringBuffer strb = new StringBuffer();
		for( int j=i-1; j>=0; j--){
		strb = strb.append(str.charAt(j));
		}
		System.out.println(strb);
		}
	public static void replace() {
		String str = "I use selenium webdriver. selenium is a tool for web applications automation.";
		String toBeReplaced = "selenium";
		String toReplacedWith = "Firefox";
		String[] astr = str.split(toBeReplaced);
		StringBuffer strb = new StringBuffer();
		for ( int i = 0; i <= astr.length - 1; i++ ) {
		strb = strb.append( astr[i] );
		if (i != astr.length - 1) {
		strb = strb.append(toReplacedWith);
		}
		}
		System.out.println(strb);

		}
	public static void main(String[] args) {
		
		
		String old="hello my world";
		String[] str =old.split("my");
		System.out.println(str[1]);
		//String reverse=new StringBuilder(old).reverse().toString();
		//System.out.println(reverse);
		//boolean bValue=old.equalsIgnoreCase("Hello");
		for(int i =0;i<=str.length-1;i++) {
		System.out.println(str[i]+ "-------------------");}
		//reverse();
		replace();
	}

}
