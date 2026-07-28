import java.util.*;
public class fifthclass{
    // Function..
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // make a function to add two numbers and return the sum..
    // public static int sum(int a, int b){
    //     return a+b;
    // }


    //make a function to multiple two numbers and returen the product..
    // public static int product(int a,int b){
    //     return a*b;
    // }

    // make a function to calculate the factorial on any number..
    // public static void factorial(int n){
    //     if(n<0){
    //         System.out.println("Invalid number..");
    //         return;
    //     }
    //      int Factorial = 1;
    //     for(int i=n; i>=1; i--){
    //         Factorial *=i;
    //     }
    //      System.out.println(Factorial);

    // }


    

    //1-- make a fuction to calculate the average of three numbers..

    // public static int calaverage(int a,int b ,int c){
    //     return((a+b+c)/3);
    // }


    // 2--make a function to calculate the sum of all odd number from 1 to n..
    
    // public static void sumOfOdd(int n){
    //     int sum =0;
    //     for(int i=1; i<=n; i++){
    //         if(i%2!=0){
    //             sum +=i;
    //         }
    //     }
    //     System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);
    //     return;

    // }

    //3-- make a function which takes two numbers and return the greater one..

    // public static void greaterNumber(int a,int b){
    //     if(a>b){
    //         System.out.println(a +" is greater number the " + b);
    //     }else if (b>a){
    //         System.out.println(b +" is greater number than " + a);
    //     }else{
    //         System.out.println(" Numbers are equal..");
    //     }

    // }


    // 4-- make a function to check whether a number is prime or not..
    // public static void checkPrime(int a){
    //     if (a<=1){
    //         System.out.println("A is not a prime number.");
    //         return;
    //     }
    //     for(int i= 2; i<a; i++){
    //         if (a%i==0){
    //             System.out.println("A is not a prime number.");
    //             return;
    //         }
    //     }
    //     System.out.println("A is prime number:"+a);


    //  }


   // 5-- Write a function that takes in the radius as input and return th circumference of circle..
    //   public static Double Circumference(int r){
    //     Double circumference =2*Math.PI*r;
    //     System.out.println("The circumference of circle is:"+circumference);
    //     return circumference;
        

    //   }


    // 6-- Write a function to check a person is eligible to vote or not..
    // public static  void vote(int age){
    //     if(age<18){
    //         System.out.println("you are not eligible to vote:"+age);
    //     }else{
    //         System.out.println("you are eligible to vote:"+age);
    //     }
    // }

   
   //7--write an infinte loop using do while conditon.

   //    public static void str(){
   //    public static void str(){
   //     do{
   //         System.out.println("hello");    
   //     }
   //     while(true);
       
   //    }
   
   
   //8--write the program to eanter the number until user wants and at the end it should
   //  display the coutn of positiv numbers and and negative numbers and zeros entered..

//    public static void count(){
//     Scanner sc =new Scanner(System.in);
//       int count_positive=0;
//       int count_negative=0;
//       int count_zeros=0;
//       while(true){
//         System.out.println("Enter the number:");
//         int num =sc.nextInt();
//         if(num>0){
//             count_positive +=1;
//         }
//         else if(num<0){
//             count_negative +=1;

//         }
//         else{
//             count_zeros +=1;
        
//         }
     
//      System.out.println("Do you want ot continue .?(Yes/No):");
//      String ch =sc .next();
//      if(ch.equals("No")){
//         break;
//      }
//  }
//     System.out.println("Count of positive numbers:"+count_positive);
//     System.out.println("Count of negative numbers:"+count_negative);
//     System.out.println("Count of zeros:"+count_zeros);
       
//    }
        


//9--Two numberr entered by user x and n . write a function to find the value of one number raised by another i .e x**n

// public static int power(int x,int n){
//     int value = 1;
//     for(int i =1 ;i<=n; i++){
//         value *=x;
//     }
//     return value;
// }
    
//10--write a function that calculates the common divisor of 2 numbers..

// public static int gcd(int a,int b){
//     int gcd =1;
//     for(int i =1; i<=a &&i<=b; i++){
//         if(a%i==0 && b%i==0){
//         gcd =i;
//         }

//     }
//     return gcd;
// }


//11--write a program to pritn the fabinacci series of n term where n is the input by user:

public static void fabinacci(int n){
    int a =0, b=1;
    for(int i =1; i<=n; i++){
        System.out.print(a);
        int c =a+b;
        a=b;
        b=c;

    }

}


    

    public static void main(String []args){
        // Function calling..
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name= sc.nextLine();
        // printMyName(name);

        // Scanner sc = new Scanner(System.in);
        // int a = sc . nextInt();
        // int b = sc . nextInt();
        // System.out .println("the sum of two number is:" +sum(a,b));

        // Scanner sc =new Scanner(System.in);
        // int a = sc.nextInt();
        // int b =sc .nextInt();
        // System.out.println("the product of two numbers is:" + product(a,b));


        // Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        // factorial(n);

        // Scanner sc = new Scanner(System.in);
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // int c= sc.nextInt();
        // System.out.println("the average of three numbe is: " +calaverage(a,b,c));

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sumOfOdd(n);

        // Scanner sc =new Scanner(System.in);
        // int a =sc.nextInt();
        // int b =sc.nextInt();
        // greaterNumber(a,b);

        // Scanner sc =new Scanner(System.in);
        // int a = sc.nextInt();
        // checkPrime(a);


        // Scanner sc = new Scanner(System.in);
        // int r = sc.nextInt();
        // Circumference(r);

        //   Scanner sc = new Scanner(System.in);
        //   int age = sc.nextInt();
        //   vote(age);

    
        // str();

    
        //   count();

    //     Scanner sc =new Scanner (System.in);
    //     int x = sc.nextInt();
    //     int n=sc.nextInt();
    //    System.out.println("the value of n to the power of x:"+power(x,n));


    // Scanner sc =new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // System.out.println("thhe common divisor of"+" " + a +" "+ "and" +" "+  b +" "+ "is:"+gcd(a,b));
    

       Scanner sc =new Scanner(System.in);
       int n =sc.nextInt();
       fabinacci(n);




        




         //sc.close();
    }
}