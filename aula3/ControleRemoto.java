package aula03;

import java.util.Iterator;

public class ControleRemoto  implements ControllerControleRemoto{

	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//contrutor
	//posso não passar parametros no construtor
	public ControleRemoto() {
		super();
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	//getters and setters
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	//metodos
	//lembrando que se eu colcar private nos métodos não vai ser
	//possivel adicionar na main
	@Override
	public void ligar() {
		if(isLigado() == true) {
			System.out.println("Tv já ligada");
		}else {
			System.out.println("Tv ligada");
			this.setLigado(true); 
		}
	}

	@Override
	public void desligar() {
		if(isLigado() == false) {
			System.out.println("Tv já desligada");
		}else {
			System.out.println("Tv desligada");
			this.setLigado(false); 
		}
	}

	@Override
	public void abrirMenu() {
		System.out.println("---Informações do Sistema---");
		if (isLigado() == true) {
			System.out.println("A tv está ligada");
		}else {
			System.out.println("A tv está desligada");
		}
		if (isTocando() == true) {
			System.out.println("A tv está tocando");
		}else {
			System.out.println("A tv não esta tocando");
		}
		System.out.println("O volume é " + getVolume());
		for(int i = 0; i < getVolume(); i= i+ 10) {
		System.out.print("|");
		}
		System.out.println("\n");
	}

	@Override
	public void maisVolume() {
		if(getVolume() < 100) {
			this.setVolume(getVolume() + 5);
			System.out.println("Volume atual: " + getVolume());
		}else {
			System.out.println("Volume máximo");
		}
	}

	@Override
	public void menosVolume() {
		if(getVolume() > 0) {
			this.setVolume(getVolume() - 5);
			System.out.println("Volume atual: " + getVolume());
		}else {
			System.out.println("Volume minimo já");
		}
	}

	@Override
	public void ligarMudo() {
		if(getVolume() > 0) {
			this.setVolume(getVolume() - getVolume());
			System.out.println("Volume atual: " + getVolume());
		}else {
			System.out.println("Volume minimo já");
		}
	}
	
	@Override
	public void play() {
		if(isTocando() == false) {
			this.setTocando(true);
			System.out.println("Começando...");
		}else {
			System.out.println("Já esta passando");
		}
	}

	@Override
	public void pause() {
		if(isTocando() == true) {
			this.setTocando(false);
			System.out.println("Passando...");
		}else {
			System.out.println("Já esta pausado");
		}
	}
}
