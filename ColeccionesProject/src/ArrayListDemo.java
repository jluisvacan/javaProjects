import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(35);				numbers.add(33);			numbers.add(42);
		numbers.add(10);				numbers.add(14);			numbers.add(19);
		numbers.add(27);				numbers.add(44);			numbers.add(26);
		numbers.add(31);				numbers.add(31);			numbers.add(45);
		
		System.out.println(numbers.size()); // Tama�o del array
		System.out.println(numbers);
		System.out.println(numbers.isEmpty()); // Imprime si esta vacio true/false cuando tiene un arreglo
		System.out.println(numbers.get(9));		//Obtiene el elemento en el indice 9
//		numbers.clear();			// Limpia el ArrayList
//		System.out.println(numbers.isEmpty());
//		for (Integer number : numbers) {
//			System.out.println(number);
//		}// for_each
		
//		numbers.forEach((number)->System.out.println(number));
		numbers.forEach((number) -> writeNumber(number));
		
	} //main
	public static void writeNumber(Integer n) {
		System.out.println(n+" * 2 = ");
		System.out.println((n  * 2));
	} //writeNumber
	
	
}// class_ArrayList
