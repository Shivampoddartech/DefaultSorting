package DefaultSorting;

public class Pencil implements Comparable<Pencil> {
	int cost;
	String brand;

	Pencil(int cost, String brand) {
		this.cost = cost;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "cost " + cost + "brand " + brand;
	}

	@Override
	public int compareTo(Pencil p) {
		return this.cost - p.cost;
	}

}
