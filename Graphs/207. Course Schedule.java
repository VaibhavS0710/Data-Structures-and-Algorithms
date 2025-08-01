class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] arr: prerequisites){
            adj.get(arr[0]).add(arr[1]);
        }   
        int[] inS = new int[numCourses];
        int[] vis = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            if(dfs(adj, inS, vis, i)){
                return false;
            }
        }
        return true;
    }
    public static boolean dfs(List<List<Integer>> adj, int[] in, int[]v, int i){
        if(in[i]==1){
            return true;
        }
        if(v[i]==1) return false;
        in[i]=1;
        v[i]=1;
        for(int n: adj.get(i)){
            if(dfs(adj, in, v, n)){
                return true;
            }
        }
        in[i]=0;
        return false;
    }
}
