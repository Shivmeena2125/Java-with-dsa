import java.util.*;
public class BackTracking {
    
    public static void printpermutation(String str,String combinations){
        if(str.length()==0){
            System.out.println(combinations);
            return ;
        }
        for(int i=0; i<str.length();i++){
            char ch =str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);

            printpermutation(newStr,combinations+ch);
        }

    }

    // N Queen problem --print all posible solutions
    public boolean isSafe(int row, int col ,char [][] board){
        // horizontal line check
        for (int j=0; j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }

        }
        // vertical line check
        for (int i =0; i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //upper left
       int r = row ;
       for(int c =col ; c >= 0 && r >=0 ; c-- ,r--){
        if(board[r][c]=='Q'){
            return false;
        }
       }
        //upper rigth
         r = row ;
        for(int c =col ; c<board.length  && r>=0; c++ ,r--){
        if(board[r][c]=='Q'){
            return false;
        }
       }
        //lower left
         r = row ;
        for(int c =col ; r<board.length &&c >= 0; c-- ,r++){
        if(board[r][c]=='Q'){
            return false;
        }
       }
        

         // lower right
         r = row ;
        for(int c =col ; c <= board.length && r <board.length ; c++ ,r++){
        if(board[r][c]=='Q'){
            return false;
        }
       }

       return true;
   }

   public void saveBoard(char [][] board, List<List<String>> allboards){


   }
    public void helper(char [][] board, List<List<String>> allboards,int col ){
        if(col == board.length){
            saveBoard(board,allboards);
            return;
        }
        for (int row =0; row<=board.length; row++){
            if(isSafe(row,col,board)){
                board[row][col]= 'Q';
                helper(board,allboards,col+1);
                board[row][col]='.';

            }

        }

    }
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allboards =new ArrayList<> ();
        char [][] board =new char[n][n];
        helper(board,allboards,0);
        return allboards;
     }


     // Given an integer n, place n queen on an n*n checboard such that  no two queen attack each other


     public static boolean issafe(int row,int col,char [][]board){
        // horizontal direction

        for(int i =0; i<board.length; i++ ){
           if( board[i][col]=='Q'){
            return false;
           }

        }


        // vertical
         for(int j =0; j<board.length; j++ ){
            if( board[row][j]=='Q'){
            return false;
           }


        }

        //upper left dia
        int r =row;
        for(int c =col; c>=0 && r>=0; c--,r--){
            if( board[r][c]=='Q'){
            return false;
           }


        }

        //upper right dia
         r =row;
        for(int c =col; c<board.length && r>=0; c++,r--){
            if( board[r][c]=='Q'){
            return false;
           }

        }
        // lower left dia
        r =row;
        for(int c =col; c>=0 && r<board.length; c--,r++){
            if( board[r][c]=='Q'){
            return false;
           }

        }
        // lower right dia
         r =row;
        for(int c =col; c<board.length && r<board.length; c++,r++){
            if( board[r][c]=='Q'){
            return false;
           }

        }

        return true ;
     }

     public static void nQueens(int row, char [][] board){
        //System.out.println("Row ="+row);
        if(row == board.length){
            printBoard(board);
            return ;
        }
        for(int col =0; col<board.length; col++){
            if (issafe(row,col,board)){
                board[row][col]='Q';
                nQueens(row+1,board);
                board[row][col]='.';
            }
        }
     }
     public static void printBoard(char [][] board){
        for(int i =0; i<board.length; i++){
        for (int j =0; j<board.length; j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();

 }



    public static void main(String [] arg){
        System.out.println("Starting...");
    //  String str= "ABC";
    //  printpermutation(str,"");



    // n Queens problem
    int n =4;
    char [][] board = new char[n][n];
    for(int i =0; i<board.length; i++){
        for (int j =0; j<board.length; j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }

    nQueens(0,board);

    }
    
}
