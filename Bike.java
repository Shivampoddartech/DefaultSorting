package DefaultSorting;

public class Bike implements Comparable<Bike> {
	int cost;

	Bike(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Cost"+cost;
	}
	@Override
	public int compareTo(Bike b) {
		return this.cost - b.cost;
	}
}
