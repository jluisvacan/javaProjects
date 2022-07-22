
public class testFiguras {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Triangulo 1", 20.0, 10.0, 15.0);
		Triangulo t2 = new Triangulo("Bermudas 1", 87.0, 121.50, 107.20);
		Cuadrado c1 = new Cuadrado("Cubito 1", 100);
		Rectangulo r1 = new Rectangulo("Rectangulin 1", 100,50);
		imprimeCalculo(t1);imprimeCalculo(t2);
		imprimeCalculo(r1);
		imprimeCalculo(c1);
	}//main

	public static void imprimeCalculo(FiguraGeometrica t ) {
		System.out.println("+=========================+");
		System.out.println("El área de: [" + t.getName()+"] es : " + t.calcularArea() +"\n"+
							"El perimetro de: [" + t.getName()+"] es : " + t.calcularPerimetro() +"\n");
		System.out.println("+=========================+");
	}//imprimeCalculo
	
}//classTestFiguras
