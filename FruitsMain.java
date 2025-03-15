package DefaultSorting;

import java.util.TreeSet;

public class FruitsMain {
	public static void main(String[] args) {
		Fruits f1 = new Fruits(500, "Kiwi");
		Fruits f2 = new Fruits(200, " Apple");
		Fruits f3 = new Fruits(100, "Mango");
		Fruits f4 = new Fruits(300, " Orange");
		Fruits f5 = new Fruits(900, "Banana");
		Fruits f6 = new Fruits(700, " Papaya");
		TreeSet<Fruits> t = new TreeSet<Fruits>();
		t.add(f1);
		t.add(f2);
		for (Fruits fruit : t) {
			System.out.println(fruit);
		}

	}
}
