import java.util.ArrayList;

/**
 * This is a weighted graph with nodes and edges. Locations is a list of
 * GraphNodes that can contain connections to other GraphNodes, known as
 * GraphEdges. GraphEdges contain a connection and a weight, and are implemented
 * here as bidirectional, meaning that an edge can be traversed from both
 * directions.
 */
public class Graph {

    public static ArrayList<GraphNode> locations;

    /**
     * No Paramater Constructor -> creates an empty list
     */
    public Graph() {
        locations = new ArrayList<>();
    }

    /**
     * 
     * @param fromNode is the position of the Node you are adding a connection to.
     * @param toNode   is the position of the Node you are connecting to
     * @param weight   is the weight to travel from fromNode to toNode.
     */
    public void addEdge(int fromNode, int toNode, int weight) {
        locations.get(fromNode).addConnection(new GraphEdge(new GraphNode(toNode), weight));
        locations.get(toNode).addConnection(new GraphEdge(new GraphNode(fromNode), weight));
    }

    /**
     * Fills the location list with GraphNodes from 0 -> numOfLocations
     * 
     * @param numOfLocations is the number of new GraphNodes to create
     */
    public void fillLocations(int numOfLocations) {
        for (int locationIterator = 0; locationIterator < numOfLocations; locationIterator++) {
            locations.add(new GraphNode(locationIterator));
        }
    }
}