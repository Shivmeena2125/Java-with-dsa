import java.util.*; 
 public class pattern {
    
    public static void main (String arg[]){
    // pattern..
    // sollid rectangle paattern..
    // int n =4;
    // int m = 5;
    // for(int i =1; i<=n; i++){
    //     for(int j = 1; j<=m; j++){
    //         System.out.print("*" +" ");

    //     }
    //     System.out.println();
    // }

    // Hollow rectangle pattern..
    // int n = 4;
    // int m= 5;
    // for(int i = 1; i<=n; i++){
    //     for(int j=1; j<=m; j++){
    //         if(i==1 || j==1 || i==n || j==m){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
            

    //     }
    //     System.out.println();
        
    // right triangle pattern..
    // int n = 4;
    // for(int  i= 1; i<=n; i++){
    //     for(int j = 1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();

    // }

    // inverted triangle pattern..
    // int  n= 4;
    // for(int i = n; i>=1; i--){
    //     for(int j = 1; j<=i; j++){
            
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // half pyramid pattern rotated by 180 degree..

    // int n =4;
    // for(int i = 1; i<=n; i++){
    //     for(int j = 1; j<=n-i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k = 1; k<=i; k++){
    //         System.out.print("*");
    //     }
    //     System.out.println();

    // }

    // half pyramid with numbers..
    // int n = 5;
    // for(int i=1; i<=n; i++){
    //     for(int j= 1; j<=i; j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();

    // }
    // inverted half pyramid with numbers..
    // int n = 5;
    // for(int  i =1; i<=n; i++){
    //     for(int j = 1; j<=n+1-i; j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }

    // Floyd's triangle..
    // int  n= 5;
    // int num = 1;
    // for(int i =1; i<= n; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(num+" ");
    //         num++;
    //     }
    //     System.out.println();
    // }

    // 0-1 triangle pattern..
    // int n = 5;
    // for(int i = 1; i<= n; i++){
    //     for(int j =1 ; j<=i; j++){
    //         int sum = i+j ;
    //         if(  sum %2==0){


    //             System.out.print("1");
    //         }
    //         else{
    //             System.out.print("0");
    //         }
        
    //     }
    //     System.out.println();
    // }


    // butterfly pattern..
    // int n =4; // upperr half of butterfly patttern..
    // for(int i =1; i<=n; i++){
    //     for(int j =1; j<=i; j++){
    //         System.out.print("*");

    //     }
    //     for(int k=1; k<=2*(n-i); k++){
    //         System.out.print(" ");
    //     }
    //     for (int l =1; l<=i; l++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
        
    // }
    // int m = 4; // lower half  of butterfly pattern..
    // for(int i=1; i<=n; i++){
    //     for(int j=1; j<=n-i+1; j++){
    //         System.out.print("*");
    //     }
    //     for(int k=1; k<=2*(i-1); k++){
    //         System.out.print(" ");

    //     }
    //     for(int l =1; l<=n-i+1; l++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // int n= 5;
    // for(int i =1; i<=n; i++){
    //     for(int j =1; j<n-i+1; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1; k<=n; k++){
    //         System.out.print("*" + " ");
    //     }
    //     System.out.println();
    // }

    // Number pyramid pattern..
  
    // int n = 5;
    // for(int i =1; i<=n; i++){
    //         for(int j =1; j<n-i+1; j++){
    //             System.out.print(" ");
    //         }
    //         for(int  k=1; k<=i; k++){
    //             System.out.print(i + " ");
    //         }
    //         System.out.println();

    // }
    
    // Palindrome pattern..
    // int n =5;
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


    // Diamond pattern..
    // upper half of diamond pattern..
    int n =4;
    for(int i =1; i<=n; i++){
        for(int j =1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=2; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    // lower half of diamond pattern..
    for(int i=1; i<=n ;i++){
        for(int j =1; j<=i-1; j++){
            System.out.print(" ");

        }
        for(int j =1; j<=n-i+1; j++){
            System.out.print("*");
        }
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
    }

    

    }
}

