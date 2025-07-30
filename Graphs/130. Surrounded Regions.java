class Solution {
    public void dfs(char[][] b, int r, int c){
        if(r<0||c<0||r>=b.length||c>=b[r].length||b[r][c]=='X'||b[r][c]=='S'){
            return;
        }
        b[r][c] = 'S';
        dfs(b, r+1, c);
        dfs(b, r-1, c);
        dfs(b, r, c+1);
        dfs(b, r, c-1);
    }
    public void solve(char[][] board) {
        // if(board == null || board.length == 0 || board[0].length == 0) return;
        int row = board.length;
        int col = board[0].length;
        for(int j=0; j<col; j++){
            if(board[0][j]=='O'){
                dfs(board, 0, j);
            }
        }
        for(int j=0; j<col; j++){
            if(board[row-1][j]=='O'){
                dfs(board, row-1, j);
            }
        }
        for(int i=1; i<row-1; i++){
            if(board[i][0]=='O'){
                dfs(board, i, 0);
            }
        }
        for(int i=1; i<row-1; i++){
            if(board[i][col-1]=='O'){
                dfs(board, i, col-1);
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(board[i][j]=='S'){
                    board[i][j] = 'O';
                }
            }
        }
    }
}
