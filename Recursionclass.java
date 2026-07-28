import java.util.*;
public class Recursionclass {

    // Recursion prerequistes.
    //1-Iteratioin /loops.
    //2-Functions.
    //Iteration and recursion are similar but different.
    //both can work same work but ,wee have decide which one is the best for which case.
    //each step stored in stack in sequence.


    // print numbers 5 to 1.
    public static void printnumbers(int n ){
        if (n==0){// base casee
            return;
        }
        System.out.println(n); // print step -1
        printnumbers(n-1); //recursion.
    }


    //print the number from 1 to 5.
    public static void number(int n ){
        if(n==6){
            return;
        }
        System.out.println(n);
        number(n+1);
    }

    //print sum of n natural numbers.
    public static void printsum(int i,int n,int sum){
        if(i==n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printsum(i+1,n,sum);
    }
    

     //print the factorial on number n. = fact of n = n*(n-1)
     public static int printfact(int n){
        if(n==1 || n==0){
            return 1;
        }
       int fact_of_nm1 = printfact(n-1);
       int fact_n = n*(fact_of_nm1);
       return fact_n;
     }


    //print the fibonacci sequence till nth term*.
    public static void printfibonacci(int a,int b,int n ){
       if(n==0){
         return ;
       }
       int c = a+b;
       System.out.println(c);
    printfibonacci(b,c,n-1);
    }


/*print the x^n where stack height = n.
public static int printxn(int x, int n){
    if( n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }
    int x_nm1= printxn(x,n-1);
    int x_to_the_pn =x* x_nm1;
    return x_to_the_pn ;
    
}*/


//print x^n where stack height is the logn.
public static int printxn(int x ,int n){
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }
    // if n is even number
    if(n%2==0){
        return printxn(x,n/2) * printxn(x,n/2) ;
    // if n is odd number
    }else{
        return printxn(x,n/2) * printxn(x,n/2) * x;
    }
}

  


    public static void main(String [] args){
        //printnumbers(5);

        //number(1);

        //printsum(1,10,0);
        

        /*factrorial of n
        int n =5;
        int ans = printfact(n);
        System.out.println(ans);*/


        /*fibonaccci series
        int a =0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        int n =7;
        printfibonacci(a,b,n-2);*/

        /* x^n where stack height is n
        System.out.println(printxn(2,3));
        */


        //x^n where stack height is logn 
        //System.out.println(printxn(2,3));
        
    



        


    }

    
}