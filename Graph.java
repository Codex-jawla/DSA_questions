package com.striver;
import java.util.*;
import com.striver.arrays.*;

public class graph {
    static class Edge{
        int src;
        int dest;
//        int weight;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
//            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph ){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all values 0 to exit ");
        System.out.println("The src and destination must not be grater then "+(graph.length-1));
        while(true) {
            System.out.println("Enter the source and destination :");
            int src=sc.nextInt();
            int dest=sc.nextInt();
//            int weight=sc.nextInt();
            if (src == dest  && src==0) break;
            graph[src].add(new Edge(src, dest));
            graph[dest].add(new Edge(dest, src ));

        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int v = in.nextInt();
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
    }
}

