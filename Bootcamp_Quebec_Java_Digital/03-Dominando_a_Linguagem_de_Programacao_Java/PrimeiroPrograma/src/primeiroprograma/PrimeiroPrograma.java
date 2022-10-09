package primeiroprograma;

import primeiroprograma.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));

	}

}

class Livros {
	private String nome;
	private Integer npag;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNpag() {
		return npag;
	}
	public void setNpag(Integer npag) {
		this.npag = npag;
	}
}