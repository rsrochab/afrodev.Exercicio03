package Exercicio03;
import java.util.*;
public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Livro l = new Livro("Os contos de Java", "Rodrigo Rocha", 23);
		l.Alterar(scan);
	}
}
