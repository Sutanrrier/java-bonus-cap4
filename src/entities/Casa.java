package entities;

public class Casa {
	public String cor;
	public Porta porta1, porta2, porta3;
	
	public void pinta(String cor) {
		System.out.println("Você pintou a casa de " + cor);
	}
	
	public int quantasPortasEstaoAbertas() {
		int quantidade = 0;
		if(porta1.aberta == true) {
			quantidade++;
		}
		if(porta2.aberta == true) {
			quantidade++;
		}
		if(porta3.aberta == true) {
			quantidade++;
		}
		return quantidade;
	}
	
}
