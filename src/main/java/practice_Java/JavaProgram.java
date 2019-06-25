package practice_Java;

import java.util.Scanner;

public class JavaProgram {

	int a =10;
	
	
	public static void printNumberpattern(int NoOfRows) {
		for (int i = 1; i <= NoOfRows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void bothsidePattern(int NoOfRows) {

		int space = NoOfRows - 1;
		for (int i = 1; i <= NoOfRows; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			space--;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}

	}
	
	public Object[] getData(){
		
		return null;
		
	}
	
	public static void addTwoNumberwithoutAddSign(int num1 , int num2) {
		/*for (int i=1 ;i <= num2 ; i++ ) {
			num1++;
		}*/
		
		while(num2>=1) {
			num1++;
			num2--;
			
		}
		System.out.println(num1);
	}
	
	public static boolean checkEvenNumber(int num) {
		boolean[] a = {true , false};
		
		return a[num%2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//bothsidePattern(5);
		//addTwoNumberwithoutAddSign(10, 12);
		
		System.out.println();
	}

}
