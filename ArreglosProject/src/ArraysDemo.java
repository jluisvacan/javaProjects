import java.lang.reflect.Array;

public class ArraysDemo {

	public static void main(String[] args) {
		String [] meses = {"Ene", "Feb", "Mar", "Abr","May","Jun","Jul",
				"Ago","Sep","Oct","Nov","Dic"};
		meses[0] = "Ene";
		meses[1] = "Feb";
		
		
		
		String temp [] = Array.copyOf(meses.length, 6);
		meses = new String[20];
		
		System.out.println(meses.length);
//		System.out.println(meses[12]); // ArrayIndexOutOfBoundsException
	
		for(int i = 0; i<meses.length; i++) {
			System.out.println(i + "->" + meses[i]);
		} //fori
		
		for (String mes : temp) {
		System.out.println(mes);
	}//foreach
}//class
}
