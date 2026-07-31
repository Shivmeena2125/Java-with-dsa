import java.util.*;
public class recursion3 {

    //print all permutation of a string
    public static void permutationofstr(String str,String combinations){
        if(str.length()==0){
            System.out.println(combinations);
            return;
        }
        for(int i=0; i<str.length();i++){
            char curr = str.charAt(i);
             // "abc"  -> "bc" in new string for further combinations
             
            String newstr = str.substring(0,i) + str.substring(i+1);

            permutationofstr(newstr,combinations+curr);

        }
    }

    //count total path in a maze to move from (0,0) to (n,m).
    public static int countsPath(int i,int j, int n, int m){

        // base case 
        if(i ==n || j ==m){
            return 0;
        }
        if(i ==n-1 && j==m-1){
            return 1;

        }

        //move downwards
         int downPaths =countsPath(i+1,j,n,m);
        //move right
        int rightPaths =countsPath(i,j+1,n,m);

        return downPaths + rightPaths;


    }
    //place the tiles on faras wher the size of faras is 4*2 and tile's size 1*m how many ways is ther to cover whole faras
    public static int placeTiles(int n,int m){
        // base case
        if (n==m){
            return 2 ;
        }
         if (n<m){
            return 1 ;
        }

        //vertically
        int veritcallPlacements =placeTiles(n-m,m);
        //horizontally
        int horzontallPlacements =placeTiles(n-1,m);

        return veritcallPlacements + horzontallPlacements;
    }

    //
    public static int totalways(int n){

        //base case
        if (n<=1){
            return 1;
        }

        // single invite
        int singleInvite =totalways(n-1);
        //pair intive
        int pairInvite =(n-1)*totalways(n-2);
        return  singleInvite + pairInvite;
    }

    //print all the subsets of a set of first n natural numbers
    public static void printSubsets(ArrayList<Integer> subsets){
        for(int i =0; i<subsets.size(); i++){
            System.out.print(subsets.get(i));
        }
        System.out.println();
    }
    public static void findsubsets(int n, ArrayList<Integer> subsets){
        if(n==0){
            printSubsets(subsets);
            return;
        }
    // to be
    subsets.add(n);
    findsubsets(n-1,subsets);
    // not to be 
    //remove element from subset
    subsets.remove(subsets.size()-1);
    findsubsets(n-1,subsets);


    }




public static void main(String [] arg){
    // String str ="abc";
    // permutationofstr(str,"");


    // int n =3 ,m =3 ;
    // int totalPaths =countsPath(0,0,n,m);
    // System.out.println(totalPaths);

    // int n=4 ,m =2;
    // int totalways =placeTiles(n,m);
    // System.out.println(totalways); //5


    // int n= 4;
    // int totalWays =totalways(n);
    // System.out.println(totalWays);


    int n =4;
    ArrayList <Integer> sunset = new ArrayList<>(n);
    findsubsets(n, sunset);
    


}

}

