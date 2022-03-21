package entities;

public class Porta {
	public String cor;
	public double dimensaoX, dimensaoY, dimensaoZ;
	public boolean aberta;

	public void abre() {
		this.aberta = true;
		System.out.println("Voc� abriu esta porta!");
	}
	public void fecha() {
		this.aberta = false;
		System.out.println("Voc� fechou esta porta!");
	}
	public void pinta(String cor) {
		System.out.println("Voc� pintou esta porta de " + cor);
	}
	public boolean estaAberta() {
		return (aberta == true) ? true : false;
	}
}