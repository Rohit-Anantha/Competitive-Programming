import java.util.ArrayList;

/**
 * TODO
 */
public class GraphNode {
    final int POSITION;
    private ArrayList<GraphEdge> edges;

    /**
     * TODO
     * 
     * @param pos
     */
    public GraphNode(int pos) {
        POSITION = pos;
    }

    /**
     * TODO
     * 
     * @return
     */
    public ArrayList<GraphEdge> getEdges() {
        return edges;
    }

    /**
     * TODO
     * 
     * @return
     */
    public int getPOSITION() {
        return POSITION;
    }

    /**
     * TODO
     * 
     * @param graphEdge
     */
    public void addConnection(GraphEdge graphEdge) {
        edges.add(graphEdge);
    }
}