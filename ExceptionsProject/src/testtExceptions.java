
public class testtExceptions {

	public static void main(String[] args) {
		
		String nombre = "Jorge";
		int a = 200;
		int b = 0;
//		final: hace una cte
//		finally: Ejecutar algo en un try-catch, manejar el final de la excepcion
//		finalize:Se utilizadba para liberar recursos cuando se ejecuta
		try {
			System.out.println(nombre.charAt(5));
//			System.out.println(a/b); // ArithmeticException
			System.out.println(divide(a,b));
		} catch (ArithmeticException e) {
			System.out.println("No se puede realizar la división");
			if  (e.getMessage().equals("/by zero")) {
				b=1;
				System.out.println("b es igual a cero y no se puede dividir entre cero");
				System.out.println(a/b);
			}//if_zero
			System.out.println(e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("No exixte el número solicitado"); //StringIndexOutOfBoundsException
			System.out.println(e.getMessage());
			System.out.println(nombre);
		} finally {
			System.out.println("fin");
		} //finally
		
	}//main
	public static int divide(int a, int b) throws ArithmeticException	{
		return a/b;
	}//divide
}//class
