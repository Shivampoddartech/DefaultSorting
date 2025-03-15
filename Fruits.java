package DefaultSorting;

public class Fruits implements Comparable<Fruits> {
	int cost;
	String name;

	Fruits(int cost, String name) {
		this.cost = cost;
		this.name = name;
	}

	@Override
	public String toString() {
		return "cost" + cost + "name" + name;

	}

	@Override
	public int compareTo(Fruits f) {
		return this.cost - f.cost;

	}

}
