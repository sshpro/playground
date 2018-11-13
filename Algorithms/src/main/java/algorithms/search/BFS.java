package algorithms.search;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void search(int[][]graph, int root){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        boolean []visitedList = new boolean[graph.length];
        visitedList[root] = true;

        while (!queue.isEmpty()){
            System.out.println("Queue: " + Arrays.toString(queue.toArray()));
            int visited = queue.remove();
            System.out.println("" + visited + " ");
            for(int adjV: graph[visited]){
                if(!visitedList[adjV]){
                    queue.add(adjV);
                    visitedList[adjV] = true;
                }
            }
        }
    }
}
