package DefaultSorting;

public class Plant implements Comparable<Plant> {
	int cost;
	String name;

	Plant(int cost, String name) {
		this.cost = cost;
		this.name = name;
	}

	@Override
	public String toString() {
		return "cost " + cost + "name " + name;
	}

	@Override
	public int compareTo(Plant p) {
		return cost - p.cost;
	}

}
