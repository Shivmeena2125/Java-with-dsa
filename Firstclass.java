import java.util.*;
class Firstclass{
    public static void main(String arg[]){
        //output
        System.out.println("hello world with java");
        // print the pattern , right angle triangle by stars..
        // System.out.println("*\n**\n***\n****\n");
        // variables..
        // String name= "shiv";
        // int a=122;
        // int b= 8;
        // int sum = a+b;
        // System.out.println(name);
        // System.out.println(sum);
        // int a= 10;
        // int b = 5;
        // int ans = (a*b)/(a-b);
        // System.out.println(ans);//10
        // input..
        // Scanner sc = new Scanner (System.in);
        // String name =sc.nextLine();
        // System.out.println(name);

        // take two input number from user and print sum of them.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+ num2;
        System.out.println(sum);
        
        sc.close();
    }
}