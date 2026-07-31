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



public static void main(String [] arg){
    String str ="abc";
    permutationofstr(str,"");
}

}

