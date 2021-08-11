import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String frase, sc, so, ifs ,la;
		String scan = "Scanner scan = new Scanner(System.in);";
		String print = "System.out.println()";
		double num;
		String linha = "---------------------";
		
		String pv[] = {"private", "public", "if", "else", "try"};
		
		
		System.out.println("Informe uma frase:");
		frase = s.nextLine();
		
		System.out.println("Informe um numero:");
		num = s.nextDouble();	
		
		System.out.println(linha+"Informando palavra(s) e numero(s) inseridos!"+ linha);
		System.out.println("\n" + frase + "\n");
		System.out.println(num + "\n");
		
		//Verificar frase
		int k = 0 ;
		int o = 0 ;
		
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if(c == '\"') {
				for (int j = i+1; j < frase.length(); j++) {
					char a = frase.charAt(j);
					if(a == '\"') {
						k++;
					}
				}
			}
			
			if(c == '\'') {
				for (int j = i+1; j < frase.length(); j++) {
					char b = frase.charAt(j);
					if(b == '\'') {
						o++;
					}
				}
			}
		}
		
		System.out.println(linha+"Reconhecendo e informando o Literal inserido (String ou Char)"+ linha);

		if(k == 0 ) {
			System.out.println("ERRO: Nao há String!");
		}else if(k % 2 == 1 ){
			System.out.println("Há frase(s), (String)!");
		}else {
			System.out.println("ERRO no reconhecimento da String: Nao há String!");
		}
		
		if(o == 0 ) {
			System.out.println("ERRO: Nao há char!");
		}else if (o % 2 == 1){
			System.out.println("Há letra(s), (char)!");
		}else {
			System.out.println("ERRO no reconhecimento do Char: Nao há Char!");
		}
		
		//Verificar numero
		String str_num = String.valueOf(num);
		int w = 0;
		
		for (int i = 0; i < str_num.length(); i++) {
			char c = str_num.charAt(i);
				if(c == '.') {
					for (int j = i+1 ; j < str_num.length(); j++) {
						char a = str_num.charAt(j);
							if(a != '0') {
								w++;
						}
							
					}
				}
		}
		
		System.out.println(linha+"Reconhecendo o tipo do número inserido (Real ou Inteiro)"+ linha);
		
		if(w == 0) {
			System.out.println("O numero inserido é INTEIRO!");
		}else {
			System.out.println("O numero inserido é REAL!");
		}
		//Verificar palavra se é uma nome ou uma palavra reservada
		int p = 0;
		for (int i = 0; i < pv.length; i++) {
			if(frase.toLowerCase().contains(pv[i])) {
				p++;
			}
		}
		
		System.out.println(linha+"Reconhecendo o tipo String inserido (Nome ou Palavra-Chave/Comando)"+ linha);
		if(p == 0 ) {
			System.out.println("É um nome!");
		}else {
			System.out.println("É uma palavra chave!");
		}
		
		s.nextLine();
		System.out.println(linha+"Reconhecendo comandos  "+ linha);
		
		
		System.out.println("\nInforme o comando de leitura: ");
		sc = s.nextLine();
		
		if(sc.toLowerCase().contains(scan.toLowerCase())) {
			System.out.println("Comando de leitura correto! ");
		}else {
			System.out.println("Comando de leitura incorreto! ");
		}
		
		System.out.println("\nInforme o comando de apresentação na tela: ");
		so = s.nextLine();
		
		if(so.toLowerCase().contains(print.toLowerCase())) {
			System.out.println("Comando de  apresentação na tela correto! ");
		}else {
			System.out.println("Comando de  apresentação na tela incorreto! ");
		}
		
		System.out.println("\nInforme o comando de comparação: ");
		ifs = s.nextLine();
		
		if(ifs.toLowerCase().contains("if")) {
			System.out.println("Comando de  comparação correto! ");
		}else {
			System.out.println("Comando de  comparação incorreto! ");
		}
		
		System.out.println("\nInforme o comando de laço: ");
		la = s.nextLine();
		
		if(la.toLowerCase().contains("while")) {
			System.out.println("Comando de laço correto! ");
		}else {
			System.out.println("Comando de laço incorreto! ");
		}
		
	}
}
