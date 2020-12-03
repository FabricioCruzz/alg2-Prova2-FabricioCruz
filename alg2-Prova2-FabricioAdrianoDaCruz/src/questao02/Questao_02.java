package questao02;

import java.util.Scanner;


public class Questao_02 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Ponto p1 = new Ponto();
		p1 = lerPonto();
		
		Ponto p2 = new Ponto();
		p2 = lerPonto();
		
		questao02.Retangulo retangulo = new Retangulo();
		
		retangulo.inicio = p1;
		retangulo.fim = p2;
		
		Ponto pontoTeste1 = new Ponto();
		pontoTeste1 = lerPonto();
		
		boolean estaDentro = estaDentro(retangulo, pontoTeste1);
		
		imprimeResultado(estaDentro);
		
		scanner.close();
	}
	
	public static boolean estaDentro(Retangulo retangulo, Ponto p) {
	
		return p.x >= retangulo.inicio.x && p.y <= retangulo.inicio.y
				&& p.x <= retangulo.fim.x && p.y <= retangulo.fim.y;
	}
	
public static Ponto lerPonto() {
		
		Ponto ponto = new Ponto();
		
		ponto.x = scanner.nextInt();
		ponto.y = scanner.nextInt();
		scanner.nextLine();
		
		return ponto;
	}
	
	public static void imprimeResultado(boolean resultado) {
		
		if(resultado) {
			System.out.println("Ponto está DENTRO do Retângulo!");
		}
		else {
			System.out.println("Ponto NÃO está dentro do Retângulo!");
		}
		
	}
}
