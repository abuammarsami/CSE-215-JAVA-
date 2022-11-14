package File;
import java.io.*;
import java.util.*;

public class IntSort {
	
	public static void main(String[] args) throws IOException{
		int array[] = new int [20];
		int i,j,n,temp;
		
		try{
		File fl = new File("D:\\NSU\\Programs\\Data\\Data.txt");
		File flSort = new File("D:\\NSU\\Programs\\Data\\DataSort.txt");
		
		
			Scanner inFile = new Scanner(fl);
			//Formatter outFile = new Formatter(flSort);
			FileWriter outFile = new FileWriter(flSort);
		
		i=0;
		while(inFile.hasNextInt()){
			array[i] = inFile.nextInt();
			i++;
		}
		n=i;
		for(i=0;i<n-1;i++)
			for(j=i+1;j<n;j++)
			{
				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		
		for(i=0;i<n;i++)
			outFile.write(array[i]+"\n");
		
		inFile.close();
		outFile.close();
		
		
		}
		catch(IOException e){
			System.out.println("I/O Error");
		}
	}

}
