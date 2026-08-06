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


 //Sudoku Solver
 
 public void solveSudoku(char [][]board){
    helper(board,0,0);

 }
     public boolean isSafe(char[][] board,int row,int col,int number){
    //row&col
    for(int i=0;i<board.length;i++){
        if(board[i][col]==(char)(number +'0')){
            return false;
        }if(board[row][i]==(char)(number+'0')){
            return false;

        }
    }
    //grid
    int sr= (row/3)*3;
    int sc= (col/3)*3;
    for(int i=sr; i<sr+3;i++){
        for(int j=sc;j<sc+3; j++){
            if(board[i][j]==(char)(number+'0')){
                return false;
            }
        }
    }
    return true;

 }


 public boolean helper(char[][]board,int row,int col){
  if(row==board.length){
    return true;
  }

    int newrow=0;
    int newcol=0;
    if(col != board.length-1){
        newrow =row;
        newcol =col+1;
    }else{
        newrow = row +1;
        newcol= 0;
    }
    if(board[row][col] != '.'){
        if(helper(board,newrow,newcol)){
            return true;
        }
    }
        else{
            for(int i =1; i<=9;i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=(char)(i+'0');
                    if(helper(board,newrow,newcol))
                        return true;
                    
                    else
                        board[row][col]='.';
                    
                
            }
        }
    }
    return false;
 }



    public static void main(String [] arg){
        System.out.println("Starting...");
    //  String str= "ABC";
    //  printpermutation(str,"");



    // n Queens problem
    // int n =4;
    // char [][] board = new char[n][n];
    // for(int i =0; i<board.length; i++){
    //     for (int j =0; j<board.length; j++){
    //         System.out.print(board[i][j]+" ");
    //     }
    //     System.out.println();
    // }

    // nQueens(0,board);


    //Sudoku 
    
    




    }
    
}
