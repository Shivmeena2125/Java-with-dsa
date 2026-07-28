import java.util.*;
public class sixthclass{   
public static void main(String args[]){
    // Array..

    // int [] marks =new int[3];
    // marks[0]= 97;  // phy
    // marks[1]= 89;  // che
    // marks[2]= 78;  //eng
    // // System.out.println(marks[0]);
    // // System.out.println(marks[1]);
    // // System.out.println(marks[2]);
    // for(int i=0; i<3; i++){
    //     System.out.println(marks[i]);
    // }

    // Second type to create an array..
    // int[] marks ={97,89,79};
    // for(int i=0; i<3; i++){
    //     System.out.println(marks[i]);
    // }

    //  Scanner sc =new Scanner(System.in);
    //  int size =sc.nextInt();
    //  System.out.println("Enter the array size:"+size); 
    //  int mark[]=new int[size];
    //  for(int i=0; i<size; i++){
    //      mark[i]=sc.nextInt();
    //  }
    //  for(int i=0; i<size; i++){
    //      System.out.println("the values in marks:"+mark[i]);
    //  }
    

    // //1--Takes an arrya as input from user . search for a given number x and print the index at which it occurs..(linear search)
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[]= new int[size];
    for(int i =0; i<size; i++){
        arr[i]=sc.nextInt();
    }
    int x =sc.nextInt();
    for(int i =0; i<arr.length; i++){
        if(arr[i]==x){
            System.out.println("X found at index:"+i);

        }
    }
    sc.close();
}    

}