package practice_Java;
public class Person {
	
    public Person(){
    	System.out.println("THis is constructor");
    }
    
    static {System.out.println("Ststic data");}
    
    public static void main(String[] args) {
    	new Person();
    }
}

