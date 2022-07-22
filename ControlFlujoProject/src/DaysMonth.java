import java.util.Scanner;

public class DaysMonth {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe el número del mes entre 1 y 12 del que quieras saber su total de días");
		int month = (new Scanner(System.in)).nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println("El mes tiene 30 días");
			break;
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes tiene 31 días");
			break;
		default: System.out.println("El mes tiene 28/29 días");
			break;
		}
	}

}
