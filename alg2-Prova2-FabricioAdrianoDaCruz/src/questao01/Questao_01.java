package questao01;

import java.util.Scanner;

public class Questao_01 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int idx;
		
		Data dataInicio1 = new Data();
		dataInicio1 = lerData();
		
		Data dataFim1 = new Data();
		dataFim1 = lerData();
		
		Periodo periodo1 = new Periodo();
		
		periodo1.inicio = dataInicio1;
		periodo1.fim = dataFim1;
		
		
		Data dataTeste1 = new Data();
		
		dataTeste1 = lerData();
		
		idx = estaDentro(periodo1, dataTeste1);
		
		imprimeResultado(idx);
		
		
		
		Data dataInicio2 = new Data();
		dataInicio2 = lerData();
		
		Data dataFim2 = new Data();
		dataFim2 = lerData();
		
		
		Periodo periodo2 = new Periodo();
		
		periodo2.inicio = dataInicio2;
		periodo2.fim = dataFim2;
		
		Data dataTeste2 = new Data();
		dataTeste2 = lerData();
		
		idx = estaDentro(periodo2, dataTeste2);
		
		imprimeResultado(idx);

	scanner.close();	
	}
	
	public static int estaDentro(Periodo periodo, Data data) {		
		
		if(data.ano >= periodo.inicio.ano && data.ano <= periodo.fim.ano) {
			if(data.mes >= periodo.inicio.mes && data.mes <= periodo.fim.mes) {
				if(data.dia >= periodo.inicio.dia && data.dia <= periodo.fim.dia) {
					return 1;
				}
				else {
					return 0;
				}
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
	}
	
	public static Data lerData() {
		
		Data data = new Data();
		
		data.dia = scanner.nextInt();
		data.mes = scanner.nextInt();
		data.ano = scanner.nextInt();
		scanner.nextLine();
		
		return data;
	}
	
	public static void imprimeResultado(int idx) {
		
		if(idx == 1) {
			System.out.println("Data está dentro do período!");
		}
		else {
			System.out.println("Data NÃO está dentro do período!");
		}
		
	}

}
