class Solution {

    public boolean isSafe(int row, int col, char[][] board){
        // horizontal

        for(int i = 0; i<board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // vertical

        for(int j = 0; j<board.length;j++){
            if(board[row][j]== 'Q'){
                return false;
            }
        }
        //upper left
        int r = row;
        for(int c= col; c>= 0 && r>=0; c--, r--){
            if(board[r][c]== 'Q'){
                return false;
            }
        }

        //lower left
        r = row;
        for(int c= col; c>= 0 && r< board.length; c--, r++){
            if(board[r][c]== 'Q'){
                return false;
            }
        }
        
        //upper right
        r = row;
        for(int c= col; c<board.length && r>=0; c++, r--){
            if(board[r][c]== 'Q'){
                return false;
            }
        }

        // lower right
        r = row;
        for(int c= col; c<board.length && r<board.length; c++, r++){
            if(board[r][c]== 'Q'){
                return false;
            }
        }
        return true;
    }
    public int helper(char[][] board, int col){
        
        if(col == board.length){
            return 1;
        }
        int count = 0;
        for(int i = 0; i<board.length; i++){
            if(isSafe(i,col, board)){
                board[i][col] = 'Q';
                count+= helper(board, col+1);
                board[i][col] = '.';
            }
        }

        return count;
    }
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        int count = helper(board, 0); 
        return count;
    }
}