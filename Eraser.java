package DefaultSorting;

import java.util.TreeSet;

public class Eraser {
	public static void main(String[] args) {
		Pencil p1 = new Pencil(10, " Apsara");
		Pencil p2 = new Pencil(20, " Doms");
		Pencil p3 = new Pencil(5, " Natraj");

		TreeSet<Pencil> t = new TreeSet<>();
		t.add(p1);
		t.add(p2);
		t.add(p3);
		for (Pencil pencil : t) {
			System.out.println(pencil);
		}
	}
}
