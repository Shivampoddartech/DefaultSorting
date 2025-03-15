package DefaultSorting;

import java.util.TreeSet;

public class PlantMain {
	public static void main(String[] args) {
		Plant p1 = new Plant(2000 , " Rose");
		Plant p2 = new Plant(10000 , " Lily");
		TreeSet<Plant> t = new TreeSet<Plant>();
		t.add(p1);
		t.add(p2);

		for (Object obj : t) {
			System.out.println(obj);
		}

	}
}
