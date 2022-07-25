import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    ArrayList<LinkedList<Node>> adjList;

    Graph(){
        adjList = new ArrayList<>();
    }

    public void addNode (Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        adjList.add(currentList);
    }

    public void addEdge (int src, int dest) {
        LinkedList<Node> currentList = adjList.get(src);
        Node destNode = adjList.get(dest).get(0);
        currentList.add(destNode);
    }

    public boolean checkEdge (int src, int dest) {
        LinkedList<Node> currentList = adjList.get(src);
        Node destNode = adjList.get(dest).get(0);

        for(Node node: currentList) {
            if(node == destNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for(LinkedList<Node> currentList : adjList) {
            for(Node node : currentList) {
                System.out.print(node.data + " -> ");

            }
            System.out.println();
        }
    }
}
