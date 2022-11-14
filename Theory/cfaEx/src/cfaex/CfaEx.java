
package File;

import java.io.*;
import java.util.Scanner;
import java.util.Formatter;


class Studnt{
	String name;
	int ID;
	double CGPA;
	Studnt(){}
	Studnt(String s,int i,double d){
		name = s;
                /*File file= new File ("data.txt")
                FileOutputStream f= new FileOutputStream(file);
                ObjectOutputStream o =new ObjectOutputStream(f);
                o.writeObject(p1);
                */
                
		ID = i;
		CGPA = d;
	}
}


public class FileRecordSort {
	public static void main(String[] args) throws IOException{
		
		int i,j,n;
		String str;
		Studnt temp;
		Studnt Stu[] = new Studnt[10];
		for(i=0;i<10;i++)
			Stu[i] = new Studnt();
		
		
		try{
			File fileR = new File("D:\\NSU\\Programs\\Data\\Students.txt");
			File fileW = new File("D:\\NSU\\Programs\\Data\\Students_Sort_CGPA.txt");
			
			Scanner inFile = new Scanner (fileR);
			FileWriter outFile = new FileWriter(fileW);
            
			//Stu[0].name = "Dhaka";
        	//System.out.println(Stu[0].name);
            
        	i=0;
           while(inFile.hasNextLine()){
            	Stu[i].name = inFile.nextLine();
            	//System.out.println(Stu[i].name);
            	Stu[i].ID = inFile.nextInt();
            	Stu[i].CGPA = inFile.nextDouble();
            	System.out.println(Stu[i].name+" "+Stu[i].ID+" "+Stu[i].CGPA);
            	if(inFile.hasNextLine())inFile.nextLine();
            	i++;
            	
            }
			n=i;
           for(i=0;i<n-1;i++)
        	   for(j=i+1;j<n;j++)
        	   {
        		   if(Stu[i].CGPA<Stu[j].CGPA)
        		   {
        			   temp = Stu[i];
        			   Stu[i] = Stu[j];
        			   Stu[j] = temp;
        		   }
        	   }
           
         for(i=0;i<n;i++)
        	 outFile.write(Stu[i].name+"\n"+Stu[i].ID+"\n"+Stu[i].CGPA+"\n");
        	 
        	 
		inFile.close();
		outFile.close();
		
		}
			catch(IOException e){
				System.out.println("I/O Error"+e);
			}
		
	
	}

}
