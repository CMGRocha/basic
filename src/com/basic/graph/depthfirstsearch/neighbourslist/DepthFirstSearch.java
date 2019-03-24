package com.basic.graph.depthfirstsearch.neighbourslist;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    public void dfs_recursive(final Node node) {
        System.out.print(node.data + "\t");
        List<Node> neighbours = node.getNeighbours();
        node.visited = true;
        for (int x = 0; x < neighbours.size(); x++) {
            Node n = neighbours.get(x);
            if (n != null && !n.visited) {
                dfs_recursive(n);
            }
        }
    }

    public void dfs_iterativeWithStack(final Node node) {
        Stack<Node> stack = new Stack<>();
        stack.add(node);
        node.visited = true;
        while (!stack.empty()) {
            Node element = stack.pop();
            System.out.print(element.data + "\t");
            List<Node> neighbours = element.getNeighbours();
            for (int x = 0; x < neighbours.size(); x++) {
                Node n = neighbours.get(x);
                if (n != null && !n.visited) {
                    stack.add(n);
                    n.visited = true;
                }
            }
        }
    }
}
