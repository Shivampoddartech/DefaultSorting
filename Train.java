package DefaultSorting;

public class Train implements Comparable<Train> {
	int cost;
	String name;

	Train(int cost, String name) {
		this.cost = cost;
		this.name = name;
	}

	@Override
	public String toString() {
		return "cost " + cost + " "+ "name " + name + " " + " ";
	}

	@Override
	public int compareTo(Train t) {
		return this.cost - t.cost;
	}

}
