package classes;

public class Canetas {

	//Aqui eu criei as caracteristicas que as canetas teriam de padrao
	private String cor;
	private String marca;
	private boolean tampada;
	private int carga;
	
	//construtor para inicializar 
	public Canetas(String cor, String marca, boolean tampada, int carga) {
		super();
		this.cor = cor;
		this.marca = marca;
		this.tampada = tampada;
		this.carga = carga;
	}

	//get and set pq os atributos são private para usar em outra classe
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	
}
