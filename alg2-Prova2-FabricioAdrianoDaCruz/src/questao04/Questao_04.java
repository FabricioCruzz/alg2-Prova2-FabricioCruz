package questao04;

import java.util.Scanner;

public class Questao_04 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo();
		
		retangulo = lerRetangulo();
		
		System.out.println("xIni = " + retangulo.xIni);
		System.out.println("xFim = " + retangulo.xFim);
		
		System.out.println("yIni = " + retangulo.yIni);
		System.out.println("yFim = " + retangulo.yFim);
		scanner.close();
	}
	
	public static Retangulo lerRetangulo() {
		
		Retangulo lerRetangulo = new Retangulo();
		
		lerRetangulo.xIni = scanner.nextInt();
		lerRetangulo.xFim = scanner.nextInt();
		
		lerRetangulo.yIni = scanner.nextInt();
		lerRetangulo.yFim = scanner.nextInt();
		scanner.nextLine();
		
		
		return lerRetangulo;
	}

}
