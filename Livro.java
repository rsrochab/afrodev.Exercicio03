package Exercicio03;
import java.util.*;

public class Livro {

	String titulo, autor, a;
	int paginas;

	public Livro() {

		this.titulo = "Os contos de Java";
		this.autor = "Rodrigo Rocha";
		this.paginas = 23;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	void Alterar(Scanner scan) {
		
		System.out.println("-------------------");
		System.out.println("Digite o nome do livro para altera-lo ");
		a = scan.nextLine();
		System.out.println("Erro, não é possível alterar o nome do livro!");

		
	}
}
