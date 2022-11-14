//Program to read the va;ue of theta from user and that the value of Tan theta is valid or not where -360<=theta<=360; 
package assignmentofjavatheory;



   
  
import java.util.Scanner;

class InvalidValueOfTanThetaException extends Exception{
	double theta;
	InvalidValueOfTanThetaException(double a){
		theta = a;
	}
        @Override
	public String toString(){
		return "InvalidValueOfTanThetaException For this value of theta: "+theta;
	}
}



public class MyExcepEx {

	static void compute(double theta) throws InvalidValueOfTanThetaException {
            
		if(theta==90.00||theta==270.00||theta== -90.00||theta== -270.00)
			throw new InvalidValueOfTanThetaException(theta);
		else 
			System.out.println("Valid");
	}
	
	
	public static void main(String[] args) {
	
		int i;
                double theta;
                System.out.println("Enter the value of theta where -360<=theta<=360 : ");
		Scanner inp = new Scanner(System.in);
		for(i=0;i<5;i++){
		theta = inp.nextDouble();	
		
		try{
		compute(theta);
		}catch(InvalidValueOfTanThetaException e){
			System.out.println("Exception Caught: "+e);
			
		}
		}
		inp.close();
	}
}
