package com.basic.graph.shortestpath.dijkstra;

import java.util.*;

public class Dijkstra {

    /*
            https://www.baeldung.com/java-dijkstra
     */
    public Graph calculateShortestPathFromSource(Graph graph, Node source) {
        source.setDistance(0);
        Set<Node> visitedNodes = new HashSet<>();
        Set<Node> unvisitedNodes = new HashSet<>();

        unvisitedNodes.add(source);
        while (unvisitedNodes.size() != 0) {
            Node currentNode = getNearestNode(unvisitedNodes);
            unvisitedNodes.remove(currentNode);
            for (Map.Entry<Node, Integer> adjacentNodes : currentNode.getAdjacentNodes().entrySet()) {
                Node adjacentNode = adjacentNodes.getKey();
                Integer edgeWeight = adjacentNodes.getValue();
                if (!visitedNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unvisitedNodes.add(adjacentNode);
                }
            }
            visitedNodes.add(currentNode);
        }
        return graph;
    }

    private void calculateMinimumDistance(Node adjacentNode, Integer edgeWeight, Node currentNode) {
        Integer sourceDistance = currentNode.getDistance();
        if (sourceDistance + edgeWeight < adjacentNode.getDistance()) {
            adjacentNode.setDistance(sourceDistance + edgeWeight);
            List<Node> shortestPath = new LinkedList<>(currentNode.getShortestPath());
            shortestPath.add(currentNode);
            adjacentNode.setShortestPath(shortestPath);
        }
    }

    private Node getNearestNode(Set<Node> unvisitedNodes) {
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node : unvisitedNodes) {
            if (node.getDistance() < lowestDistance) {
                lowestDistance = node.getDistance();
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }


}
