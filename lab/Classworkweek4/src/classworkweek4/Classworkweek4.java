
package classworkweek4;


public class Classworkweek4 {

   
    public static void main(String[] args) {
      Student[] student= new Student[3];
      int i;
      student[0]=new Student();
      student[1]=new Student();
      student[2]=new Student();
      
      for(i=0;i<student.length;i++)
      {
          student[i].id=i+1;
      }
      for(i=0;i<student.length;i++)
      {
          System.out.println(student[i].id);
      }
      i=0;
       while(i!=3)
    {
        student[i].id=i+1;
        i++;
    }
       i=0;
        while(i!=2)
    {
        System.out.println(student[i].id);
        i++;
    }
        i=0;
        do{
            student[i].id=i+1;
            i++;
        }while(i!=3);
        i=0;
        do{
            System.out.println(student[i].id);
            i++;
        }while(i!=3);
    }
    
   
    
}
