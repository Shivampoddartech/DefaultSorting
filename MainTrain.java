package DefaultSorting;

import java.util.TreeSet;

public class MainTrain {
	public static void main(String[] args) {
		Train t1 = new Train(1000, "shivam");
		Train t2 = new Train(8000, "Ravi");
		Train t3 = new Train(7000, "Shivansh");
		Train t4 = new Train(100000, "Chiku");

		TreeSet<Train> t = new TreeSet<Train>();
		t.add(t1);
		t.add(t2);
		t.add(t3);
		t.add(t4);
		for (Train train : t) {
			System.out.println(train);
		}

	}
}
