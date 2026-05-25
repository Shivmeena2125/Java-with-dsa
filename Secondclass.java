import java.util.*;
public class Secondclass {
    public static void main(String arg[]){
    //Condititonal statements...

    Scanner sc = new Scanner(System.in);
    // int age = sc.nextInt();
    // if(age>18){
    //     System.out.println("adult");
    // }
    // else{
    //     System.out.println("not Adult");
    // }

    // check number is odd or even..
    // int num =sc.nextInt();
    // if (num%2==0){
    //     System.out.println("even");
    // }
    // else{
    //     System.out.println("odd");
    // }

    // check these conditions and print the solution..
    // int num1 = sc.nextInt();
    // int num2 = sc.nextInt();
    // if(num1==num2){
    //     System.out.println("equal");
    // }
    // else if(num1>num2){
    //     System.out.println("num1 is greater ");
    // }
    // else{
    //     System.out.println("num1 is lesser");
    // }


     int buttom =sc.nextInt();
    // if(buttom==1){
    //    System.out.println("Namastey");
    // }
    // else if(buttom==2){
    //     System.out.println("hello");
    // }
    // else if(buttom==3){
    //     System.out.println("bonjour");
    // }
    // else{
    //     System.out.println("invalid buttom..");
    // }
       
    //Switch..
    switch(buttom){
    case 1: System.out.println("Namastey");
    break;
    case 2:System.out.println("hello"); 
    break;
    case 3:System.out.println("Bonjour");  
    break;
    default:System.out.println("invalid");                     
    }
    sc.close();
    }
}
