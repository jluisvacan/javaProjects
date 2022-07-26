import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		System.out.println(cars.add("Volvo"));
		System.out.println(cars.add("BMW"));
		System.out.println(cars.add("VW"));
		System.out.println(cars.add("Ford"));
		System.out.println(cars.add("Audi"));
		System.out.println(cars.add("BMW"));

		System.out.println(cars.size());
		System.out.println(cars.toString());
		
		for (String car : cars) {
		System.out.println(car);
	}// for_each
		
		System.out.println(
				cars.contains("BWM"));
		
		// cars.forEach((c) -> System.out.println(c));
		cars.forEach((c) -> showCar(c));
		
		Object[] objs = cars.toArray();
		System.out.println(objs.length);
		System.out.println((String) objs[0]);
		
//		System.out.println("Volvo".hashCode());
//		System.out.println(("BMW".hashCode()));
//		System.out.println("VW".hashCode());
//		System.out.println("Ford".hashCode());
//		System.out.println("Audi".hashCode());
//		System.out.println("BMW".hashCode());
	}//main
	public static void showCar(String car) {
		System.out.println(car.toUpperCase()+ "-" + car.toLowerCase());
	}//showCar
}//class_HashSetDemo
