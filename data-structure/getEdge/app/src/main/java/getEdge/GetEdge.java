package getEdge;


    import java.util.List;

    public class GetEdge {
        public static int getEdge(String[] cities, Graph g) {

            Node start = null;
            int cost = 0;

            for (Node city : (List<Node>) g.getNodes()) {
                if (city.value == cities[0]) {
                    start = city;
                }
            }
            if (start == null) {
                return cost;
            }

           for (int i = 1; i < cities.length; i++) {
                for (Edge e : (List<Edge>) start.neighbors) {
                    if (e.neighbor.value == cities[i]) {
                        start = e.neighbor;
                        cost += e.weight;
                        break;
                    }
                }

                if (start.value != cities[i]) {
                    return 0;
                }
            }

            return cost;
        }
    }
