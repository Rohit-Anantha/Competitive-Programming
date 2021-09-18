import java.util.Scanner;

public class GraphTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLocations = scanner.nextInt();
        int numOfPortals = scanner.nextInt();
        int numOfQueries = scanner.nextInt();

        Graph portalGraph = new Graph();

        portalGraph.fillLocations(numOfLocations);

        for (int portalIterator = 0; portalIterator < numOfPortals; portalIterator++) {
            int fromPortal = scanner.nextInt();
            int toPortal = scanner.nextInt();
            int travelTime = scanner.nextInt();

            portalGraph.addEdge(toPortal, fromPortal, travelTime);

        }

    }

}
