/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Integer, Node> no = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        if(no.containsKey(node.val)){
            return no.get(node.val);
        }
        Node coN = new Node(node.val);
        no.put(node.val, coN);
        for(Node neig: node.neighbors){
            coN.neighbors.add(cloneGraph(neig));
        }
        return coN;
    }
}
