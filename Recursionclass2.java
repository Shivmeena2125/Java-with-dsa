import java.util.HashSet;
public class Recursionclass2 {
//Recursion part =2
//practice basic question in recursion
//print numbeer 1 to  N.
public static void number1(int n){
    if(n==0){
        return;
    }

    number1(n-1);
    System.out.println(n);
}

//print n to 1 number.
public static void number2(int n){
    if(n==0) return;
    System.out.println(n);
    number2(n-1);

}

//sum of first N natural numbers..
public static void sumofN(int i, int b, int sum){
    if(i==b){
        sum+=i;
        System.out.println(sum);
        return ;
    }
    sum+=i;
    sumofN(i+1,b,sum);
}

//  Tower of hanoi
public static void tower_of_hanoi(int n, String source, String helper ,String destination){
    if(n==1){
        System.out.println("transfer disk " + n + " from "+source+" to "+destination);
        return;
    }

   tower_of_hanoi(n-1,source,destination,helper );
   System.out.println("transfer disk " + n + " from "+source+" to "+destination);
   tower_of_hanoi(n-1,helper,source,destination);
}


//print a string in reverse
public static void reverseString(String s,int idx){
    if(idx==0){
        System.out.print(s.charAt(idx));

        return;
    }
     System.out.print(s.charAt(idx));
    reverseString(s,idx-1);
}

//find the first occurance and last occurance of the string
public static int first =-1;
public static int last =-1;

public static void occ(String sb, int index,char element){
 // base case
 if(index ==sb.length()){
    System.out.println(first);
    System.out.println(last);
    return;
 }

    char currchar = sb.charAt(index);
 if(currchar== element){
    if(first ==-1){
    first = index;
    }
    else{
    last =index;
 }
}

 occ(sb,index+1,element);

}

//check if an array is sorted or not
public static boolean isSorted(int arr[],int idx){
    if(idx == arr.length-1){
        return true;
    }
    if(arr[idx]<arr[idx+1]){
       return isSorted(arr,idx+1);
    }else{
        return false;
    }

}

//shift a particular char to the end in string
public static void moveallx(String alpha,int index,int count,String newStr){
    if(index==alpha.length()){
        for(int i=0;i<count; i++){
            newStr += 'x';
        }
        System.out.println(newStr);
        return;
    }

    char currchar =alpha.charAt(index) ;
    
    if(currchar=='x'){
        count ++;
        moveallx(alpha,index+1,count,newStr);

    }else{
        newStr += currchar;
        moveallx(alpha,index+1,count,newStr);
    }

}

// remove dublicates from string
public static boolean [] map = new boolean [26];

public static void removedublicates(String str ,int idx ,String newstr){
   if(idx == str.length()){
    System.out.println(newstr);
    return;
   }

    char curr = str.charAt(idx);
    if(map[curr-'a']==true){
       removedublicates(str,idx+1,newstr);
    }else{
        newstr += curr;
        map[curr-'a']= true;
        removedublicates(str,idx+1,newstr);
        return;

    }
}

// subsequence of the string
public static void subsequence(String str,int idx,String newstr){
    if(idx ==str.length()){
        System.out.print(newstr+",");
        return;
    }


    char currch = str.charAt(idx);
    //to be 
    subsequence(str,idx+1,newstr +currch);


    // not ot be
    subsequence(str,idx+1,newstr);

    }


    // print the all uinque subsequence of he String  (data structure =Hashset)


    public static void Usubsequence(String str ,int idx,String newstr , HashSet<String> set){
        if(idx==str.length()){
    if(set.contains(newstr)){
        return;
    }else{
        System.out.println(newstr);
        set.add(newstr);
        return;
    }

}
        char currchar = str.charAt(idx);
        // to be
        Usubsequence(str,idx+1,newstr+currchar,set);

        //not to be
        Usubsequence(str,idx+1,newstr,set);
    }
 // key pad combination
 public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqu","rst","vwx","yz"};
 public static void keycombination(String str,int idx ,String newstr){
    if(idx ==str.length()){
        System.out.println(newstr);
        return;
    }
    char ch =str.charAt(idx);
    String mapping =keypad[ch-'0'];

    for(int i =0; i<mapping.length(); i++){
        keycombination(str,idx+1,newstr +mapping.charAt(i));
    }
 }




public static void main (String [] args){

    // number1(5);

    // number2(5);

    /*int i = 1;
    int b = 10;
    int sum=0;
    sumofN(1,10,0);*/

    //Tower of hanoi
    //  int n=4;
    //  tower_of_hanoi(n,"s","h","d");


    //print a string in reverse
    // String s ="shiv";
    // int idx =3;
    // reverseString("shiv",3);


    // find the occurance of first  and last occurance of the char
    //   String  sb ="abaacdaefaab";
    //   occ(sb,0,'a');

    //is array sorted or not
    // int arr[] ={2,6,8,9};
    // System.out.println(isSorted(arr,0));

    //move all x to the end in new string.
    // String alpha = "axnbhxbbxxbnudcx";
    // moveallx(alpha,0,0,"");

    // remove dublicates from string
    // String str ="abbacdac";
    // removedublicates(str ,0,"");


    // subsequence
    // String str ="abc";
    // subsequence(str,0,"");

    //Unique subsequence in string

//    String str ="aaa";
//    HashSet <String> set = new HashSet <>();
//    Usubsequence(str,0,"",set);



//key combination
String str = "4";
keycombination(str,0,"");








}
    
}
