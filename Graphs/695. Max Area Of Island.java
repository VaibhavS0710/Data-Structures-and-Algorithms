class Solution {
    public int dfs(int[][] g, int i, int j){
        if(i<0 || j<0 || i>=g.length || j>=g[i].length || g[i][j]==0){
            return 0;
        }
        g[i][j] = 0;
        int c = 1;
        c += dfs(g, i+1, j);
        c += dfs(g, i-1, j);
        c += dfs(g, i, j+1);
        c += dfs(g, i, j-1);
        return c;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]==1){
                    count = Math.max(count, dfs(grid, i, j));
                }
            }
        }
        return count;
    }
}
