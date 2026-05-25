import java.util.*;
public class Thirdclass {
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
    // Loops..
    // for loop..

    // progrramme to print "hello" 3 times.
    // for(int i=0; i<3; i++ ){
    //     System.out.println("hello");
   // }
    // print the number 0 to 10.. by for loop
    // for(int i =0; i<11; i++){
    //     System.out.print(i);
    // }

     // print the number 0 to 10.. by while loop
    // while loop..
    // int i= 0;
    // while( i<11){
    //     System.out.print(i);
    //     i++;
    // }
    
    // do while loops..
    // int i = 0;
    // do{
    //     System.out.println(i);
    //     i++;
    // }while(i<11);
    
    // print the sum of n natural numbers..
   
    // int n = sc.nextInt();
    // int sum = 0;
    // for(int i=1; i<=n; i++){
    //     sum +=i;
    // }
    // System.out.println(sum);

    // print table of a number..
    int number = sc.nextInt();
    for(int i =1; i<=10; i++){
        System.out.println(number*i);
    }
    sc.close();

    }
}
