package tree.intersection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class TreeInsertion {

    private HashSet<Integer> values = new HashSet<>();

    public HashSet<Integer> treeIntersection(Tree input1, Tree input2){

        HashSet<Integer> result = new HashSet<>();

        if(input1.overallRoot == null || input2.overallRoot == null){
            return result;
        }

        values = new HashSet<>();
        createSet(input1.overallRoot);


        Queue nodes = new LinkedList();
        nodes.offer(input2.overallRoot);

        while (!nodes.isEmpty()) {
            Node currentNode = (Node) nodes.poll();
            if(values.contains(currentNode.data)) {
                result.add(currentNode.data);
            }
            if (currentNode.left != null) {
                nodes.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                nodes.offer(currentNode.right);
            }
        }

        return result;

    }

    private void createSet(Node root){
        if(root != null) {
            values.add(root.data);
            createSet(root.left);
            createSet(root.right);
        }
    }


}
