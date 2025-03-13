package DefaultSorting;

import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Car c1 = new Car(300);
		Car c2 = new Car(500);
		Car c3 = new Car(1000);
		Car c4 = new Car(100);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		System.out.println("--------------------");
		TreeSet<Car> t = new TreeSet<>();
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		for (Car car : t) {
			System.out.println(car);
		}
	}
}