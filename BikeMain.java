package DefaultSorting;

import java.util.TreeSet;

public class BikeMain {
	public static void main(String[] args) {
		Bike b1 = new Bike(100);
		Bike b2 = new Bike(250);
		Bike b3 = new Bike(50);
		Bike b4 = new Bike(150);

		TreeSet t = new TreeSet();
		t.add(b1);
		t.add(b2);
		t.add(b3);
		t.add(b3);
		t.add(b4);
		for (Object object : t) {
			System.out.println(t);
		}
	}
}
