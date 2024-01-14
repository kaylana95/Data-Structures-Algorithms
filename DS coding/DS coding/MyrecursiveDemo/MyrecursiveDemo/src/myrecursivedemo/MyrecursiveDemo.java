/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrecursivedemo;

/**
 *
 * @author Anthony
 */
public class MyrecursiveDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // put this in main method
        System.out.println("Factorial:  Example of recursive function");
        System.out.println("Factorial of 4 is "+myfactorial(4));
        System.out.println("");
      
        
        System.out.println("Exponents:  Example of  recursive function");
        System.out.println("2 power 3 is "+myPower(2,3));
        System.out.println("");
        
        System.out.println("Odd & Even numbers:  Example of double recursive function");
        System.out.println("Is 5 an ODD number:  "+ isOdd(5));
        System.out.println("");
        System.out.println("Try out the examples with different values");

    }
    
    //==============Factorial Example of recursive function ===============
    private static long myfactorial(int n)
    {
    if (n == 1)
    return 1;
    else
    return n * myfactorial(n-1);
    }

    //==============Factorial Example of exponent function ===============
    private static int myPower(int value, int power){
       
    // ===== remember====
    // any number to the power 0 is equal to 1
    
    if(power<0)
    {
        return 1;
    }
    // any number to the power 1 is equal to that number
    // any nubmer to the power n is equal to that number x itself n times.
     return value * myPower(value, power -1) ;
     }
        
        
  

    	    public static boolean isOdd(int n) {

        if (n<0) 
            System.out.print("please don't use number below 0");

        return (n == 0) ? false : isEven(n-1);

    }

   

    public static boolean isEven(int n) {

        if (n<0)
           System.out.print("please don't use number below 0");

        return (n == 0) ? true : isOdd(n-1);

    }
}
