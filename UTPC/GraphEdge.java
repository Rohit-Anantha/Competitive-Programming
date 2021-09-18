/**
 * TODO
 */
public class GraphEdge {
    private GraphNode destinationGraphNode;
    private int weight;

    /**
     * TODO
     * 
     * @param destination
     * @param time
     */
    public GraphEdge(GraphNode destination, int time) {
        destinationGraphNode = destination;
        weight = time;
    }

    /**
     * TODO
     * 
     * @return
     */
    public GraphNode getDestinationGraphNode() {
        return destinationGraphNode;
    }

    /**
     * TODO
     * 
     * @return
     */
    public int getWeight() {
        return weight;
    }
}
