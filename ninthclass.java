import java.util.*;
public class ninthclass {
    // decimal to binary conversion...
    public static String deciTobinary(int decimal){
        int remainder;
        StringBuilder binary = new StringBuilder();
        if(decimal==0){
        return "0";
        }
        while (decimal>0){
            remainder =decimal %2;
            binary.append(remainder);
            decimal =decimal /2;
        }
        return binary.reverse().toString();
    }

    // binary to decimal conversion..
    public static void binarytodeci(String binary){
        int deci = 0  ;
        int power =0;
        for(int i =binary.length()-1; i>=0; i--){
            if(binary.charAt(i)=='1'){
                deci +=(int)Math.pow(2,power);
        

            }
            
            power ++;


        }
         System.out.println(deci);

       
     }








    public static void main(String ars[]){

        //operators...
        // 1=Arithmetic operator
        // Binary -->+,-,*,/,%
        // Unary -->++,--

        // 2=Relational operators --> ==,!=,>,<,>=,<=.

        // 3=logical operators --> &&,||,!.

        // Binary number system..
        //Bitwise operators -->&,|,^,~,<<,>>..
        //Xor --^ = give true when thigs are different and gives false when things are same..
        //Assignment operator -->

        //Bitmanipulation..


        //Get Bit.


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int pos = 2;
        // int bitmask =1<<pos;

        // if((bitmask & n) == 0){
        //     System.out.println("bit was zero");

        // }else{
        //     System.out.println("bit was one");
        // }


    //     //set bit.
    //     int n =5;
    //     int pos =1;
    //     int bitmask =1<<pos;
    //    int number = bitmask | n;
    //         System.out.println(number); // 7

    // clear bit.
    // int n = 5;
    // int pos =2;
    // int bitmask = 1<<pos;
    // int notbit=~(bitmask);
    // int newbit=notbit & n;
    // System.out.println(newbit); // 1

    // update bit..
    //for 1. -- similar to set and for 0. --similar to clear bit.
   // Scanner sc =new Scanner (System.in);
//     int oper = sc.nextInt();
//     int n =5;// 0101 ->0111 ->dec 7
//     int pos =1;
//     int bitmask =1<<pos;
//     if(oper ==1){
//     int updatedbit =(bitmask | n);
//     System.out.println(updatedbit);
// }else{
//     int newbitmask=~(bitmask);
//      int newbit=newbitmask & n ;
//      System.out.println(newbit); // 1
// }

//questions --> 1
// Write a program to find if a number is a power of 2or not ..
// int num = sc.nextInt();
// if (num>0 && (num&(num-1))==0){ // (num&(num-1)) --- it use to convert first rigth most 1 bit iinto 0 and all other of its left side remain same..
//     System.out.println("yes num is the power of two:"+num);
// }else{
//     System.out.println(" No num is  not the power of two:"+ num);
// }
    
//questions --> 2
//write  a program to toggle a bit a position = "pos",in a number "n".
// int n =5; //0101
// int pos = 1;
// int bitmask =1<<pos;
// int newnumber =bitmask | n;
// System.out.println(newnumber);

//questions --> 3
// write a program to count the number of 1's in a binary representation of the numbe


//decimal to binary..
System.out.println("here's the conver od decimal to binary of decimal number:" + deciTobinary(13));
 binarytodeci("1011");     



    }
    
}
