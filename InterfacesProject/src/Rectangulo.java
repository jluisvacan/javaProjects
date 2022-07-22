
public class Rectangulo implements FiguraGeometrica {

	private String name;
	private double altura;
	private double base;
	

	public Rectangulo(String name, double altura, double base) {
		super();
		this.name = name;
		this.altura = altura;
		this.base = base;
	}// constructor

	public double getAltura() {
		return altura;
	}//getAltura

	public void setAltura(double altura) {
		this.altura = altura;
	}//setAltura

	public double getBase() {
		return base;
	}//getBase

	public void setBase(double base) {
		this.base = base;
	}//getBase

	public void setName(String name) {
		this.name = name;
	}//setName

	
	
	@Override
	public String toString() {
		return "Rectangulo [name=" + name + ", altura=" + altura + ", base=" + base + "]";
	}//toString


	@Override
	public double calcularArea() {
		return (getBase()*getAltura());
	}

	@Override
	public double calcularPerimetro() {
		return getBase()*2+getAltura()*2;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
