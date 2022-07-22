
public class Cuadrado implements FiguraGeometrica{
	private String name;
	private double lado;
	
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	}//constructor

	public double calcularArea() {
		return (this.getLado()*this.getLado());
	}//calcular_área
	
	public double calcularPerimetro() {
		return (this.getLado()*4);
	}//calcular_perimetro
	
	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	public double getLado() {
		return lado;
	}//getLado

	public void setLado(double lado) {
		this.lado = lado;
	}//setLado

	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}//toString
	
	
	
	
}//classCuadrado
