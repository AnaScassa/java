package aula03;

// precisa mudar para interface aqui para ser um controller
public interface ControllerControleRemoto {
	
	public abstract void ligar();
	public abstract void desligar();
	public abstract void abrirMenu();
	public abstract void maisVolume();
	public abstract void menosVolume();
	public abstract void ligarMudo();
	public abstract void play();
	public abstract void pause();
}
