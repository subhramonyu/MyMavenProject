package practice_Java;

public  class Student1  implements School{
	
	void display() {
		System.out.println("Display Student1");
	}
	
	
	public static void main(String[] args) {
		
		//Student1 s1 = new Student();
		Student1 s= new Student1();
		
		s.display();
		
	}


	@Override
	public void A() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void B() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void C() {
		// TODO Auto-generated method stub
		
	}


	

	
}