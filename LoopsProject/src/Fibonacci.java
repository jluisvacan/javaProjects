import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int num;
		System.out.println("Ingresa un número positivo : ");
		num = console.nextInt();
		int cont = 1;
		int m = 1;
		int n = 0;
		int tmp = 0;
		
		System.out.println(n);
//		System.out.println(m);
		
		do {
			n = m;
			m = tmp;
			tmp = m + n;
			
			System.out.println(tmp);
			cont++;
		} while(cont<=num);
	} //main
}// class_Fibonacci
