package com.basic.graph.breadthfirstsearch.neighbourslist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("Duplicates")
public class BreadthFirstSearch {
    private Queue<Node> queue;

    public BreadthFirstSearch() {
        queue = new LinkedList<>();
    }

    public void bfs_iterativeWithQueue(final Node node) {
        queue.add(node);
        node.visited = true;
        while (!queue.isEmpty()) {
            Node element = queue.remove();
            System.out.print(element.data + "\t");
            List<Node> neighbours = element.getNeighbours();
            for (int x = 0; x < neighbours.size(); x++) {
                Node n = neighbours.get(x);
                if (n != null && !n.visited) {
                    queue.add(n);
                    n.visited = true;
                }
            }
        }
    }

}
