import java.util.*;
public class eighthclass {
    public static void main(String args[]){
        //Strings Declaration..
        // String name ="Shiv";
        // String full_name="Shiv meena";
        // String sentence ="this is an string lecture";

        // Scanner sc = new Scanner(System.in);
        // String name =sc.nextLine();
        // System.out.println("yours name:"+name);

        //Concatination.. with length () function..
        // String name ="Shiv";
        // String surname ="meena";
        // String fullname= "Shiv"+" "+"meena";
        // System.out.println(fullname.length());

         // charAt..
        //  String name= "Shiv meena";
        //  for(int i =0;i< name.length(); i++){
        //  System.out.println(name.charAt(i));
        //  }


        //compare two Srings.. compareTo()
        // String name1 = "Shiv";
        // String name2 ="Shiv";

        //1--s1>s2 : +ve value
        //2--s1==s2 : 0
        //3--s1<s2  : -ve value

        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");

        // }else{
        //     System.out.println("strings are not equal");
        // }

        // SubStrings..
        //  String sentence = "My name is shiv";
        //  String name =sentence.substring(11,15);
        //  System.out.println(name);

        //Strings are immutable..

        // String builder..

         StringBuilder sb =new StringBuilder("Shiv");
         System.out.println(sb);

        // //char at index 0.
         System.out.println(sb.charAt(0));

        // // set char at index . setcharAt()
           sb.setCharAt(0,'p');
            System.out.println(sb);

        // // insert()
         sb.insert(3,'l');
         System.out.println(sb); 

        // //delete()..
         sb.delete(0,3);
         System.out.println(sb);

        // //append()..
         sb.append("e");
         sb.append("o");
         System.out.println(sb.length());

        // reverse String.
       StringBuilder sb1 = new StringBuilder("tony");
        for(int i =0; i<sb1.length()/2; i++){
            int front = i;
            int back = sb1.length()-1-i;

            char frontChar = sb1.charAt(front);
            char backChar =sb1.charAt(back);
            sb1.setCharAt(front,backChar);
            sb1.setCharAt(back,frontChar);


        }
        System.out.println(sb1);





    }
    
}
