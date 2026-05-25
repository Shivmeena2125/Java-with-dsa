import java.util.*;
public class fourthclass {
    public static void main(String arg[]){
    // patterns..
    // solid rectangle pattern..
    // int n=4;
    // int m=5;
    // for(int i= 1; i<=n; i++){ // outer loop
    //     for(int j=1; j<=m; j++){// inner loop
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // hollow rectangle pattern..
    // int n = 4;
    // int m = 5;
    // for(int i =1; i<=n; i++){
    //     for(int j=1; j<=m; j++){
    //             if(i==1 || j==m|| i==n|| j==1){
    //                 System.out.print("*" );
    //             }else{
    //                 System.out.print(" ");
    //             }
    //     }
    //     System.out.println();
    // }

    // right angle triangle..
    // int n = 4;
    // for(int i =1; i<=n; i++){
    //     for(int j =1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // inverted half pyramid..
    // int n = 4;
    // for (int i =n; i>=1; i--){
    //     for(int j =1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // half pyramid pattern rotated by 180 degree..
    // int n = 4;
    // for(int i =1;  i<=n; i++){ // outer loop
    //     for(int j =1; j<=n-i; j++){ // inner loop 1 for spaces
    //         System.out.print(" ");
    //     }
    //     for(int k=1; k<=i; k++){    // inner loop 2 for stars
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // half pyramid with numbers
    // int n =5;

    // for(int i=1; i<=n; i++){
    //     int num = 1;
    //    for(int j = 1; j<=i; j++){
    //     System.out.print(num+" ");
    //     num+=1;
    //    }
    //   System.out.println();
    // }

    // half pyramid with numbers -- another way
    // int n = 5;
    // for(int i = 1; i<=n; i++){
    //    for(int j=1; j<=i; j++){
    //     System.out.print(j+" ");
    //    }
    //    System.out.println();
    // }

    // inverted half pyramid with numbers
    // int n = 5;
    //  for(int i = n; i>=1; i--){
    //     for(int j=1; j<=i; j++){
    //      System.out.print(j+" ");
    //     }
    //     System.out.println(); }

    // Floyd's triangle..
    // int n =5;
    // int num=1;
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(num+" ");
    //         num+=1;
    //     }
    //     System.out.println();
    // }

    // 0-1 triangle..
    // int n= 5;
    // for(int i= 1; i<=n; i++){
    //     for(int j=1; j<=i; j++){
    //         int sum =i+j;
    //         if(sum%2==0){
    //         System.out.print("1 ");
    //         }else{
    //             System.out.print("0 ");
    //         }
    //     }
    //     System.out.println();
    // }

    //Butterfly pattern..
    // upper pattern
    // int n = 4;
    // for(int i=1; i<=n; i++){ // outer loop
    //     for(int j=1; j<=i; j++){ // inner loop left half 
    //        System.out.print("*");
    //     }
    //     for(int k=1; k<=(2*(n-i)); k++){//  inner loop for space
    //         System.out.print(" ");
    //     }
    //     for(int j =1; j<=i; j++){ // another inner loop for right half
    //         System.out.print("*");
    //     }
    //      System.out.println();
    // }
    // // lower pattern
    // for(int i= n; i>=1; i--){  //outer loop
    //    for(int j =1; j<=i; j++){//inner loop for left half
    //       System.out.print("*");
    //    }
    //    for(int j=1; j<=2*(n-i); j++){ // inner loop for space
    //     if(n==i){
    //         break;
    //     }
    //     System.out.print(" ");
    //    }
    //    for(int j=1; j<=i; j++){ // inner loop for right half pattern
    //     System.out.print("*");
    //    }

    //    System.out.println();
    // }

    // solid Rhombus
    // int n= 5;
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j =1; j<=n; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // Number pyramid..
    // int n= 5;
    // //int num= 1;
    //  for(int i=1; i<=n; i++){
    //      for(int j=1; j<=n-i; j++){
    //          System.out.print(" ");
    //         }
    //         for(int j=1; j<=i; j++){
    //             System.out.print(i+" "); // yah hum i bhi print kara saktehai aur koi new variable deke bhi kar sakte hai..
    //         }
    //        // num+=1;
    //         System.out.println();

    //     }

    // Palindromic pattern
    // int n = 5;
    // for(int i =1; i<=n; i++){
    //     for(int j =1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j =i; j>=1; j--){
    //         System.out.print(j);
            
    //     }
    //     for(int j =2; j<=i; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    //Diamond pattern..
    }
}