package com.basic.graph.shortestpath.dijkstra;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Dijkstra dijkstra = new Dijkstra();

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addAdjecentNode(nodeB, 10);
        nodeA.addAdjecentNode(nodeC, 15);

        nodeB.addAdjecentNode(nodeD, 12);
        nodeB.addAdjecentNode(nodeF, 15);

        nodeC.addAdjecentNode(nodeE, 10);

        nodeD.addAdjecentNode(nodeE, 2);
        nodeD.addAdjecentNode(nodeF, 1);

        nodeF.addAdjecentNode(nodeE, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph = dijkstra.calculateShortestPathFromSource(graph, nodeA);

        Iterator<Node> graphIterator = graph.getNodes().iterator();
        while (graphIterator.hasNext()) {
            Node currentNode = graphIterator.next();
            System.out.print(currentNode.getName() + " | ");
            System.out.print(currentNode.getShortestPath().toString());
            System.out.println();
        }
    }
}
