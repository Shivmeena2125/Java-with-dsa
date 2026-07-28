import java.util.*;
public class seventhclass {
    public static void main(String args[]){
        // 2D array..
    //     Scanner sc =new Scanner(System.in);
    //     int rows =sc.nextInt();
    //     int columns =sc.nextInt();
    //     int [][] arr = new int [rows][columns];

    //    // input..
    //    //rows
    //      for(int i=0; i<rows; i++){
    //         //columns
    //         for(int j =0; j<columns; j++){
    //             arr[i][j]=sc.nextInt();
    //         }
        
    //      }
    //      //output..
    //      for(int i=0; i<rows; i++){
    //         for(int j =0; j<columns; j++){
    //             System.out.print(arr[i][j]+ " ");
    //         }
    //         System.out.println();
    //      }


    // question-- takes matrix as input from user. search for a given number x and print the indice at which it occurs.

    Scanner sc = new Scanner(System.in);
    int rows =sc.nextInt();
    int cols =sc.nextInt();
    int arr2 [][]= new int[rows][cols];
    //input..
    //rows
    for(int i =0; i<rows; i++){
        for(int j =0 ;j<cols; j++){
            arr2[i][j]=sc.nextInt();
        }
    }
    //output..
    int x =sc.nextInt();
    System.out.println("number you want to find :"+x);
    for(int i=0; i<rows; i++){
        for(int j =0; j<cols; j++){
            if(arr2[i][j]==x){
                System.out.println("The numberr x is found at index:("+ i +","+ j +")");
            }
        }
    }


    }
    
}
