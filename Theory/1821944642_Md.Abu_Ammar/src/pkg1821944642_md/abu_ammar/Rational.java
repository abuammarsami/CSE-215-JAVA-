/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1821944642_md.abu_ammar;


public class Rational {
    
    public long n, d;
    
    
    Rational(long n,long d) {
        this.n=n;
        this.d=d;
        
    }
    public long getN(){
        return n;
    }
    public long getD(){
        return d;
    }
    public double add(){
        return (n+(n/d));
    }
    public double subtract(){
        return (n-(n/d));
    }
    public double multiply(){
        return (n*n/d);
    }
    public double devide(){
        return (n/(n/d));
    }
    public double gcd(){
        return (n/d);
    }
    
   
 /*public String toString {
    return ("Numeretor"+n +"Demomitor"+d);
}*/
   
    
}
