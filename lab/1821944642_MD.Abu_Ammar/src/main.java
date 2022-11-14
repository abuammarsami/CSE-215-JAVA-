
public class main {
    public static void main(String[] args){
        
        Person p1=new Person();
        Student s=new Student();
        Employee e=new Employee();
        Faculty f=new Faculty();
        Staff st =new Staff ();
        
       s.name="Ammar";s.add="dhaka";s.phone_number="01755665";s.email="abcd@gmail.com";s.show();
       System.out.println(s.toString());
       
       f.name="Ammar";f.add="dhaka";f.phone_number="01755665";f.email="abcd@gmail.com";f.show();
       System.out.println(f.toString());
       st.name="Ammar";st.add="dhaka";st.phone_number="01755665";st.email="abcd@gmail.com";st.show();
       System.out.println(st.toString());
        
    }
    
}
