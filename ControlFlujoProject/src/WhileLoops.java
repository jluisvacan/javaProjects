import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		System.out.print("Ingrese un número ");
		int cont = 1, n=0, tmp=0, m=1;
		int num;
		System.out.println(n);
		System.out.println(m);
		Scanner console = new Scanner(System.in);
        num = console.nextInt();
        
        int i = 1;
		do {
			tmp = m+n;
			n = m; 
			m = tmp;
			System.out.println(tmp);
			cont++;
		} while (cont<=num); 
	}

}
