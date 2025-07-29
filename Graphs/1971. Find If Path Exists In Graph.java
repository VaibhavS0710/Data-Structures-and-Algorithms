class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] arr = new ArrayList[n];
        for(int i=0; i<n; i++){
            arr[i] = new ArrayList<>(); 
        }
        for(int[] e: edges){
            int v1 = e[0];
            int v2 = e[1];
            arr[v1].add(v2);
            arr[v2].add(v1);
        }
        boolean[] vis = new boolean[n];
        return isPath(arr, source, destination, vis);
    }
    public boolean isPath(ArrayList<Integer>[] arr, int s, int d, boolean[] v){
        if(s==d) return true;
        v[s] = true;
        for(int nbr: arr[s]){
            if(v[nbr] == false){
                if(isPath(arr, nbr, d, v)) return true;
            }
        }
        return false;
    }
}
