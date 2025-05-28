class Solution {

    public boolean isSafe(int row, int col, char[][] board){

        //horizontal
        for(int i = 0; i <board.length; i++){
            if(board[row][i] == 'Q'){
                return false;
            }
        }

        //vertical
        for(int j = 0; j< board.length; j++){
            if(board[j][col] == 'Q'){
                return false;
            }
        }
        
        //upper left
        int r= row;
        for(int c = col; c>=0 && r>=0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //upper right
        r = row;
        for(int c = col; c<board.length && r>=0; c++, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower left
        r = row;
        for(int c = col; c>=0 && r<board.length; c--, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        //lower right
        r = row;
        for(int c = col; c<board.length && r<board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;

    }

    public void saveBoard(char[][] board, List<List<String>> allBoard){
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i= 0; i<board.length; i++){
            row = "";
            for(int j= 0; j<board.length; j++){
                if(board[i][j]== 'Q'){
                    row+= 'Q';
                }else{
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);
    }
    public void helper(List<List<String>> allBoard, char[][] board, int col){

        if(col == board.length){
            saveBoard(board, allBoard);
            return;
        }
        for(int row= 0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(allBoard, board, col+1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(allBoard, board, 0);

        return allBoard;
    }
}