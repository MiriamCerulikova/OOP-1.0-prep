import java.util.*;

class PizzaCompany {
    private String name;
    private List<Route> routes;

    public PizzaCompany(String name) {
        this.name = name;
        this.routes = new ArrayList<>();
    }

    public void addRoute(Route route) {
        routes.add(route);
    }

    public double getTotalProfit() {
        double totalProfit = 0;
        for (Route r : routes) {
            totalProfit += r.getProfit();
        }
        return totalProfit;
    }

    public Route getShortestRoute() {
        if (routes.isEmpty()) return null;
        Route shortest = routes.get(0);
        for (Route r : routes) {
            if (r.getTotalDistance() < shortest.getTotalDistance()) {
                shortest = r;
            }
        }
        return shortest;
    }

    public Route getLongestRoute() {
        if (routes.isEmpty()) return null;
        Route longest = routes.get(0);
        for (Route r : routes) {
            if (r.getTotalDistance() > longest.getTotalDistance()) {
                longest = r;
            }
        }
        return longest;
    }

    public Route getRouteWithMostPizzas() {
        if (routes.isEmpty()) return null;
        Route mostPizzas = routes.get(0);
        for (Route r : routes) {
            if (r.getAmountOfPizzas() > mostPizzas.getAmountOfPizzas()) {
                mostPizzas = r;
            }
        }
        return mostPizzas;
    }
}
