public static void BFS(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> q= new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                q.add(i);
            while (!q.isEmpty()) {
                int curr = q.remove();
                if (!visited[curr]) {
                    System.out.print(curr + " ");
                    visited[curr] = true;
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        q.add(e.dest);
                    }
                }
            }
        }
        }
    }
