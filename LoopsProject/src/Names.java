import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		System.out.println("Ingresa un nombre");
		name = in.nextLine();
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));;
		} //for_i		
	}//main
}// class_Names
