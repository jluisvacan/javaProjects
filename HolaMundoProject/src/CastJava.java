
public class CastJava {

	public static void main(String[] args) {
//		byte edad = 18;
//		float tmp;
//		
//		tmp = edad;
//		System.out.println(tmp);	
// Conversi�n_implicita
		
		short tmpEdad = 99;
		byte edad = 18;
		int minEdad = 128;
		
		edad = (byte) tmpEdad;
		System.out.println(edad);
		
		edad = (byte) minEdad;
		System.out.println(edad);
// Conversi�n expllicita
	}
	
}
