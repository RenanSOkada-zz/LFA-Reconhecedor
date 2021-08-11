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
			System.out.println("ERRO: Nao h� String!");
		}else if(k % 2 == 1 ){
			System.out.println("H� frase(s), (String)!");
		}else {
			System.out.println("ERRO no reconhecimento da String: Nao h� String!");
		}
		
		if(o == 0 ) {
			System.out.println("ERRO: Nao h� char!");
		}else if (o % 2 == 1){
			System.out.println("H� letra(s), (char)!");
		}else {
			System.out.println("ERRO no reconhecimento do Char: Nao h� Char!");
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
		
		System.out.println(linha+"Reconhecendo o tipo do n�mero inserido (Real ou Inteiro)"+ linha);
		
		if(w == 0) {
			System.out.println("O numero inserido � INTEIRO!");
		}else {
			System.out.println("O numero inserido � REAL!");
		}
		//Verificar palavra se � uma nome ou uma palavra reservada
		int p = 0;
		for (int i = 0; i < pv.length; i++) {
			if(frase.toLowerCase().contains(pv[i])) {
				p++;
			}
		}
		
		System.out.println(linha+"Reconhecendo o tipo String inserido (Nome ou Palavra-Chave/Comando)"+ linha);
		if(p == 0 ) {
			System.out.println("� um nome!");
		}else {
			System.out.println("� uma palavra chave!");
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
		
		System.out.println("\nInforme o comando de apresenta��o na tela: ");
		so = s.nextLine();
		
		if(so.toLowerCase().contains(print.toLowerCase())) {
			System.out.println("Comando de  apresenta��o na tela correto! ");
		}else {
			System.out.println("Comando de  apresenta��o na tela incorreto! ");
		}
		
		System.out.println("\nInforme o comando de compara��o: ");
		ifs = s.nextLine();
		
		if(ifs.toLowerCase().contains("if")) {
			System.out.println("Comando de  compara��o correto! ");
		}else {
			System.out.println("Comando de  compara��o incorreto! ");
		}
		
		System.out.println("\nInforme o comando de la�o: ");
		la = s.nextLine();
		
		if(la.toLowerCase().contains("while")) {
			System.out.println("Comando de la�o correto! ");
		}else {
			System.out.println("Comando de la�o incorreto! ");
		}
		
	}
}
