package practice_Java;

public class MaxNumber {
	
	//we are creating a method to get max number
	//We are passing an array integer (int[] numberArray)as parameter to this method from which we will find the max number
	public static int getMaxNumber(int[] numberArray){ 
		
		//temp is temporary variable to store intermidiate number
		int temp;  
		
		//this for loop is to compare the first elements with the rest of the elements of the array
		for (int i = 0; i < numberArray.length; i++)   
		        {  
			
			//this for for will compare the first element with 2nd ,3rd and so on
		            for (int j = i + 1; j <  numberArray.length; j++)   
		            {  
		            	//heres we are doing comparision
		                if (numberArray[i] > numberArray[j])   
		                {  
		                	
		                	//then storing the number in the temp
		                    temp = numberArray[i];  
		                    //then largest number will shift to numberArray[i]
		                    numberArray[i] = numberArray[j];  
		                    numberArray[j] = temp;  
		                }  
		            }  
		        }  
		//
		       return numberArray[numberArray.length-2];  
		}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,7,6,10,12};  
		int b[]={22,76,45,80,10,19,89};  
		System.out.println("Largest: "+getMaxNumber(a));  
		System.out.println("Largest: "+getMaxNumber(b));  
		
	}
}
