
public class TiposDeDatos {

	public static void main(String[] args) {
//		int a=0, b=0, c=1;
//		byte edad=0;
		
		System.out.println("Propiedades de byte");
		System.out.println(Byte.MIN_VALUE); // -128
		System.out.println(Byte.MAX_VALUE); // 127
		System.out.println(Byte.SIZE);		// 8
		System.out.println(Byte.BYTES);		// 1
		System.out.println(Byte.TYPE);		// byte
		
		System.out.println("Propiedades de short");
		System.out.println(Short.MIN_VALUE); // -32768
		System.out.println(Short.MAX_VALUE); // 32767
		System.out.println(Short.SIZE);		// 16
		System.out.println(Short.BYTES);		// 2
		System.out.println(Short.TYPE);			// short
		
		System.out.println("Propiedades de int");
		System.out.println(Integer.MIN_VALUE); // -2147483648
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.SIZE);		// 32
		System.out.println(Integer.BYTES);		// 4
		System.out.println(Integer.TYPE);		// int
		
		System.out.println("Propiedades de long");
		System.out.println(Long.MIN_VALUE); // -9223372036854775808
		System.out.println(Long.MAX_VALUE); // 9223372036854775807
		System.out.println(Long.SIZE);		// 64
		System.out.println(Long.BYTES);		// 8
		System.out.println(Long.TYPE); 		// long
		
		System.out.println("Propiedades de boolean");
		System.out.println(Boolean.TRUE); // true
		System.out.println(Boolean.FALSE); // false
		System.out.println(Boolean.TYPE);		// Boolean
		
		System.out.println("Propiedades de char");
		System.out.println(Character.MIN_VALUE); // Caracter nulo
		System.out.println(Character.MAX_VALUE); // Bloque especial
		System.out.println(Character.SIZE);		// 16
		System.out.println(Character.BYTES);	// 2
		System.out.println(Character.TYPE);// char
		
		System.out.println("Propiedades de float");
		System.out.println(Float.MIN_VALUE); // 1.4E-45
		System.out.println(Float.MAX_VALUE); // 33.4028235E38
		System.out.println(Float.SIZE);		// 32
		System.out.println(Float.BYTES);	// 4
		System.out.println(Float.TYPE);// float
		
		System.out.println("Propiedades de double");
		System.out.println(Double.MIN_VALUE); // 4.9E-324
		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(Double.SIZE);	// 64
		System.out.println(Double.BYTES);	// 8
		System.out.println(Double.TYPE);// double
//		System.out.println(edad);

	} // main

} // class tipos de datos
