
public class ForDemo {

	public static void main(String[] args) {
		int total = 0;
		for(int cont=0; cont<=20; cont++) {
			if((cont%2)==0) {
				total += cont;
			} // if %==0
		} // for cont
		System.out.println(total);
	} //main
} //class ForDemo
