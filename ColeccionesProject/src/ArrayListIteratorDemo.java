import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(35);				numbers.add(33);			numbers.add(42);
		numbers.add(10);				numbers.add(14);			numbers.add(19);
		numbers.add(27);				numbers.add(44);			numbers.add(26);
		numbers.add(31);				numbers.add(31);			numbers.add(45);
		
		Iterator<Integer> iterator = numbers.iterator();
		
		int cont = 0;
		while(iterator.hasNext()) {
			cont += iterator.next();
		}//while
//		cont + iterator.next();  noSuchElementException
		System.out.println(cont);
	}//main
}//class
