import java.util.*;

import org.generation.Employee;
import org.generation.Manager;
import org.generation.Person;
import org.generation.utils.EmailFormatExcepion;

public class testPerson{

	public static void main(String[] args) {
		Employee patricio = new Employee("Juan Patricio", "jp@hotmail.com", 20, "XAXX00000","La casa de Patricio","TI",450.00);
		Person bren = new Employee("Brenda Granados", "bren@gmail.com", 18, "GAPB040101", "Domicilio conocido","TI",500.50);
		Manager lalo = new Manager("Lalo", "lalo@gmail.com", 18, "LALO040101", "Domicilio conocido","TI",500.50,20,0.20);
		try {
			patricio.setEmail("jpAThotmail.com");
		} catch (EmailFormatExcepion e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}//catch
		bren.printInfo();
		patricio.printInfo();
		System.out.println(Person.getTotal());
		System.out.println(patricio.printReceipt());
	}//main
}//class