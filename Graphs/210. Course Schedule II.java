class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ord = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] arr: prerequisites){
            adj.get(arr[1]).add(arr[0]);
        }   
        int[] inS = new int[numCourses];
        int[] vis = new int[numCourses];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<numCourses; i++){
            if(vis[i]==0){
                if(dfs(adj, inS, vis, i, st)){
                    return new int[0];
                }
            }
        }
        for(int i=0; i<numCourses; i++){
            ord[i] = st.pop();
        }        
        return ord;
    }

    public static boolean dfs(List<List<Integer>> adj, int[] in, int[]v, int i, Stack<Integer> st){
        if(in[i]==1){
            return true;
        }
        if(v[i]==1) return false;
        in[i]=1;
        v[i]=1;
        for(int n: adj.get(i)){
            if(dfs(adj, in, v, n, st)){
                return true;
            }
        }
        in[i]=0;
        st.push(i);
        return false;
    }
}
