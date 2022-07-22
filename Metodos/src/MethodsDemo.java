import org.generation.utils.Aritmetica;
import org.generation.utils.Otros;


public class MethodsDemo {

	public static void main(String[] args) {
		// MethodsDemo m = new MethodsDemo();
//System.out.println(suma(256,256));
//	}
//// Los metodos no llevan espacios, empezar con numeros, o carcteres especiales que no sean guiones
//	public static int suma(int a, int b) {
//		return a + b ;
//	} // suma

		Aritmetica ari = new Aritmetica();
		
		System.out.println(ari.suma(128, 128));
		System.out.println(ari.suma(128, 128, 128));
		System.out.println(ari.suma((float)128.2, 128.4F));
		System.out.println(ari.cuadrado(5));
		System.out.println(Otros.multiplica(78, 12));
		
} //class Methods
}