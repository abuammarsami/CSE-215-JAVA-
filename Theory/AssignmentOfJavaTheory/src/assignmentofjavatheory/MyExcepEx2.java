//2.Program to show that the entered cgpa is valid or invalid;
package assignmentofjavatheory;
   
  
import java.util.Scanner;

class InvalidCGPAException extends Exception{
	double cgpa;
	InvalidCGPAException(double a){
		cgpa = a;
	}
        @Override
	public String toString(){
		return "InvalidCGPAException: "+cgpa;
	}
}



public class MyExcepEx2 {

	static void compute(double cgpa) throws InvalidCGPAException {
            
		if(cgpa < 0.00 || cgpa > 4.00)
			throw new InvalidCGPAException(cgpa);
		else 
			System.out.println("Valid");
	}
	
	
	public static void main(String[] args) {
	
		int i;
                double cgpa;
                System.out.println("Enter the CGPA : ");
		Scanner inp = new Scanner(System.in);
		for(i=0;i<5;i++){
		cgpa = inp.nextDouble();	
		
		try{
		compute(cgpa);
		}catch(InvalidCGPAException e){
			System.out.println("Exception Caught: "+e);
			
		}
		}
		inp.close();
	}
}
